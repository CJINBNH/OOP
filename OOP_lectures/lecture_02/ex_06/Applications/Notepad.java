package OOP_lectures.lecture_02.ex_06.Applications;

import java.util.ArrayList;
import java.util.List;

import OOP_lectures.lecture_02.ex_06.Document.TextDocument;
import OOP_lectures.lecture_02.ex_06.Format.*;

public class Notepad {
    private List<TextDocument> documents;
    private int index;

    public Notepad() {
        documents = new ArrayList<>();
        index = -1;
    }

    public void newFile() {
        documents.add(new TextDocument());
        index++;
    }

    public TextDocument currentDocument(){
        return documents.get(index);
    }

    public void SaveAs(String path, TextFormat format) {
        format.SaveAs(documents.get(index), path);
    }
}
