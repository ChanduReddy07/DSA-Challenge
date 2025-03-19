/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack <Integer> s = new Stack<>();
        ListNode q1=head;
        while(q1!=null){
            list.add(q1.val);
            q1=q1.next;
        }
        int result[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            while(!s.isEmpty() && list.get(i)>list.get(s.peek())){
               result[s.pop()] = list.get(i);
            }
            s.push(i);
        }
        return result;
    }
}