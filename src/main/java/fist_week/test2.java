package fist_week;

public class test2 {


	public static void main(String[] args) {

		int a = 1;
		int b = 1;

		for (int i = 1; i <= 10; i++) {
			//循环打印a,b两个数，即两个两个打印
			System.out.print(a + "\t" + b + "\t");
			//打印第三、四个数
			a = a + b;
			b = a + b;
		}
//		for (int cc = 1; cc <= 9; cc++) {
//			for (int dd = 1; dd <= cc; dd++) {
//				System.out.print(
//						dd + "*" + cc + "=" + cc * dd+"\t"
//				);
//			}
//			System.out.println();
//		}
	}

}
