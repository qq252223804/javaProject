package fist_week;

import java.util.Arrays;

public class cope_int数组 {
	public static void main(String[] args) {
		int a [] = new int[]{18,62,68,82,65,9};

		int b[] = new int[3];//分配了长度是3的空间，但是没有赋值
		//通过数组赋值把，a数组的前3位赋值到b数组
		//方法一： for循环
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
			System.out.print(b[i] + " ");
		}
		//方法二: System.arraycopy(src, srcPos, dest, destPos, length)
		//src: 源数组
		//srcPos: 从源数组复制数据的起始位置
		//dest: 目标数组
		//destPos: 复制到目标数组的启始位置
		//length: 复制的长度
//		System.arraycopy(a, 0, b, 0, 3);
//		System.out.println(Arrays.toString(b));
//		方法三：仅仅适用于复制单个数组 不能合并数组
//		Arrays.copyOfRange(源数组,起使位置，结束位置) 起使位置是从0计算
		int[] bf = Arrays.copyOfRange(a, 3, 6);
		System.out.println(Arrays.toString(bf));

		//合并数组
		int[] c= new int[5];
		int[] d=new int[4];
		//循环数组赋值
		for (int i=0;i<c.length;i++) {
			//Math.list与set_random() 生成【0,1)的随机数 1不包含
			c[i] = (int) (Math.random() * 6+5); //随机生成5-10的数
//			System.out.println(c[i]);
		}
		System.out.println("第一个数组C:"+Arrays.toString(c));
		for (int i=0;i<d.length;i++) {
			d[i] = (int) (Math.random() * 11 + 10); //随机生成10-20的数
		}
		System.out.println("第二个数组d:"+Arrays.toString(d));
		System.out.println(c.length + d.length);
//// 合并两个数组
		int[] cd = new int[c.length + d.length];
		System.arraycopy(c, 0, cd, 0, c.length);
		System.arraycopy(d, 0, cd, c.length, d.length);
		System.out.println("合并后的数组为"+Arrays.toString(cd));

// 合并后再反转cce
		System.out.println("反转后数组中的各个随机数是:");
		for (int j = cd.length - 1; j >= 0; j--) {
			System.out.println(cd[j]);
		}


	}
}
