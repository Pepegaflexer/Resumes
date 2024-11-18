package listOfCompanies

import kotlinx.serialization.Serializable

@Serializable
data class SmallFormatCompany(
    val name: String,
    val industry: String
)
