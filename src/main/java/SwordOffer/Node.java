package SwordOffer;

/**
 * @Program: CodingInterviews
 * Created by symsimmy on 2018/9/13
 */

public class Node {
    static ListNode head = null;

    public static ListNode buildListNOde(int[] input) {
        ListNode first = null, last = null, newNode;
        if (input.length > 0) {
            for (int i = 0; i < input.length; i++) {
                newNode = new ListNode(input[i]);
                newNode.next = null;
                if (first == null) {
                    first = newNode;
                    last = newNode;
                } else {
                    last.next = newNode;
                    last = newNode;
                }
            }
        }
        return first;
    }

    public static ListNode removeElements(int val) {
        if (head == null) {
            return null;
        }
        ListNode p = head, q = head.next;
        while (q != null) {
            if (q.val == val) {
                p.next = q.next;
                q = q.next;
            } else {
                p = p.next;
                q = q.next;
            }
        }
        if (head.val == val) {
            return head.next;
        }
        return head;

    }


    public static void addNode(int val) {
        ListNode node = new ListNode(val);

        if (head == null) {
            head = node;
            return;
        }

        ListNode tmp = head;//临时变量，充当指针
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next.val +
                '}';
    }
}
