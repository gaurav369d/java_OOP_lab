// 3. Word Frequency Counter
import java.util.*;

class WordFrequency {
    static Map<String, Integer> countWords(String sentence) {
        String[] words = sentence.toLowerCase().replaceAll("[^a-z0-9 ]", "").split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        System.out.println(countWords("The cat and the dog.")); 
        // {the=2, cat=1, and=1, dog=1}
    }
}

