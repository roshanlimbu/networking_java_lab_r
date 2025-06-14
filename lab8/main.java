import java.net.URL;

public class main{
    public static void main(String[] args) {
        try {
            URL url = new URL("https", "www.example.com", 443, "/path/file.html");
            System.out.println("Constructed URL: " + url.toString());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
