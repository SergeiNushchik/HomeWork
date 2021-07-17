package HomeWork_7.engine;

import HomeWork_7.engine.api.ISearchEngine;


public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long longSearch(String text, String word) {
        text = text.replaceAll("[\\p{Punct}\\n]", " ");
        word = word + " ";
        return searchEngine.longSearch(text, word);
    }
}
