import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import javax.naming.NamingException;
import java.util.Hashtable;

public class main{
    public static void main(String[] args) {
        String ip = "127.0.0.1"; 
        String blacklist = "zen.spamhaus.org"; 
        try {
            String[] octets = ip.split("\\.");
            String reverseIP = octets[3] + "." + octets[2] + "." + octets[1] + "." + octets[0] + "." + blacklist;

            Hashtable<String, String> env = new Hashtable<>();
            env.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            InitialDirContext ctx = new InitialDirContext(env);
            Attributes attrs = ctx.getAttributes(reverseIP, new String[]{"A"});
            System.out.println(ip + " is listed in " + blacklist);
        } catch (NamingException e) {
            System.out.println(ip + " is not listed in " + blacklist);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
