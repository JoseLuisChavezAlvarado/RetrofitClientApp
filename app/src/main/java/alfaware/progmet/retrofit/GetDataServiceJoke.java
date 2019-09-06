package alfaware.progmet.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataServiceJoke {

    @GET("/jokes/random")
    Call<Joke> get();

}
