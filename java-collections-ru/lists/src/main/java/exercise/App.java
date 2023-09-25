package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Hexlet!");
    }

    public static boolean scrabble(String letter, String word) {

        if (word.length() >= letter.length()
            || letter.isEmpty()
            || word.isEmpty()) {
            return false;
        }

        String[] words = word.toLowerCase().split("");
        String[] letters = letter.toLowerCase().split("");

        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        List<String> letterList = new ArrayList<>(Arrays.asList(letters));

        for (String l : letterList) {
            wordList.remove(l);
        }

        return wordList.size() == 0;
    }
}
//END
