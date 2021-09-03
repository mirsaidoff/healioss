package uz.mirsaidoff.healioss.data

import retrofit2.http.GET
import uz.mirsaidoff.healioss.utils.Constants

interface ApiService {

    @GET(Constants.GET_POSTS)
    suspend fun getPosts(): List<Post>

    @GET(Constants.GET_USERS)
    suspend fun getUsers(): List<User>

    @GET(Constants.GET_COMMENTS)
    suspend fun getComments(): List<Comment>
}