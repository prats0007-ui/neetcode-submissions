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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list=new ArrayList<>(); 
        ListNode cur=head; 
        
        while(cur!=null){ 
            list.add(cur); 
            cur=cur.next;
        }

        int remove=list.size()-n ; 
        if(remove==0) return head.next;
        list.get(remove-1).next=list.get(remove).next;
        return head;

    }
}
