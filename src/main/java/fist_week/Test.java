package fist_week;

public class Test {
	public static void main(String[] args) {
		System.out.println("-------continue测试----------");
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				System.out.println("跳过下面输出语句，返回for循环");
				continue;
			}

			System.out.println(i);
		}


		System.out.println("----------break测试----------");
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				System.out.println("跳过下面输出语句，跳出for循环");
				break;
			}
			System.out.println(i);
		}


	}

}
