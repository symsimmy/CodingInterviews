package SwordOffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Program: CodingInterviews
 * Created by symsimmy on 2018/9/10
 */
public class P015ReOrderArray {
    public static void main(String[] args) {
        P015ReOrderArray main = new P015ReOrderArray();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};

        main.reOrderArray2(array);
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    /**
     * 用冒泡算法,这个是稳定的
     *
     * @param array
     */
    public void reOrderArray(int[] array) {
        if (array.length <= 1) {
            return;
        }
        boolean isSwap = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] % 2 == 1 && array[j - 1] % 2 == 0) //前偶后奇交换
                {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    isSwap = true;
                }

            }
            if (!isSwap) {
                break;
            }
        }
    }

    public void reOrderArray2(int[] array) {
        if (array.length <= 1) {
            return;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<Integer> queue2 = new LinkedList<Integer>();

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                queue.offer(array[i]);
            } else {
                queue2.offer(array[i]);
            }
        }

        int i = 0;
        for (Integer q : queue2) {
            array[i++] = q;
        }

        for (Integer q : queue) {
            array[i++] = q;
        }
    }


    /**
     * 虽然只有一趟,但也是不稳定的
     *
     * @param a
     */
    public void reOrderArray3(int[] a) {
        if (a.length <= 1) {
            return;
        }

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            while (i < j && a[i] % 2 != 0) {
                i++;
            }
            while (i < j && a[j] % 2 == 0) {
                j--;
            }
            if (i < j) {
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
            }
        }
    }

    /**
     * 这种写法是快排的,是不稳定的
     * 我需要选一种稳定的
     *
     * @param array
     */
    public void reOrderArray4(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        int X = array[i];
        while (i < j) {
            while (i < j && array[j] % 2 == 0) {
                j--;
            }
            if (i < j) {
                array[i] = array[j];
                i++;
            }

            while (i < j && array[i] % 2 != 0) {
                i++;
            }
            if (i < j) {
                array[j] = array[i];
                j--;
            }
            array[i] = X;
        }
    }
}
