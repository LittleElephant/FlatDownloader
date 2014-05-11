import java.io.IOException;

public class Address {
    public String name;
    public int flatNumber;
    public Address (String request) throws IOException {
        GetHtmlText html = new GetHtmlText();
        setName(html.getHtmlText(request)[0]);
        flatNumber = Integer.parseInt(html.getHtmlText(request)[1]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
