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
    public void reorderList(ListNode head) {
        ListNode revPtr = null;
        ListNode prev = null;
        ListNode next = null;
        ListNode fast = head;
        ListNode slow = head;
        // getting the mid of the LinkedList
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // reversing ListNode after getting hold of mid
        ListNode rev_slow = slow;
        while(rev_slow!=null){
            next = rev_slow.next;
            if(prev == null){
                rev_slow.next = null;
            }
            else{
                rev_slow.next = prev;
            }
            prev = rev_slow;
            if(next == null){
                revPtr = rev_slow;
            }
            rev_slow = next;
        }

        // using the 2 pointer method of LinkedList to join both 
        ListNode fwdPtr = head;
        ListNode fwdNext = null;
        ListNode revNext = null;
        
        while(revPtr!=null && fwdPtr!=null){
            fwdNext = fwdPtr.next;
            fwdPtr.next = revPtr;
            fwdPtr = fwdNext;
            revNext = revPtr.next;
            // if revNext is null we should break else it will form a loop for
            // even no. of ListNodes
            if(revNext == null){
                break;
            }
            revPtr.next = fwdPtr;
            revPtr = revNext;
        }
    }
}