//Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummyHead = new ListNode(0);
       ListNode tail = dummyHead;
       int carry = 0;
       while (l1 != null || l2 != null || carry != 0){
           //if LS not null then take the value, else where put zeros
           int val1 = (l1 != null) ? l1.val :0;
           int val2 = (l2 != null) ? l2.val :0;
           int sum,last_digit;
           sum = val1 + val2 + carry;
           carry = sum / 10; //carry
           last_digit = sum % 10; //last digit
           //ListNode sum = new ListNode;
           ListNode new_node = new ListNode(last_digit); //to store result data after mod zero at LS to return it
           tail.next = new_node;
           //check if l1 and l2 have another values
           if(l1 != null) l1 = l1.next;
           if(l2 != null) l2 = l2.next;
           tail = tail.next;


       }
       if(carry > 0) {
           ListNode new_node = new ListNode(carry);
           tail = new_node; //it will be last element
           tail = tail.next;
       }
       return dummyHead.next;
    }
    /*ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;*/
    //return dummyHead.next;
}
