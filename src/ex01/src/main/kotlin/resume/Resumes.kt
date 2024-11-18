package resume

val resumes = listOf(
    Resume(
        id = 1,
        candidateInfo = CandidateInfo(
            name = "Vasiliev Sergei Petrovich",
            profession = "QA",
            sex = "male",
            birthDate = "30.09.1998",
            contacts = Contacts(
                phone = "72938572843",
                email = "vspetrovich@pochta.ru"
            ),
            relocation = "possible"
        ),
        education = listOf(
            Education(
                type = "higher",
                yearStart = "2017",
                yearEnd = "2021",
                description = "Mathematics in state university"
            ),
            Education(
                type = "secondary special",
                yearStart = "2013",
                yearEnd = "2017",
                description = "College of informatics"
            )
        ),
        jobExperience = listOf(
            JobExperience(
                dateStart = "08.2021",
                dateEnd = "04.2022",
                companyName = "FinTech",
                description = "Some fintech company creating a business platform"
            )
        ),
        freeForm = "I'm a QA specialist from head to heels. I enjoy finding and fixing bugs."
    ),
    Resume(
        id = 2,
        candidateInfo = CandidateInfo(
            name = "Ivanova Ekaterina Andreevna",
            profession = "Software Developer",
            sex = "female",
            birthDate = "15.04.1995",
            contacts = Contacts(
                phone = "83472837423",
                email = "ekaterina.ivanova@pochta.ru"
            ),
            relocation = "not possible"
        ),
        education = listOf(
            Education(
                type = "higher",
                yearStart = "2013",
                yearEnd = "2017",
                description = "Software Engineering in technical university"
            )
        ),
        jobExperience = listOf(
            JobExperience(
                dateStart = "09.2017",
                dateEnd = "12.2020",
                companyName = "WebSoft",
                description = "Developed web applications for e-commerce"
            ),
            JobExperience(
                dateStart = "01.2021",
                dateEnd = "present",
                companyName = "TechCorp",
                description = "Backend developer, creating scalable services."
            )
        ),
        freeForm = "I love building reliable and scalable software. Passionate about clean code."
    )
)