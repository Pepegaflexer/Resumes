package resume

import kotlinx.serialization.Serializable

@Serializable
data class Education(
    val type: String,
    val yearStart: String,
    val yearEnd: String,
    val description: String,
)
