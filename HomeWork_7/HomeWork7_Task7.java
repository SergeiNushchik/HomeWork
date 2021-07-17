package HomeWork_7;

import HomeWork_7.engine.EasySearch;
import HomeWork_7.engine.SearchEnginePunctuationNormalizer;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork7_Task7 {

    public static void main(String[] args) throws IOException {
        Scanner address = new Scanner(System.in);
        System.out.println("Введите адрес директории:  ");
        String directories = address.nextLine();

        if (directories == null) {
            System.out.println("Введите адрес директории:  ");

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
        String books = stringMap.get(sc.nextInt());

        if (books==null){
            System.out.println("Ошибка ввода номера книги!!!");
            return;
        }
        System.out.println("Вы выбрали книгу: " + books);

        File fileTest = new File(directories+"\\"+books);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt" , true));) {

            while (true) {
                Scanner words = new Scanner(System.in);
                System.out.println("Введите слово для поиска. Для прекращения поиска введите \"stop\"");
                String word = words.nextLine();
                if (word.equals("stop")) {
                    System.out.println("Поиск остановлен!");
                    break;
                }
                String text = Files.readString(fileTest.toPath());
                SearchEnginePunctuationNormalizer search = new SearchEnginePunctuationNormalizer(new EasySearch());
                String result =  "\"" + fileTest.getName()+ "\"" + " ------- " + "\"" + word + "\"" + "  -------  " + search.longSearch(text, word);
                writer.write(result);
                writer.newLine();

                writer.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
     }

}








