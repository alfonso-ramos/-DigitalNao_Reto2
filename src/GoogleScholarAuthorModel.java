import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GoogleScholarAuthorModel {

    private static final String API_URL = "https://serpapi.com/search.json";

    public String getCitations(String authorId, String apiKey, String numResults) throws Exception {

        String url = API_URL + "?engine=google_scholar_author&author_id=" + authorId
                + "&api_key=" + apiKey + "&num=" + numResults;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Opcional - agregar encabezados de solicitud
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");

        int responseCode = con.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }
}
