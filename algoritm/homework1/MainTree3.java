package homework1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTree3 {
    public static void main(String[] args) {
        final Tree3 tree = new Tree3();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    int value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println("finish");
                } catch (Exception ignored) {

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    
}
