package com.interview.questions;
import java.util.*;

// Implement the VocabularyWordManager using a SortedSet internally
public class VocabularyWordManager {

    private SortedSet<String> wordsSet;

    public VocabularyWordManager(Collection<String> words) {
        this.wordsSet = new TreeSet<>(words);
    }

    public String getFirstWord() {
        if (wordsSet.isEmpty()) {
            throw new NoSuchElementException("Vocabulary is empty");
        }
        return wordsSet.first();
    }

    public String getLastWord() {
        if (wordsSet.isEmpty()) {
            throw new NoSuchElementException("Vocabulary is empty");
        }
        return wordsSet.last();
    }

    public SortedSet<String> getWordsBefore(String word) {
        return wordsSet.headSet(word);
    }

    public SortedSet<String> getWordsAfter(String word) {
        return wordsSet.tailSet(word);
    }

    public SortedSet<String> getWordsBetween(String startWord, String endWord) {
        return wordsSet.subSet(startWord, endWord);
    }

    public static void main(String[] args) {
        VocabularyWordManager vocab = new VocabularyWordManager(
                Set.of("apple",
                        "banana",
                        "carrot",
                        "date",
                        "eggplant",
                        "fig",
                        "grape",
                        "honey"));

        System.out.println("First word: " + vocab.getFirstWord());
        System.out.println("Last word: " + vocab.getLastWord());

        String targetWord = "eggplant";
        SortedSet<String> wordsBefore = vocab.getWordsBefore(targetWord);
        System.out.println("Words before " + targetWord + ": " + wordsBefore);

        SortedSet<String> wordsAfter = vocab.getWordsAfter(targetWord);
        System.out.println("Words after " + targetWord + ": " + wordsAfter);

        String startWord = "carrot";
        String endWord = "grape";
        SortedSet<String> wordsBetween = vocab.getWordsBetween(startWord, endWord);
        System.out.println("Words between " + startWord + " and " + endWord + ": " + wordsBetween);
    }
}
