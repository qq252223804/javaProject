package fist_week;

import java.util.Arrays;

public class int_string数组sort {
	public static void main(String[] args) {
		int[] b;
		//创建一个长度是5别的数组，并且使用引用b指向该数组
		b = new int[5];
		b[0] = 1;
		b[4] = 10; //下标4，实质上是“第5个”，即最后一个 当为5数组越界
		int[] c = {100,102,444,836,3236};
		String[] d={"a","b","1"};
		System.out.println(Arrays.toString(d));
		System.out.println(d[1]);
		System.out.println(b[4]);
		System.out.println(c[1]);
		System.out.println(b.length);


		int[] a = new int[5];
		int min = 100;
		//循环数组赋值
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		//要想打印数组a 必须 用Arrays.tostring
		System.out.println("赋值后的数组a为"+Arrays.toString(a));
		System.out.println("数组中的各个随机数是:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if (a[i] < min) {
//				循环过程中 取出a[1] 作为min 然后a[2] 与a[1]比谁小作为 min
				min=a[i];
			}
		}
		System.out.println("本练习的目的是，找出最小的一个值: "+min);
		//增强型循环取最大值
		int max=-1;
		for(int i : a) {
			if(max == -1 || max < i) max = i; //循环与上一次的比较大值对比
		}
		System.out.println("数组: "+ Arrays.toString(a) +"最大的元素是: "+ max);
		//数组中的数字排序
		Arrays.sort(a);
		System.out.println("排序后的数组: "+ Arrays.toString(a));
		System.out.println("排序后的各个数字为");
		for (int show:a){
			System.out.println(show);
		}

		//数组反转


		System.out.println("反转后数组中的各个随机数是:");
		for (int j = a.length - 1; j >= 0; j--) {
			System.out.println(a[j]);
		}
		}

}
