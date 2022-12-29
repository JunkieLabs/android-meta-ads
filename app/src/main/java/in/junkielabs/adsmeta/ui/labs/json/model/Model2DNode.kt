package `in`.junkielabs.adsmeta.ui.labs.json.model

import `in`.junkielabs.adsmeta.domain.template.enitity.ModelGradient


data class Model2DNode(

    val color: String?,
    val cns: ModelAdCns?,
    val bound: ModelBound?,
    val gradient: ModelGradient?,
    val senseLevel: Int = 0
)
