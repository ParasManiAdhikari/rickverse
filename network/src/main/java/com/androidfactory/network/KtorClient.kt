package com.androidfactory.network

import com.androidfactory.network.models.domain.Character
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class KtorClient {
    private val client = HttpClient(OkHttp) {
        defaultRequest { url("https://rickandmortyapi.com/api/") }

        install(ContentNegotiation){
            json(Json {
                ignoreUnknownKeys = true;
            })
        }
    }

    suspend fun getCharacter(id:Int) : Character{
        return client.get("character/$id").body()
    }
}