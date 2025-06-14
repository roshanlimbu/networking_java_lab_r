import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        String original = "query=hello world & special=çö";
        try {
            String encoded = URLEncoder.encode(original, StandardCharsets.UTF_8.toString());
            System.out.println("Encoded: " + encoded);
            String decoded = URLDecoder.decode(encoded, StandardCharsets.UTF_8.toString());
            System.out.println("Decoded: " + decoded);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
