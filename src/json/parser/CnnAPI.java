package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class CnnAPI {

    public static void main(String[] args) throws Exception {
        String sURL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=0d9e35dfa3c140aab8bf9cdd70df957f";
        Cnn headline = null;
        List<Cnn> list = new ArrayList<>();
        URL newsUrl = new URL(sURL);
        URLConnection request = newsUrl.openConnection();
        request.connect();
        JsonArray jsonArray = null;
        JsonObject obj = null;
        JsonParser x = new JsonParser();
        JsonElement y = x.parse(new InputStreamReader((InputStream) request.getContent()));

        if (y instanceof JsonObject) {
            obj = y.getAsJsonObject();

        } else if (y instanceof JsonArray) {
            jsonArray = y.getAsJsonArray();
        }

        if (jsonArray == null)
            jsonArray = obj.getAsJsonArray("Articles");

        String source = null;
        String author = null;
        String title = null;
        String description = null;
        String url = null;
        String urlToImage = null;
        String publishedAt = null;
        String content = null;


        for (int i = 0; i < jsonArray.size() - 1; i++) {

            try {
                JsonObject jElements = jsonArray.get(i).getAsJsonObject();

                source = jElements.get("source").toString();
                author = jElements.get("author").toString();
                title = jElements.get("title").toString();
                description = jElements.get("description").toString();
                url = jElements.get("url").toString();
                urlToImage = jElements.get("urlToImage").toString();
                publishedAt = jElements.get("publishedAt").toString();
                content = jElements.get("content").toString();


                headline = new Cnn(source, author, title, description, url, urlToImage, publishedAt, content);
                list.add(headline);


            } catch (Exception ex) {

            }
            for (Cnn entry : list) {
                System.out.println("Source: "+ entry.getSource() + "\nAuthor: " + entry.getAuthor() + "\nTitle: " + entry.getTitle() + "\nDescription: "+ entry.getDescription()+ "\nUrl: "+ entry.getUrl() + "\nUrl to Image: "+ entry.getUrlToImage() + " \nPublished At:" + entry.getPublishedAt() + "\nContent: " + entry.getContent() + " ");
            }

        }
    }
}