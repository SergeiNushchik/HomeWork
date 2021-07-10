package HomeWork_7.spliterator;



import HomeWork_7.spliterator.api.IWordsSpliterator;

import java.util.Collection;

public class EasyWordsSpliterator implements IWordsSpliterator {

    @Override
    public void handle(String text, Collection<String> container) {
        String[] words = text.split(" ");
        for (String word : words) {
            container.add(word);
        }
    }

}
