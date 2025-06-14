import java.net.Inet6Address;
import java.net.InetAddress;

public class main{
    public static void main(String[] args) {
        String ip = "::ffff:192.168.1.1"; 
        try {
            InetAddress inet = InetAddress.getByName(ip);
            if (inet instanceof Inet6Address) {
                byte[] addr = inet.getAddress();
                boolean isIPv4Compatible = true;
                for (int i = 0; i < 10; i++) {
                    if (addr[i] != 0) {
                        isIPv4Compatible = false;
                        break;
                    }
                }
                for (int i = 10; i < 12; i++) {
                    if (addr[i] != (byte) 0xff) {
                        isIPv4Compatible = false;
                        break;
                    }
                }
                System.out.println(ip + " is " + (isIPv4Compatible ? "IPv4-compatible" : "not IPv4-compatible"));
            } else {
                System.out.println(ip + " is not an IPv6 address");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
