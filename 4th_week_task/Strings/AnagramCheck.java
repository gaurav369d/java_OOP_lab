// 1. Check for Anagram
import java.util.Arrays;

class AnagramCheck {
    static boolean isAnagram(String s1, String s2) {
        char[] a = s1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        char[] b = s2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent")); // true
    }
}
