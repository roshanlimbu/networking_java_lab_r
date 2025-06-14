import java.net.URL;

public class main{
    public static void main(String[] args) {
        String urlString = "https://www.example.com/path?query=param";
        try {
            URL url = new URL(urlString);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
