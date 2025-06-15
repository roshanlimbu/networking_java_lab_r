import java.net.*;
import java.io.*;

public class BinaryDataClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            InputStream is = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = is.read(buffer);
            System.out.print("Received binary data: ");
            for (int i = 0; i < bytesRead; i++) {
                System.out.print((char) buffer[i]);
            }
            socket.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
