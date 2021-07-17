package HomeWork_7;



import HomeWork_7.engine.RegExSearch;
import HomeWork_7.engine.api.ISearchEngine;




import java.io.File;

import java.io.IOException;
import java.nio.file.Files;



public class HomeWork7_Task5 {
    public static void main(String[] args) throws IOException {
        File file = new File("G:\\StudyJava\\projects\\HomeWork\\src\\Books\\Война и мир_книга.txt");
        ISearchEngine  search = new RegExSearch();
        String[] word = {"война", "мир", "и"};
        String text = Files.readString(file.toPath());
        for (String words : word) {
            System.out.println(  "Слово " + words + " повторилось "  + search.longSearch(text, words) + " раз");
        }
    }
}
