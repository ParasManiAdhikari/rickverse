package com.androidfactory.network

import com.androidfactory.network.models.domain.Character
import com.androidfactory.network.models.domain.Episode
import com.androidfactory.network.models.remote.RemoteCharacter
import com.androidfactory.network.models.remote.RemoteEpisode
import com.androidfactory.network.models.remote.toDomainCharacter
import com.androidfactory.network.models.remote.toDomainEpisode
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

    suspend fun getCharacter(id: Int): Character {
        return client.get("character/$id")
            .body<RemoteCharacter>()
            .toDomainCharacter()
    }

    suspend fun getEpisodes(episodeIds: List<Int>): List<Episode> {
        val idsCommaSeparated = episodeIds.joinToString(separator = ",")
        return client.get("episode/$idsCommaSeparated")
            .body<List<RemoteEpisode>>()
            .map { it.toDomainEpisode() }
    }
}