package fr.isen.bouchut.isensmartcompanion.network

import fr.isen.bouchut.isensmartcompanion.models.EventModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("events.json")
    fun getEvents(): Call<List<EventModel>>
}
