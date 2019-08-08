package fist_week;

public class Swith_break_continue {
	public   void breakSwitch1() {
		int n = 2;
		switch (n) {
			case  1:
				System.out.println("this is one.");
				break; //如果注释会继续执行后续代码

			case 2:
				System.out.println("this is two.");
				break;

//				如果n!=1&2 直接执行default
			default:
				System.out.println("Others.");
		}
	}
	public static void main(String[] args){
//		实例化一个test_switch类对象
		Swith_break_continue test_switch= new Swith_break_continue();
//		类的方法调用
		test_switch.breakSwitch1();
		//忽略倍数
		//打印 1-100 之间的数，如果这个数，要么是3，要么5的倍数，就忽略掉
		for(int i = 0;i<=100;i++) {
			if (i%3==0||i%5==0) {
				continue;
			}
			System.out.println(i);
		}

		//打印单数
		for (int j = 0; j < 10; j++) {
			if(0==j%2)
				continue; //如果是双数，后面的代码不执行，直接进行下一次循环

			System.out.println(j);
		}
//		打印单数
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				System.out.println(a + ":" + b);
				if (0 == b % 2)
					break; //如果是双数，结束当前循环
			}

		}
		boolean breakout = false; //是否终止外部循环的标记
		for (int i = 1; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				System.out.println(i + ":" + j);
				if (0 == j % 2) {
					breakout = true; //终止外部循环的标记设置为true
					break;
				}
			}
			if (breakout) //判断是否终止外部循环
				break;
		}
		//打印单数
		outloop: //outloop这个标示是可以自定义的比如outloop1,ol2,out5
		for (int i = 2; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				System.out.println(i+":"+j);
				if(0==j%2)
					break outloop; //如果是双数，结束外部循环
			}

		}
	}

}
