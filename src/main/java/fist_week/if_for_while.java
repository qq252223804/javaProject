package fist_week;

import java.util.Random;

public class if_for_while {
	public static void main(String[] args) {
		int p = 5;
		if (p > 5)
			System.out.println("大于5");
		if (p <= 5)
			System.out.println("小于等于5");
		int m = 0;
		for (int i = 1; i <= 10; i++) {
			m += i;// m=m+i
		}
		System.out.println(m);
//        while 循环体
		int sum = 0;                    //定义初始和为0
		int i = 1;                        //定义开始求和的第一个数
		while (i <= 100) {                //判断条件语句
			sum += i;                    //sum = sum + i;
			i++;                        //让变量i自增
		}
		System.out.println(sum);

		int sums = 0, i1 = 1;
		do {
			sums += i1;
			i1++;
		} while (i1 <= 100);
		System.out.println(sums);

//		存在多个判断
		Random rand=new Random();
//		随机生成50-101 的随机整数 50包括101不包括
//		int a = rand.nextInt(51) + 50;
//		Math.list与set_random() 会得到一个0-1之间的随机浮点数，然后乘以100，并强转为整型即可。
		int a = (int) (Math.random() * 100);
			System.out.println(a);
		if (a >= 90 & a <= 100) {
			System.out.println("优秀");
		} else if (a >= 80 & a < 90) {
			System.out.println("良好");
		} else if (a >= 60 & a < 80) {
			System.out.println("及格");
		} else {
			System.out.print("不及格");
		}



	}
}
