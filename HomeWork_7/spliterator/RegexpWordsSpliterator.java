package HomeWork_7.spliterator;


import HomeWork_7.engine.SearchEnginePunctuationNormalizer;
import HomeWork_7.spliterator.api.IWordsSpliterator;

import java.util.Collection;

public class RegexpWordsSpliterator implements IWordsSpliterator {

    private final String regexp;

    public RegexpWordsSpliterator(String regexp) {
        this.regexp = regexp;
    }

    @Override
    public void handle(String text, Collection<String> container) {
        String[] words = text.split(regexp);
        for (String word : words) {
            container.add(word);
        }
    }
}
