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
        if(head == null || head.next == null){
            return null;
        }
        int len_list = 0;
        ListNode counter = head;
        while(counter!=null){
            len_list++;
            counter = counter.next;
        }
        int rem_node = len_list - n + 1;
        int cnt = 0;
        ListNode it = head;
        ListNode ans = it;
        ListNode prev = null;
        while(it!=null){
            cnt++;
            if(cnt == rem_node && prev !=null){
                prev.next = it.next;
            }
            else if(cnt == rem_node && prev == null){
                prev = it;
                it = it.next;
                prev.next = null;
                ans = it;
                continue;
            }
            prev = it;
            it = it.next;
        }
        return ans;
    }
}