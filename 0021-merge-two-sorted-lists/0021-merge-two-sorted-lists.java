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
    
        ListNode ans = new ListNode();
        ListNode ansHead = ans;

        ListNode curr1 = list1;
        ListNode curr2 = list2;

        if(curr1 == null)
        return curr2;

        if(curr2 == null)
        return curr1;

        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                ansHead.next = curr1;
                ansHead = ansHead.next;
                curr1 = curr1.next;
            } else {
                ansHead.next = curr2;
                ansHead = ansHead.next;
                curr2 = curr2.next;
            }
        }

        while(curr1 != null){
            ansHead.next = curr1;
            ansHead = ansHead.next;
            curr1 = curr1.next;
        }
        while(curr2 != null){
            ansHead.next = curr2;
            ansHead = ansHead.next;
            curr2 = curr2.next;
        }
        return ans.next;

        // Brute Force Method

        // 1. store all the elements of both LL into a ArrayList.
        // 2. Sort it by using collection.sort.
        // 3. then create LL from sorted array.
    }
}