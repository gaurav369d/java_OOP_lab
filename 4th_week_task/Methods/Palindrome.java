// 3. Palindrome Check with Recursion
class Palindrome {
    static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return check(s, 0, s.length()-1);
    }

    static boolean check(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return check(s, l+1, r-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Able was I ere I saw Elba")); // true
    }
}

