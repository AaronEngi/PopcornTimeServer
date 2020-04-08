package wang.tyrael.popcorntimeserver.original;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import wang.tyrael.http.simpleapi.HttpDefault;
import wang.tyrael.popcorntimeserver.original.PopcornOriginalUrl;
import wang.tyrael.popcorntimeserver.protocol.MovieListResponse;

import java.io.IOException;

public class PopcornApi {
    public MovieListResponse requestMovies() throws IOException {
        Response response = HttpDefault.get(PopcornOriginalUrl.getMoviesUrl());
        String body = response.body().string();
//        System.out.println(body);
        return new Gson().fromJson(body, MovieListResponse.class);
    }
}
