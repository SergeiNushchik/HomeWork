package HomeWork_7;


import HomeWork_7.engine.RegExSearch;
import HomeWork_7.engine.SearchEnginePunctuationNormalizer;
import HomeWork_7.engine.api.ISearchEngine;

import java.io.*;
import java.nio.file.Files;
import java.util.Date;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeWork7_Task8 {

    public static void main(String[] args) throws IOException {
        Scanner address = new Scanner(System.in);
        System.out.println("Введите адрес директории:  ");
        String directories = address.nextLine();

        if (directories == null) {
            System.out.println("Введите адрес директории:  ");
            return;
        }   //Проверка на наличие переданных данных
        File file = new File(directories);

        File[] nFile = file.listFiles((dirRef, name) -> name.endsWith(".txt"));

        if (!file.isDirectory()) {
            System.out.println("Не верный адрес директории повторите попытку! ");
            return;
        }    // Проверка являеться ли переданный адрес директории

        if (nFile == null || nFile.length == 0) {
            System.out.println("Нет текстовых файлов");
            return;
        }  // Проверка директории на наличие текстовых файлов
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt",true ));
        Date date =new Date();
        String dates = date.toString();
        SearchEnginePunctuationNormalizer search = new SearchEnginePunctuationNormalizer(new RegExSearch());
            while (true) {
                Scanner words = new Scanner(System.in);
                System.out.println("Введите слово для поиска. Для прекращения поиска введите \"stop\"");
                String word = words.nextLine();
                if (word.equals("stop")) {
                    System.out.println("Поиск остановлен!");
                    break;
                }
                writer.write("\n" +dates + " " + word + "\n");
                writer.newLine();
                for (File file1 : nFile) {
                    executorService.execute(() ->{
                    try  {
                       writeFile(file1,word,search,writer);
                    }    catch (Exception e) {
                        e.printStackTrace();
                    }
                    });
                }
                executorService.shutdown();

        }
     }

     public static void writeFile (File file, String word, ISearchEngine searchEngine, BufferedWriter writer) throws  Exception{
         String text = Files.readString(file.toPath());
         String result =  "\"" + file.getName()+ "\"" + " -------> " + "\"" + word + "\"" + "  ------->  " + searchEngine.longSearch(text, word);
         writer.write(result);
         writer.newLine();

         writer.flush();
     }


}








