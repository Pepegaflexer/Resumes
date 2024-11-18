package resume

import kotlinx.serialization.Serializable

@Serializable
data class Resume(
    val id: Int,
    val candidateInfo: CandidateInfo,
    val education: List<Education>,
    val jobExperience: List<JobExperience>,
    val freeForm: String,
)
