package net.sf.classifier4J;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetStopWordsProvider implements IStopWordProvider {

    Set<String> storage = new HashSet<>();

    public void initDefaultEnglish() {
        DefaultStopWordsProvider dtwp = new DefaultStopWordsProvider();
        storage.clear();
        storage.addAll(Arrays.asList(dtwp.getStopWords()));
    }
    @Override
    public boolean isStopWord(String word) {
        return storage.contains(word);
    }
}
