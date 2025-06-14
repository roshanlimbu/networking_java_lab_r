import java.net.URL;

public class main{
    public static void main(String[] args) {
        try {
            URL url1 = new URL("https://example.com/path/file.txt");
            URL url2 = new URL("https://example.com/path/../path/file.txt");
            System.out.println("URLs point to same file: " + url1.sameFile(url2));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
