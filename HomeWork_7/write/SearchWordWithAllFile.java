package HomeWork_7.write;

import HomeWork_7.engine.EasySearch;
import HomeWork_7.engine.SearchEnginePunctuationNormalizer;
import HomeWork_7.write.api.ISearchWithPrint;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;


public class SearchWordWithAllFile implements ISearchWithPrint {
    @Override
    public void searchWord(File file)  {
       try {
           Scanner sc = new Scanner(System.in);
           System.out.println("Введите слово для поиска: ");
           String word = sc.nextLine();
           BufferedWriter writer = new BufferedWriter(new FileWriter("Результат поиска.txt"));

               String text = Files.readString(file.toPath());
               SearchEnginePunctuationNormalizer search = new SearchEnginePunctuationNormalizer(new EasySearch());
               String result = "В книге " + file.getName() + " слово " + word + " повторилось: " + search.search(text, word);
               writer.write(result);
               writer.newLine();
               writer.flush();

        } catch (IOException e)
       {
           System.out.println(e.getMessage());
       }
    }
}
