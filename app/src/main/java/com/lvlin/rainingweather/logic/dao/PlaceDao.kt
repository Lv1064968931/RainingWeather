package com.lvlin.rainingweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.lvlin.rainingweather.RainingWeatherApplication
import com.lvlin.rainingweather.logic.model.Place

object PlaceDao {

    fun savePlace(place: Place) {
        sharedPreferences().edit(){
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    fun sharedPreferences() = RainingWeatherApplication.context.
            getSharedPreferences("raining_weather", Context.MODE_PRIVATE)
}