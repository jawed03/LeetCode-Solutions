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
    
    // Create new node(temp) to link all node into sorted order
        ListNode temp = new ListNode();
    // To hold reference of temp's head
        ListNode tempHead = temp;

        ListNode curr1 = list1;
        ListNode curr2 = list2;

    // For null node
        if(curr1 == null)
        return curr2;
        if(curr2 == null)
        return curr1;

    // Iterate till reach end of any list
        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                temp.next = curr1;
                temp = temp.next;
                curr1 = curr1.next;
            }
            else{
                temp.next = curr2;
                temp = temp.next;
                curr2 = curr2.next;
            }
        }

    // Link nodes of list1 if any node remain
        while(curr1 != null){
            temp.next = curr1;
            temp = temp.next;
            curr1 = curr1.next;
        }

    // Link nodes of list2 if any node remain
        while(curr2 != null){
            temp.next = curr2;
            temp = temp.next;
            curr2 = curr2.next;
        }
        return tempHead.next;


                // Brute Force Method
        // 1. store all the elements of both LL into a ArrayList.
        // 2. Sort it by using collection.sort.
        // 3. then create LL from sorted array.
    }
}