package listOfCompanies

import kotlinx.serialization.Serializable

@Serializable
data class Company(
    var id: Int,
    val name: String,
    val industry: String,
    val vacancies: List<String> = emptyList(),
    val contacts: String,
)