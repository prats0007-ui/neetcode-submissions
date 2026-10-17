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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<ListNode> list=new ArrayList<>(); 
        ListNode cur=head;
        while(cur!=null){ 
            list.add(cur); 
            cur=cur.next;
        }

        int i=left-1, j=right-1; 

        while(i<j){ 
            int temp=list.get(i).val; 
            list.get(i).val=list.get(j).val; 
            list.get(j).val=temp;
            i++; 
            j--;
        }

        return head;

    }


   
}