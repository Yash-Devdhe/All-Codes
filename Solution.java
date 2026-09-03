class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }
}

class Solution {

    public ListNode insertAtHead(ListNode head, int X) {

        ListNode curr = new ListNode();

        curr.val = X;
        curr.next = head;
        head = curr;

        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);

        Solution obj = new Solution();

        head = obj.insertAtHead(head, 5);

        System.out.println(head.val);
        System.out.println(head.next.val);
    }
}