//even odd LinkedList
import java.util.*;
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd=null,even=null;
        ListNode o=null,e=even;
        int i=0;
        while(head!=null){
            if(i%2 ==0){
                if(o==null){
                    o=new ListNode(head.val);
                    odd=o;
                }
                else{
                    odd.next=new ListNode(head.val);;
                    odd=odd.next;
                }
            }
            else{
                if(e==null){
                    e=new ListNode(head.val);
                    even=e;
                }
                else{
                    even.next=new ListNode(head.val);;
                    even=even.next;
                }
            }
            i++;
            head=head.next;
        }
        odd.next=e;
        return o;
    }
}