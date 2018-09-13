package SwordOffer;

/**
 * @Program: CodingInterviews
 * Created by symsimmy on 2018/9/13
 */
public class P016FindKthInTail {

    private  ListNode head = null;

    public static void main(String[] args) {
        P016FindKthInTail main = new P016FindKthInTail();
        int[] arrays = new int[]{1,2,3,4,5,6,7,8,9};
        ListNode head = Node.buildListNOde(arrays);

        System.out.println(main.FindKthToTail(head,8).toString());
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        if(k<=0 || head == null){
            return null;
        }

        int i =0;
        ListNode right = head;

        while(i<k && right!= null){
            right = right.next;
            i++;
        }

        if(i<k && right == null){
            return null;
        }

        ListNode left = head;

        while(right!=null){
            left = left.next;
            right = right.next;
        }

        return left;
    }
}


