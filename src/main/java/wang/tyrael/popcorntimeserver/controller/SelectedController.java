package wang.tyrael.popcorntimeserver.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.tyrael.popcorntimeserver.protocol.MovieListResponse;

@RestController
public class SelectedController {
    @RequestMapping("selected")
    public MovieListResponse get() {
        String json = "{\n" +
                "    \"MovieList\": [\n" +
                "        {\n" +
                "            \"actors\": \"\",\n" +
                "            \"description\": \"An American expat tries to sell off his highly profitable marijuana empire in London, triggering plots, schemes, bribery and blackmail in an attempt to steal his domain out from under him.\",\n" +
                "            \"directors\": \"\",\n" +
                "            \"genres\": [\n" +
                "                \"action\"\n" +
                "            ],\n" +
                "            \"id\": \"8367814\",\n" +
                "            \"imdb\": \"tt8367814\",\n" +
                "            \"items\": [\n" +
                "                {\n" +
                "                    \"durability\": 0.8201058,\n" +
                "                    \"file\": \"The.Gentlemen.2019.1080p.WEBRip.x264-RARBG.mp4\",\n" +
                "                    \"id\": \"cdb924bced410160afcbe1c58cf182dc10360447\",\n" +
                "                    \"language\": \"\",\n" +
                "                    \"quality\": \"1080p\",\n" +
                "                    \"size_bytes\": 2319282339,\n" +
                "                    \"torrent_magnet\": \"magnet:?xt=urn:btih:cdb924bced410160afcbe1c58cf182dc10360447&dn=The.Gentlemen.2019.1080p.WEBRip.x264-RARBG&tr=http%3A%2F%2Ftracker.trackerfix.com%3A80%2Fannounce&tr=udp%3A%2F%2F9.rarbg.me%3A2750&tr=udp%3A%2F%2F9.rarbg.to%3A2980\",\n" +
                "                    \"torrent_peers\": 4501,\n" +
                "                    \"torrent_seeds\": 1424,\n" +
                "                    \"torrent_url\": \"\",\n" +
                "                    \"vitality\": 0.43241543\n" +
                "                },\n" +
                "                {\n" +
                "                    \"durability\": 0.6380328,\n" +
                "                    \"file\": \"The.Gentlemen.2019.720p.WEBRip.XviD.AC3-FGT.avi\",\n" +
                "                    \"id\": \"f356104fe13ed4628d2907773b5318d3d086c8fb\",\n" +
                "                    \"language\": \"\",\n" +
                "                    \"quality\": \"720p\",\n" +
                "                    \"size_bytes\": 3371549327,\n" +
                "                    \"torrent_magnet\": \"magnet:?xt=urn:btih:f356104fe13ed4628d2907773b5318d3d086c8fb&dn=The.Gentlemen.2019.720p.WEBRip.XviD.AC3-FGT&tr=http%3A%2F%2Ftracker.trackerfix.com%3A80%2Fannounce&tr=udp%3A%2F%2F9.rarbg.me%3A2980&tr=udp%3A%2F%2F9.rarbg.to%3A2820\",\n" +
                "                    \"torrent_peers\": 572,\n" +
                "                    \"torrent_seeds\": 230,\n" +
                "                    \"torrent_url\": \"\",\n" +
                "                    \"vitality\": 0.35971224\n" +
                "                }\n" +
                "            ],\n" +
                "            \"items_lang\": [\n" +
                "                {\n" +
                "                    \"durability\": 0.95652175,\n" +
                "                    \"file\": \"The Gentlemen.2020.P.A.WEB-DL.1080p.W.mkv\",\n" +
                "                    \"id\": \"c27827c84eb40b444c49e8bf2070cd8b79a56e58\",\n" +
                "                    \"language\": \"ru\",\n" +
                "                    \"quality\": \"1080p\",\n" +
                "                    \"size_bytes\": 9637201828,\n" +
                "                    \"torrent_magnet\": \"magnet:?xt=urn:btih:C27827C84EB40B444C49E8BF2070CD8B79A56E58&tr=http://tr2.torrent4me.com/ann?uk=EKxg92IyIH&tr=http://tr2.tor4me.info/ann?uk=EKxg92IyIH&tr=http://tr2.tor2me.info/ann?uk=EKxg92IyIH&tr=http://tr5.torrent4me.com/ann?uk=EKxg92IyIH&tr=http://tr5.tor4me.info/ann?uk=EKxg92IyIH&tr=http://tr5.tor2me.info/ann?uk=EKxg92IyIH\",\n" +
                "                    \"torrent_peers\": 1003,\n" +
                "                    \"torrent_seeds\": 820,\n" +
                "                    \"torrent_url\": \"\",\n" +
                "                    \"vitality\": 0.45454547\n" +
                "                },\n" +
                "                {\n" +
                "                    \"durability\": 0.78571427,\n" +
                "                    \"file\": \"The.Gentlemen.2020.AMZN.WEB-DL.720p.seleZen.mkv\",\n" +
                "                    \"id\": \"bc87e13c40d923a34aff4bb774c85aa096ba05c3\",\n" +
                "                    \"language\": \"ru\",\n" +
                "                    \"quality\": \"720p\",\n" +
                "                    \"size_bytes\": 4149851579,\n" +
                "                    \"torrent_magnet\": \"magnet:?xt=urn:btih:BC87E13C40D923A34AFF4BB774C85AA096BA05C3&tr=http://tr2.torrent4me.com/ann?uk=EKxg92IyIH&tr=http://tr2.tor4me.info/ann?uk=EKxg92IyIH&tr=http://tr2.tor2me.info/ann?uk=EKxg92IyIH&tr=http://tr5.torrent4me.com/ann?uk=EKxg92IyIH&tr=http://tr5.tor4me.info/ann?uk=EKxg92IyIH&tr=http://tr5.tor2me.info/ann?uk=EKxg92IyIH\",\n" +
                "                    \"torrent_peers\": 1311,\n" +
                "                    \"torrent_seeds\": 1626,\n" +
                "                    \"torrent_url\": \"\",\n" +
                "                    \"vitality\": 0.45454547\n" +
                "                },\n" +
                "                {\n" +
                "                    \"durability\": 1,\n" +
                "                    \"file\": \"The.Gentlemen.2020.AMZN.WEB-DL.720p.mkv\",\n" +
                "                    \"id\": \"4d17b289303c929a1bfc3b971c385853fea4cd49\",\n" +
                "                    \"language\": \"ru\",\n" +
                "                    \"quality\": \"720p\",\n" +
                "                    \"size_bytes\": 4965467546,\n" +
                "                    \"torrent_magnet\": \"magnet:?xt=urn:btih:4D17B289303C929A1BFC3B971C385853FEA4CD49&tr=http://tr2.torrent4me.com/ann?uk=EKxg92IyIH&tr=http://tr2.tor4me.info/ann?uk=EKxg92IyIH&tr=http://tr2.tor2me.info/ann?uk=EKxg92IyIH&tr=http://tr5.torrent4me.com/ann?uk=EKxg92IyIH&tr=http://tr5.tor4me.info/ann?uk=EKxg92IyIH&tr=http://tr5.tor2me.info/ann?uk=EKxg92IyIH\",\n" +
                "                    \"torrent_peers\": 117,\n" +
                "                    \"torrent_seeds\": 490,\n" +
                "                    \"torrent_url\": \"\",\n" +
                "                    \"vitality\": 0.5\n" +
                "                },\n" +
                "                {\n" +
                "                    \"durability\": 0.5,\n" +
                "                    \"file\": \"Джентльмены_The Gentlemen (2019) WEBRip.H.264.720p.LQ.NNMClub.mkv\",\n" +
                "                    \"id\": \"af83004d5a95675d60574126efd8b6789effb398\",\n" +
                "                    \"language\": \"ru\",\n" +
                "                    \"quality\": \"720p\",\n" +
                "                    \"size_bytes\": 2629617646,\n" +
                "                    \"torrent_magnet\": \"magnet:?xt=urn:btih:AF83004D5A95675D60574126EFD8B6789EFFB398&tr=http://tr2.torrent4me.com/ann?uk=EKxg92IyIH&tr=http://tr2.tor4me.info/ann?uk=EKxg92IyIH&tr=http://tr2.tor2me.info/ann?uk=EKxg92IyIH&tr=http://tr5.torrent4me.com/ann?uk=EKxg92IyIH&tr=http://tr5.tor4me.info/ann?uk=EKxg92IyIH&tr=http://tr5.tor2me.info/ann?uk=EKxg92IyIH\",\n" +
                "                    \"torrent_peers\": 722,\n" +
                "                    \"torrent_seeds\": 660,\n" +
                "                    \"torrent_url\": \"\",\n" +
                "                    \"vitality\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"durability\": 0,\n" +
                "                    \"file\": \"The.Gentlemen.2020.WEBRip.1080p.rus.5.1.HDREZKA.STUDIO.mkv\",\n" +
                "                    \"id\": \"ff225e4506d9584d7f4e3b7de959958509787893\",\n" +
                "                    \"language\": \"ru\",\n" +
                "                    \"quality\": \"1080p\",\n" +
                "                    \"size_bytes\": 8047250827,\n" +
                "                    \"torrent_magnet\": \"magnet:?xt=urn:btih:FF225E4506D9584D7F4E3B7DE959958509787893&tr=http://tr2.torrent4me.com/ann?uk=EKxg92IyIH&tr=http://tr2.tor4me.info/ann?uk=EKxg92IyIH&tr=http://tr2.tor2me.info/ann?uk=EKxg92IyIH&tr=http://tr5.torrent4me.com/ann?uk=EKxg92IyIH&tr=http://tr5.tor4me.info/ann?uk=EKxg92IyIH&tr=http://tr5.tor2me.info/ann?uk=EKxg92IyIH\",\n" +
                "                    \"torrent_peers\": 66,\n" +
                "                    \"torrent_seeds\": 690,\n" +
                "                    \"torrent_url\": \"\",\n" +
                "                    \"vitality\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"durability\": 0,\n" +
                "                    \"file\": \"The.Gentlemen.2020.AMZN.WEB-DL.1080p.seleZen.mkv\",\n" +
                "                    \"id\": \"9f93a0b699b81efb834f4ffe69b7050a877369b8\",\n" +
                "                    \"language\": \"ru\",\n" +
                "                    \"quality\": \"1080p\",\n" +
                "                    \"size_bytes\": 8821522955,\n" +
                "                    \"torrent_magnet\": \"magnet:?xt=urn:btih:9F93A0B699B81EFB834F4FFE69B7050A877369B8&tr=http://tr2.torrent4me.com/ann?uk=EKxg92IyIH&tr=http://tr2.tor4me.info/ann?uk=EKxg92IyIH&tr=http://tr2.tor2me.info/ann?uk=EKxg92IyIH&tr=http://tr5.torrent4me.com/ann?uk=EKxg92IyIH&tr=http://tr5.tor4me.info/ann?uk=EKxg92IyIH&tr=http://tr5.tor2me.info/ann?uk=EKxg92IyIH\",\n" +
                "                    \"torrent_peers\": 213,\n" +
                "                    \"torrent_seeds\": 378,\n" +
                "                    \"torrent_url\": \"\",\n" +
                "                    \"vitality\": 0\n" +
                "                }\n" +
                "            ],\n" +
                "            \"popularity\": \"2147483645-1-6412\",\n" +
                "            \"poster_big\": \"https://m.media-amazon.com/images/M/MV5BMTlkMmVmYjktYTc2NC00ZGZjLWEyOWUtMjc2MDMwMjQwOTA5XkEyXkFqcGdeQXVyNTI4MzE4MDU@._V1_SY1000_SX675_AL_.jpg\",\n" +
                "            \"poster_med\": \"https://m.media-amazon.com/images/M/MV5BMTlkMmVmYjktYTc2NC00ZGZjLWEyOWUtMjc2MDMwMjQwOTA5XkEyXkFqcGdeQXVyNTI4MzE4MDU@._V1_SY1000_SX675_AL_.jpg\",\n" +
                "            \"rating\": 8,\n" +
                "            \"runtime\": 113,\n" +
                "            \"title\": \"The Gentlemen\",\n" +
                "            \"trailer\": \"Ify9S7hj480\",\n" +
                "            \"writers\": \"\",\n" +
                "            \"year\": 2019\n" +
                "        },\n" +
                "    ]\n" +
                "}";
        MovieListResponse response = new Gson().fromJson(json, MovieListResponse.class);
        return response;
    }
}
