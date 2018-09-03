package SwordOffer;

import java.util.*;

/**
 * @Program: CodingInterviews
 * Created by symsimmy on 2018/9/3
 */
public class P005PrintListFromTailToHead {

    private static ListNode head = null;
    private static ListNode tmp = null;

    public static void main(String[] args) {

        for(int i =0;i<10;i++){
           addNode(i);
        }

        System.out.println(printListFromTailToHead(head).toString());
    }

    public static void addNode(int val){
        ListNode node = new ListNode(val);

        if(head == null){
            head = node;
            return;
        }

        tmp = head;//临时变量，充当指针

        while (tmp.next != null){
            tmp = tmp.next;
        }

        tmp.next = node;
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList= new ArrayList<Integer>();

        Stack<Integer> stack = new Stack<Integer>();

        if (listNode == null){
            return null;
        }

        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while (!stack.empty()){
            arrayList.add(stack.pop());
        }

        return arrayList;

    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
