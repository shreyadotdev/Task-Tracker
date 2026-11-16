import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        Path filePath = Path.of("HelloWorld.txt");

        try {
            Files.writeString(filePath, "Hello, World!");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}