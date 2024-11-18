package com.example

import listOfCompanies.SmallFormatCompany
import listOfCompanies.companies
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import listOfCompanies.Company
import org.jetbrains.annotations.Async.Execute
import resume.UpdateResume
import resume.resumes
import vacancies.vacancies

fun Application.configureRouting() {
    routing {
        get("/companies") {
            call.respond(companies.map {
                SmallFormatCompany(it.name, it.industry)
            })
        }

        get("/companies/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()
            if (id == null) {
                call.respond(HttpStatusCode.BadRequest, "Некорректный ID")
                return@get
            }

            val company = companies.find { it.id == id }
            if (company == null) {
                call.respond(HttpStatusCode.NoContent)
            } else {
                call.respond(company)
            }
        }

        get("/vacancies") {
            call.respond(vacancies)
        }

        get("/vacancies/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()
            if (id == null) {
                call.respond(HttpStatusCode.BadRequest, "Некорректный ID")
                return@get
            }

            val vacancy = vacancies.find { it.id == id }
            if (vacancy == null) {
                call.respond(HttpStatusCode.NoContent)
            } else {
                call.respond(vacancy)
            }
        }

        get("/resumes") {
            call.respond(resumes)
        }

        get("/resumes/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()
            if (id == null) {
                call.respond(HttpStatusCode.BadRequest, "Некорректный ID")
                return@get
            }

            val resume = resumes.find { it.id == id }
            if (resume == null) {
                call.respond(HttpStatusCode.NoContent)
            } else {
                call.respond(resume)
            }
        }

        put("/changeResume/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()
            if (id == null) {
                call.respond(HttpStatusCode.BadRequest, "Некорректный ID")
                return@put
            }

            val updateData = try {
                call.receive<UpdateResume>()
            } catch (e: Exception) {
                call.respond(HttpStatusCode.BadRequest, "Ошибка при получении данных для обновления")
                return@put
            }

            val index = resumes.indexOfFirst { it.id == id }
            if (index == -1) {
                call.respond(HttpStatusCode.NotFound, "Резюме с таким Id не найдено")
            } else {
                val currentResume = resumes[index]
                val updateResume = currentResume.copy(
                    candidateInfo = updateData.candidateInfo ?: currentResume.candidateInfo,
                    jobExperience = updateData.jobExperience ?: currentResume.jobExperience,
                    education = updateData.education ?: currentResume.education,
                    freeForm = updateData.freeForm ?: currentResume.freeForm,
                )
                println("Обновленное резюме: $updateResume")
                call.respond(HttpStatusCode.OK, "Резюме обновлено успешно")
            }
        }
    }
}



