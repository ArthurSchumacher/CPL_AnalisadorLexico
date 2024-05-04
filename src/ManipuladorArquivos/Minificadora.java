package ManipuladorArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Minificadora {
    public void minificaPascal(String inputFilePath, String outputFilePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                FileWriter writer = new FileWriter(outputFilePath)) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim().replaceAll("\\{.*?}|//.*?$", "");
                if (!line.isEmpty()) {
                    writer.write(line + " ");
                }
            }
        }
    }

}
