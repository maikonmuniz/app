package com.example.ctre

import android.util.Log
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.net.URL

object ForumService {

    val host = "https://lhenriquesth.pythonanywhere.com"
    val TAG = "WS_LMSApp"

    fun getForum() : List<Forum>{

//        val url = "$host/foruns"
//        val json = HttpHelper.get(url)
//        Log.d(TAG, json)

//        return parserJson<List<Forum>>(json)

        return DatabaseManager.getForumDAO().findAll()
    }

    fun saveForum(forum: Forum){
//        val json = GsonBuilder().create().toJson(forum)
//        HttpHelper.post("$host/foruns", json)
        DatabaseManager.getForumDAO().insert(forum)
    }

    inline fun <reified T> parserJson(json: String): T{
        val type = object: TypeToken<T>(){}.type
        return Gson().fromJson<T>(json, type)
    }
}