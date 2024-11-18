package resume

import kotlinx.serialization.Serializable

@Serializable
data class JobExperience(
    val dateStart: String,
    val dateEnd: String,
    val companyName: String,
    val description: String,
)
