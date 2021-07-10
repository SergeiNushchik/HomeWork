package HomeWork_7;


import HomeWork_7.engine.EasySearch;
import HomeWork_7.engine.SearchEnginePunctuationNormalizer;
import HomeWork_7.engine.api.ISearchEngine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainTask {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(Path.of("G:\\StudyJava\\projects\\HomeWork\\src\\Books\\Война и мир_книга.txt"));

        ISearchEngine searchEngine = new SearchEnginePunctuationNormalizer(new EasySearch());
//        ISearchEngine searchEngine = new EasySearch();

        System.out.println(searchEngine.search(text, "война"));
    }
}
