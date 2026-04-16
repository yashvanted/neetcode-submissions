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
    public ListNode createListNode(){
        ListNode y = new ListNode();
        return y;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int cnt1 = 0;
        int cnt2 = 0;
        ListNode pt1 = l1;
        ListNode pt2 = l2;
        ListNode ans = new ListNode();
        while(pt1!=null){
            cnt1++;
            pt1 = pt1.next;
        }
        while(pt2!=null){
            cnt2++;
            pt2 = pt2.next;
        }
        ListNode rev1 = l1;
        ListNode rev2 = l2;
        
        
        int num = 0;
        int borr = 0;
        int unit = 0;
        ListNode Answer = null;
        if(cnt1 > cnt2){
            while(rev1 != null){
                if(rev2!=null){
                    if(Answer == null){
                        Answer = createListNode();
                        ans = Answer;
                    }
                    num = rev1.val + rev2.val + borr;
                    unit = num % 10;
                    borr = num / 10;
                    Answer.val = unit;
                    if(rev1.next == null){
                        break;
                    }
                    Answer.next = new ListNode();
                    Answer = Answer.next;
                    rev1 = rev1.next;
                    rev2 = rev2.next;
                }
                else{
                    num = rev1.val + borr;
                    unit = num % 10;
                    borr = num / 10;
                    Answer.val = unit;
                    if(rev1.next == null){
                        break;
                    }
                    Answer.next = new ListNode();
                    Answer = Answer.next;
                    rev1 = rev1.next;
                }
                
            }
            if(borr!=0){
                Answer.next = createListNode();
                Answer = Answer.next;
                Answer.val = borr;
            }
            
        }
        else{
            while(rev2 != null){
                if(rev1!=null){
                    if(Answer == null){
                        Answer = createListNode();
                        ans = Answer;
                    }
                    num = rev1.val + rev2.val + borr;
                    unit = num % 10;
                    borr = num / 10;
                    Answer.val = unit;
                    if(rev2.next == null){
                        break;
                    }
                    Answer.next = new ListNode();
                    Answer = Answer.next;
                    rev1 = rev1.next;
                    rev2 = rev2.next;
                }
                else{
                    num = rev2.val + borr;
                    unit = num % 10;
                    borr = num / 10;
                    Answer.val = unit;
                    if(rev2.next == null){
                        break;
                    }
                    Answer.next = new ListNode();
                    Answer = Answer.next;
                    rev2 = rev2.next;
                }
            }
            if(borr!=0){
                Answer.next = createListNode();
                Answer = Answer.next;
                Answer.val = borr;
            }
            
        }
        return ans;
    }
}