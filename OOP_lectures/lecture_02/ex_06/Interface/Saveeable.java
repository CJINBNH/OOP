package OOP_lectures.lecture_02.ex_06.Interface;

import OOP_lectures.lecture_02.ex_06.Document.TextDocument;

public interface Saveeable {
    void SaveAs(TextDocument document, String path);
}
