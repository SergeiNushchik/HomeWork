package HomeWork_7;

import HomeWork_7.write.SearchWordWithFile;
import HomeWork_7.write.api.ISearchWithPrint;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainTask7 {

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
        Map<Integer, String> stringMap = new HashMap<>();
        int num = 1;
        for (File file1 : nFile) {
            String name = file1.getName();
            stringMap.put(num, name);
            System.out.println("№: " + num + " " + stringMap.get(num));
            num++;
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите порядковый номер нужной книги. ");
        int numberBook = sc.nextInt();

        if (stringMap.get(numberBook)==null){
            System.out.println("Ошибка ввода номера книги!!!");
            return;
        }

        if (stringMap.get(numberBook)!=null){
            System.out.println("Вы выбрали книгу: " + stringMap.get(numberBook));
        }
        File fileTest = new File(args[0]+"\\"+stringMap.get(numberBook));

            try {
                ISearchWithPrint search = new SearchWordWithFile();
                search.searchWord(fileTest);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
     }

}








