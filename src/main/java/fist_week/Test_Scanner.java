package fist_week;

import java.util.Scanner;

public class Test_Scanner {

	public static void main(String[] args) {
//    定义2个输入对象
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
//
//		// 判断是否还有输入
//		String s1,s2;
//		if (scan.hasNextLine()) {
//			s1 = scan.next();
//			System.out.println("输入的第一个字符串:" + s1);
//			s2 = scan.next();
//			System.out.println("请输入第二个字符串:" + s2);
//			System.out.println(s1 + s2);
//		}

		int i ;
		float f ;
		System.out.print("输入整数：");
		if (scan.hasNextInt()) {
			// 判断输入的是否是整数
			i = scan.nextInt();
			// 接收整数
			System.out.println("整数数据：" + i);

		} else {
			// 输入错误的信息
			System.out.println("输入的不是整数！");
		}
		System.out.print("输入小数：");
		if (scan2.hasNextFloat()) {
			// 判断输入的是否是小数
			f = scan2.nextFloat();
			// 接收小数
			System.out.println("小数数据：" + f);

		} else {
			// 输入错误的信息
			System.out.println("输入的不是小数！");
		}
//			scan.close();
	}
}



