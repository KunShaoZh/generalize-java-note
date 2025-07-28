package mianshi;

/**
 * 找出数组中相邻后一个元素比前一个元素大的索引，并计算出差值，放入新数组中。
 *
 * */
public class Mianshi01 {
    public static void main(String[] args) {

        int [] a = {73, 74, 75, 71, 69, 72, 76, 73};

        int [] b = {1, 1, 4, 2, 1, 1, 0, 0};

        int [] c = new int[8];

        // 时间复杂度n2
        for (int i = 0; i < a.length; i++) {
            System.out.println("i="+i);
            // 数组的长度会影响遍历元素索引的最大值，如果改变起始位置遍历剩余元素，数组的长度依然是不变的，改变遍历的起始位置就是在遍历剩余元素。
            for (int j = i; j < a.length; j++) {
                System.out.println("j=" + j);
                System.out.println("a[i]的值为：" + a[i]);
                System.out.println("a[j]的值为：" + a[j]);
                if(a[j] > a[i] ) {
                    c [i] = j - i;
                    break;
                }
            }
            System.out.println("结束");
        }

        for (int i : c) {
            System.out.println(i);
        }


    }
}
