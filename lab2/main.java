import java.net.InetAddress;

public class main{
    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getLocalHost();
            System.out.println("Local IP Address: " + inet.getHostAddress());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
