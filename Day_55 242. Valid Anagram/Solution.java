class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            if (count[t.charAt(i) - 'a'] == 0) {
                return false;
            }
            count[t.charAt(i) - 'a'] -= 1;
        }

        return true;        
    }
}



// public class Solution {
//     public boolean isAnagram(String s, String t) {
//         int[] alphabet = new int[26];
//         for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
//         for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
//         for (int i : alphabet) if (i != 0) return false;
//         return true;
//     }
// }