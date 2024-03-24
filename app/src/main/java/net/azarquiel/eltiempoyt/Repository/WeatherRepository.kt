package net.azarquiel.eltiempoyt.Repository

import net.azarquiel.eltiempoyt.Server.ApiServices

class WeatherRepository (val api: ApiServices) {
    fun getCurrentWeather(lat:Double, lng:Double, unit:String){
        api.getCurrentWeather(lat,lng,unit,"0fa7a3560694d5a2d512683f715b83f4\n")
    }
}