package com.boyter.SpellingCorrector;

public interface ISpellingCorrector {
    void putWord(String word);
    String correct(String word);
    boolean containsWord(String word);
}
