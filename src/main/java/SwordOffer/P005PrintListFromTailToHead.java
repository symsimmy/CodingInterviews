package SwordOffer;

import java.util.*;

/**
 * @Program: CodingInterviews
 * Created by symsimmy on 2018/9/3
 */
public class P005PrintListFromTailToHead {

    public static void main(String[] args) {
        int[] arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        ListNode head = Node.buildListNOde(arrays);
        System.out.println(printListFromTailToHead(head).toString());
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        if (listNode == null) {
            return null;
        }
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;

    }
}


