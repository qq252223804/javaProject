package src.main.on_the_road;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 排序 {
    public static void main(String[] args) {
//        创建一个list数组 对象
        int[] a= new int[] { 18, 62, 68, 82, 65, 9 };
//        排序之前
        System.out.println(Arrays.toString(a));
//        排序之后
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(a, 62));


    }
}
