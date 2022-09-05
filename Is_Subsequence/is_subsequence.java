package Is_Subsequence;

public class is_subsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int count = 0;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(count) == t.charAt(i)) {
                count++;
            }
        }
        return count == s.length();
    }
}
