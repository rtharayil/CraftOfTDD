package com.workshop.ctdd.prediction;

public interface LanguageModelAL {

	String getNextWordUnigram(String partialWord);

	String getNextWordBigram(String previousWord);

}
