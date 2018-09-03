package SwordOffer;

public class P012RectCover {
    public static void main(String[] args) {
        P012RectCover main = new P012RectCover();
        int target = 10;
        System.out.println(main.RectCover(target));
    }

    public int RectCover(int target) {
        if (target < 1) {
            return 0;
        } else if (target == 1 || target == 2) {
            return target;
        } else {
            return RectCover(target-1) + RectCover(target-2);
        }
    }
}
