package other.easy;

/**
 * Problem: 1119. Remove Vowels from a String
 * Difficulty: Easy
 * Link: https://leetcode.com/problemsremove-vowels-from-a-string
 */
public class RemoveVowelsFromAString {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (!isVowel(s.charAt(i)))
                sb.append(s.charAt(i));
        return sb.toString();
    }

    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        return false;
    }
}