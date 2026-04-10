/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // if (head == null ) return null;
        ListNode slow= head;
        ListNode fast= head;
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        
        if(slow==fast){
            ListNode curr= head;
            while(curr!=slow){
                slow=slow.next;
                curr= curr.next;
            }
            return curr;
        }
        }
    //     HashSet<ListNode> set= new HashSet<>();
    //     ListNode temp=head;
    //     while(temp!=null){
    //         if(!set.isEmpty() && set.contains(temp)){
    //             return temp;
    //         }
    //         set.add(temp);
    //         temp=temp.next;
    //     }
    // return null;
    return null;
    }
}