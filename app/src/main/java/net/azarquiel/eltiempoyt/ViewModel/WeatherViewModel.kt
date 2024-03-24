package net.azarquiel.eltiempoyt.ViewModel

import androidx.lifecycle.ViewModel
import net.azarquiel.eltiempoyt.Repository.WeatherRepository
import net.azarquiel.eltiempoyt.Server.ApiClient
import net.azarquiel.eltiempoyt.Server.ApiServices

class WeatherViewModel (val repository: WeatherRepository):ViewModel(){
    constructor():this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat:Double, lng:Double, unit:String){
        repository.getCurrentWeather(lat,lng,unit)
    }
}