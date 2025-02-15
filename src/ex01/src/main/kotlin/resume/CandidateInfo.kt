package resume

import kotlinx.serialization.Serializable

@Serializable
data class CandidateInfo(
    val name: String,
    val profession : String,
    val sex: String,
    val birthDate: String,
    val contacts: Contacts,
    val relocation: String,
)
