package SwordOffer;

public class P011JumpFloorII {
    public static void main(String[] args) {
        P011JumpFloorII main = new P011JumpFloorII();
        int target = 10;
        System.out.println(main.JumpFloorII(target));

    }

    public int JumpFloorII(int target){
        if(target<=0){
            return 0;
        }
        else if(target == 1){
            return 1;
        }else{
            return 2*JumpFloorII(target-1);
        }
    }

    public int JumpFloorII2(int target){
        if(target <= 0){
            return 0;
        }else{
            return 1<<(target-1);
        }
    }
}
