//Merge two sorted Lists
import java.util.*;
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(0);
        ListNode merge=dummy;
        while(true){
            if(l1==null){
                merge.next=l2;
                break;
            }
            if(l2==null){
                merge.next=l1;
                break;
            }
            if(l1.val<=l2.val){
                merge.next=l1;
                l1=l1.next;
            }
            else{
                merge.next=l2;
                l2=l2.next;
            }
            merge=merge.next;
        }
            
        return dummy.next;
    }
}