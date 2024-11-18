package resume

import kotlinx.serialization.Serializable

@Serializable
data class UpdateResume(
    val candidateInfo: CandidateInfo? = null,
    val education: List<Education>? = null,
    val jobExperience: List<JobExperience>? = null,
    val freeForm: String? = null,
)
