import java.net.*;

public class main{
    public static void main(String[] args) {
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080));
            URL url = new URL("https://www.example.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(proxy);
            conn.setRequestMethod("GET");
            System.out.println("Connected via proxy: " + conn.getResponseCode());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
