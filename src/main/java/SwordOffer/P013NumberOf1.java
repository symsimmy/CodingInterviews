package SwordOffer;

public class P013NumberOf1 {
    public static void main(String[] args) {
        P013NumberOf1 main = new P013NumberOf1();
        int target = -1;
        System.out.println(main.NumberOf1(target));
    }


    public int NumberOf1(int n) {
        if (n == 0) {
            return 0;
        }
        int t = 0;
        char[] ch = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '1') {
                t++;
            }
        }

        return t;
    }

}