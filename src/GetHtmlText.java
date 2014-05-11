import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetHtmlText {
    public String flatNumber;
    public String[] getHtmlText(String request) throws IOException {
      org.jsoup.nodes.Document htmlDoc = null;
        try {
            URL url = new URL(request);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder htmlBuilder = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                htmlBuilder.append(inputLine);
            }
            htmlDoc = Jsoup.parse(String.valueOf(htmlBuilder));
        }
        catch (IOException e) {
            throw e;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        assert htmlDoc != null;
        Elements elements;
        elements = htmlDoc.getElementsByClass("as_td");
        String text = elements.text();
        String title = String.valueOf(htmlDoc.getElementsByTag("h1").text());
        String[] details = text.split(" ");
        int i=0;
        String eq = "доме:";
        for (String s: details){
            if (s.equals(eq)){
                flatNumber = details[i+1];
            }
            else i++;
        }

        return new String[]{title, flatNumber};
    }
}
