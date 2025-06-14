import java.net.URI;

public class main{
    public static void main(String[] args) {
        try {
            URI uri1 = new URI("HTTP://Example.COM/path");
            URI uri2 = new URI("http://example.com/PATH");
            URI normalized1 = uri1.normalize();
            URI normalized2 = uri2.normalize();
            System.out.println("URIs are semantically equal: " + normalized1.equals(normalized2));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
