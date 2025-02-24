class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];

        for (String str : words) {
            for (char chr : str.toCharArray()) {
                freq[chr - 'a']++;
            }
        }

        int len = words.length;      
        for (int i = 0; i < 26; i++) {
            if(freq[i] > 0){
                if(freq[i] % len != 0)
                    return false;
            }
        }
        return true;
    }
}