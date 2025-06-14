import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        String logFile = "sample.log"; 
        String regex = "^(\\S+) (\\S+) (\\S+) \\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(\\S+) (\\S+)\\s*(\\S+)?\" (\\d{3}) (\\S+)";
        Pattern pattern = Pattern.compile(regex);
        try (BufferedReader br = new BufferedReader(new FileReader(logFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    System.out.println("IP: " + matcher.group(1));
                    System.out.println("Time: " + matcher.group(4));
                    System.out.println("Method: " + matcher.group(5));
                    System.out.println("URL: " + matcher.group(6));
                    System.out.println("Status: " + matcher.group(8));
                    System.out.println("---");
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
