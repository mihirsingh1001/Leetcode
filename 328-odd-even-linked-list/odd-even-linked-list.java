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
    public ListNode oddEvenList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                odd.add(list.get(i));
            } else {
                even.add(list.get(i));
            }
        }
        even.addAll(odd);

        curr = head;
        int i = 0;
        
        while (curr != null) {
            curr.val = even.get(i);
            curr = curr.next;
            i++;
        }
        return head;
    }
}