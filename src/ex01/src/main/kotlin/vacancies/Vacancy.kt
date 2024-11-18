package vacancies

import kotlinx.serialization.Serializable

@Serializable
data class Vacancy(
    val id: Int,
    val jobTitle: String,
    val candidateLevel: String,
    val salary: String,
    val description: String,
    val companyName: String,
)
