package fist_week;

import java.util.Arrays;

public class 三元运算 {

		private Integer page = 1;
		private Integer start = -1;
		private Integer length = 1;

		public 三元运算(Integer page, Integer length) {
//			(条件表达式)?表达式1:表达式2;
//			如果条件为true，整个表达式结果是表达式1；
//			如果条件为false，整个表达式结果是表达式2；
			//输出结果只有2种要么是1 要么是page
			this.page = page <= 0 ? 1 : page;
			this.length = length;
		}

	public static void main(String[] args) {
		三元运算 a=new 三元运算(0,10);
		System.out.println(a.page);
		System.out.println(a.length);

		//将字符串“110”转换成数字int 110
		int d = Integer.parseInt("110");
//		Integer page=3;
//		d = d+page; int 与interge能相加
		System.out.println(d);
		System.out.println(Integer.valueOf(d));
		//方法1.将数字转为string
		int s=123;
		String s1=String.valueOf(s);
		//方法2.先传interger
		Integer it = s;
		String s2=it.toString();
		System.out.println(s1);
		System.out.println(s+"");
		System.out.println(s2);

	}
}
