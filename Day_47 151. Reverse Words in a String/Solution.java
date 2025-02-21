class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(i > 0 ? " " : "");
        }
        return result.toString();
    }
}





// class Solution {
//     public String reverseWords(String s) {
//         String[] words=s.trim().split("\s+");
//         int low=0;
//         int high=words.length-1;
//         while(low<high)
//         {
//             String temp=words[low];
//             words[low]=words[high];
//             words[high]=temp;
//             low++;
//             high--;
//         }
//         StringBuilder res=new StringBuilder();
//         for(String word:words)
//         {
//             res.append(word);
//             res.append(" ");
//         }
//         return res.toString().trim();
//     }
// }