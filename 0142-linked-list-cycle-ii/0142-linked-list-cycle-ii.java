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
//   // Use a HashSet to store visited nodes
//         Set<ListNode> visited = new HashSet<>();
//         ListNode temp = head;

//         while (temp != null) {
//             // If node already seen, cycle detected
//             if (visited.contains(temp)) {
//                 return temp;
//             }
//             visited.add(temp);
//             temp = temp.next;
//         }

//         // No cycle found
//         return null;
           ListNode slow=head;
           ListNode fast=head;
           while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                slow = head;
                while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
            }
           }
           return null;

    }
}