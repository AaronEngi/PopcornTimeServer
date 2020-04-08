package wang.tyrael.popcorntimeserver.original;

public class PopcornOriginalUrl {
    public static final String BASE_URL = "http://api.rundomforapi.biz";
    //http://api.rundomforapi.biz/list?ver=3.0.0&os=ANDROID&genre=all&sort=seeds&page=1&app_id=T4P_AND&quality=480p,720p,1080p
    public static final String MOVIES_URL = "/list?ver=3.0.0&os=ANDROID&genre=all&sort=seeds&page=1&app_id=T4P_AND&quality=480p,720p,1080p";

    public static String getMoviesUrl() {
        return BASE_URL + MOVIES_URL;
    }
}
