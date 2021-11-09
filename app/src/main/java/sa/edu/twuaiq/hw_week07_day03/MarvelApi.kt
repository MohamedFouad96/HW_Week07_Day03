package sa.edu.twuaiq.hw_week07_day03

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelApi {

    @GET ("/demos/marvel/") // path

    fun getListMarvel(
     // variables
        @Query("/demos/marvel/") Marvel : Int
    ) : Call<List<MarvelModel>>
}