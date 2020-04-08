package wang.tyrael.popcorntimeserver.original;

import com.google.gson.Gson;
import org.junit.Test;
import wang.tyrael.popcorntimeserver.protocol.MovieListResponse;

import java.io.IOException;

public class PopcornApiTest {
    @Test
    public void testRequestMovies() throws IOException {
        MovieListResponse movieListResponse = new PopcornApi().requestMovies();
        System.out.println(new Gson().toJson(movieListResponse));
    }
}
