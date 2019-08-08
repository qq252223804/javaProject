package fist_week;


import java.util.Scanner;

public class 格式化format {
	public static String name;

	public static int kill;
	public static void main(String[] args) {
		//1.printf 打印变量
		String Test="%s杀了%d个%n";
		System.out.printf(Test,name="的吗",kill=8);
		//2.format 打印常量
		String name1 ="德玛";
		int kills=9;
		System.out.format(Test, name1, kills);
		String content=String.format(Test, name1, kills);
		System.out.println(content);


		Scanner sc = new Scanner(System.in);
		System.out.println("请输入地名：");
		String location=sc.nextLine();
		System.out.println("请输入公司类型：");
		String Compname=sc.nextLine();
		String test="你输入的地名为%s,输入的公司为%s";
		System.out.format(test,location,Compname);

	}
}
