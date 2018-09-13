package SwordOffer;

/**
 * @Program: CodingInterviews
 * Created by symsimmy on 2018/9/13
 */
public class P017ReverseList {
    public static void main(String[] args) {
        P017ReverseList main = new P017ReverseList();
        int[] arrays = new int[]{1,2,3,4,5};
        ListNode head = Node.buildListNOde(arrays);

        ListNode node = main.ReverseList(head);
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode ReverseList(ListNode head){
        ListNode in = head;
        ListNode left = null;
        ListNode right = null;
        while(in!=null){
            right = in.next;
            in.next = left;
            left = in;
            in = right;
        }
        return left;
    }
}
