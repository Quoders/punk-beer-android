package com.quoders.app.android.punkbeer.data.remote.model.beers

data class BeersRemoteData(
    val abv: Float?,
    val attenuation_level: Float,
    val boil_volume: BoilVolume,
    val brewers_tips: String,
    val contributed_by: String,
    val description: String,
    val ebc: Float?,
    val first_brewed: String,
    val food_pairing: List<String>,
    val ibu: Float?,
    val id: Float,
    val image_url: String,
    val ingredients: Ingredients,
    val method: Method,
    val name: String,
    val ph: Float?,
    val srm: Float?,
    val tagline: String,
    val target_fg: Float,
    val target_og: Float,
    val volume: Volume
)