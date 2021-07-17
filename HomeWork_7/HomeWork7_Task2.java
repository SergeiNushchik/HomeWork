package HomeWork_7;



import HomeWork_7.engine.EasySearch;
import HomeWork_7.engine.SearchEnginePunctuationNormalizer;
import HomeWork_7.engine.api.ISearchEngine;
import HomeWork_7.spliterator.EasyWordsSpliterator;
import HomeWork_7.spliterator.RegexpWordsSpliterator;
import HomeWork_7.spliterator.api.IWordsSpliterator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HomeWork7_Task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("G:\\StudyJava\\projects\\HomeWork\\src\\Books\\Война и мир_книга.txt");

        String text = Files.readString(file.toPath());
        Pattern pattern =
                Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                        | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        List<String> words = new ArrayList<>();

        while (matcher.find())
            words.add(matcher.group().toLowerCase());

        Map<String, Integer> wordsCount = new HashMap<>();

        for (String word : words) {
            Integer count = 1;

            if(wordsCount.containsKey(word)){
                count = wordsCount.get(word);
                count++;
            }

            wordsCount.put(word, count);
        }

        List<Map.Entry<String, Integer>> sortedData = new ArrayList<>(wordsCount.entrySet());
        sortedData.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        int count = 0;
        for (Map.Entry<String, Integer> sortedDatum : sortedData) {
            System.out.println(sortedDatum.getKey() + " : " + sortedDatum.getValue());
            if(count++ > 10) break;
        }

        }
    }

