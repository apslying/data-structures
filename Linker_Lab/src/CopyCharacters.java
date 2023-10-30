import java.io.FileReader;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;

        try {
            inputStream = new FileReader("input-2.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.println((char) c);;
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}