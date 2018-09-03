package SwordOffer;

public class P008MinNumberInRotateArray {
    public static void main(String[] args) {
        int[] array= {3,4,5,1,2};
        P008MinNumberInRotateArray main = new P008MinNumberInRotateArray();
        System.out.println(main.minNumberInRotateArray(array));
    }

    public int minNumberInRotateArray(int [] array) {

        if(array.length == 0){
            return 0;
        }

        if(array.length == 1){
            return array[0];
        }


        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return array[i+1];
            }else{
                if(i == array.length-2){
                    return array[0];
                }
            }
        }

        return 0;

    }
}
