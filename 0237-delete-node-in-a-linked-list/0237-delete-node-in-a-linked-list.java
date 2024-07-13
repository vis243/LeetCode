/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        /*for(int i=0;i<ListNode.size();i++){
            if(ListNode.get(i)==node){
                ListNode.get(i).next=ListNode.get(i).next.next;
            }
        }
        return head;*/
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}