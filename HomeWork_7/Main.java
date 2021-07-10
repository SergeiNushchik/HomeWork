package HomeWork_7;

import HomeWork_7.engine.EasySearch;
import HomeWork_7.engine.SearchEnginePunctuationNormalizer;

import HomeWork_7.write.SearchWordWithAllFile;
import HomeWork_7.write.SearchWordWithFile;
import HomeWork_7.write.api.ISearchWithPrint;

import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws IOException {

        if (args[0] == null) {
            System.out.println("Введите адрес директории:  ");
        }   //Проверка на наличие переданных данных
        File file = new File(args[0]);

        File[] nFile = file.listFiles((dirRef, name) -> name.endsWith(".txt"));

        if (!file.isDirectory()) {
            System.out.println("Введите адрес директории:  ");
        }    // Проверка являеться ли переданный адрес директории

        if (nFile == null || nFile.length == 0) {
            System.out.println("Нет текстовых файлов");
            return;
        }  // Проверка директории на наличие текстовых файлов
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        try {
                for (File file1 : nFile) {
                    System.out.println(file1.getName());
                }
                ISearchWithPrint search = new SearchWordWithFile();

                    //search.searchWord();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}






