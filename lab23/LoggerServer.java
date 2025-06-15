import java.net.*;
import java.io.*;

public class LoggerServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Logger server started on port 5000");
            while (true) {
                Socket client = server.accept());
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                String logMessage = in.readLine();
                System.out.println("Log received: " + logMessage.get());
                client.close();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
