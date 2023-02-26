package com.exraion.beu.data.source.remote.api.model.ingredient

import com.google.gson.annotations.SerializedName

data class IngredientResponse(
    @field:SerializedName("menu_id")
    val menuId: String,

    @field:SerializedName("ingredients")
    val ingredients: List<String>
)
