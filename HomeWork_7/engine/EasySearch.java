package HomeWork_7.engine;


import HomeWork_7.engine.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long count = 0;

        int index = -1;
        while ((index = text.indexOf(word, index + 1)) != -1){
                count++;
        }

        return count;
    }
}
