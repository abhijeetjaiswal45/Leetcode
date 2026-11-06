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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node=new ListNode(0);
        ListNode current=node;
        ListNode fir=list1;
        ListNode sec=list2;
        while(fir!=null && sec!=null) {
            if(fir.val<=sec.val) {
                current.next=fir;
            //    node=node.next;
                fir=fir.next;
            }
            else {
               current.next=sec;
             //   node=node.next;
                sec=sec.next;
            }
            current=current.next;
        }
        while(fir!=null) {
            current.next=fir;
       //     node=node.next;
            fir=fir.next;
            current=current.next;
        }
        while(sec!=null) {
            current.next=sec;
          //  node=node.next;
            sec=sec.next;
            current=current.next;
        }
        return node.next;
    }
}