import java.net.*;
import java.io.*;

public class main {
    public static void main(String[] args) {
        try {
            CookieManager cookieManager = new CookieManager();
            CookieHandler.setDefault(cookieManager);
            URL url = new URL("https://www.example.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            CookieStore cookieStore =cookieManager.getCookieStore();
            List<HttpCookie> cookies = cookieStore.getCookies();
            for (HttpCookie cookie : cookies) {
                System.out.println("Cookie: " + cookie.getName() + "=" + cookie.getValue());
            }
        } catch (Exception e) {
            System.err.println("Error: println" + e.getMessage());
        }
    }
}
