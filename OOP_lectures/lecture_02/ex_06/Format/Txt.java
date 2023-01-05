package OOP_lectures.lecture_02.ex_06.Format;

import OOP_lectures.lecture_02.ex_06.Document.TextDocument;
import java.io.FileWriter;
import java.io.IOException;



public class Txt extends TextFormat {

    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".txt", false)) {
            writer.write("Txt Format\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
