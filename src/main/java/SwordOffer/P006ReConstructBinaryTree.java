package SwordOffer;

import java.util.HashMap;

/**
 * @Program: CodingInterviews
 * Created by symsimmy on 2018/9/3
 */
public class P006ReConstructBinaryTree {
    public static void main(String[] args) {
//        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
//        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};

        int[] pre = {1, 2, 3, 4, 5, 6, 7};
        int[] in = {3, 2, 4, 1, 6, 5, 7};

        P006ReConstructBinaryTree main = new P006ReConstructBinaryTree();
        main.reConstructBinaryTree(pre, in);

    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < pre.length; i++) {
            /**
             * 这里有一个小技巧，key存的是in的值，value存的是in的下标，这样后面递归取下标就很方便了，时间复杂度O(1)
             * 注意存的是中序序列,
             */
            map.put(in[i], i);
        }

        return preIn(pre, 0, pre.length - 1, in, 0, in.length - 1, map);

    }

    private TreeNode preIn(int[] p, int pi, int pj, int[] n, int ni, int nj, HashMap<Integer, Integer> map) {

        // 这里退出递归
        if (pi > pj) {
            return null;
        }

        TreeNode head = new TreeNode(p[pi]);
        //获取原中序序列的子树的根节点的下标
        int index = map.get(p[pi]);

        head.left = preIn(p, pi + 1, pi + (index - ni), n, ni, index - 1, map);
        head.right = preIn(p, pi + index - ni + 1, pj, n, index + 1, nj, map);

        return head;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

