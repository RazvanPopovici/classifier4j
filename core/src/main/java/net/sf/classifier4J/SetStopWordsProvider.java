package net.sf.classifier4J;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetStopWordsProvider  extends HashSet implements IStopWordProvider {


    public void initDefaultEnglish() {
        DefaultStopWordsProvider dtwp = new DefaultStopWordsProvider();
        clear();
        addAll(Arrays.asList(dtwp.getStopWords()));
    }
    @Override
    public boolean isStopWord(String word) {
        return contains(word);
    }

}
