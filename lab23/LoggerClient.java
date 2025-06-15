import java.net.*;
import java.io.*;

public class LoggerClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Sample log message from client");
            socket.close();
        } catch (Exception e) {
            System.err.println("Error: println" + e.getMessage());
        }
    }
}
