import java.net.*;
import java.io.*;

public class BinaryDataServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server started on port 5000");
            Socket client = server.accept();
            OutputStream os = client.getOutputStream();
            byte[] data = new byte[]{0x41, 0x42, 0x43, 0x44}; 
            os.write(data);
            os.flush();
            client.close();
            server.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

