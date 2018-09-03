package SwordOffer;

/**
 * @Program: CodingInterviews
 * Created by symsimmy on 2018/9/3
 */
public class P003Find {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        int target = 7;

        System.out.println(Find(target, array));
    }

    public static boolean Find(int target, int[][] array) {
        int row = array.length;
        int col = array[0].length;

        for (int i = row - 1, j = 0; (i >= 0 && i < row) && (j >= 0 && j < col); ) {

            if (target == array[i][j]) {
                return true;
            } else if (target < array[i][j]) {
                i--;
            } else {
                j++;
            }
        }

        return false;

    }
}
