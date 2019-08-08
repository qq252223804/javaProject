package fist_week;

import java.util.Scanner;

public class 字符串转数组 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s = scan.nextLine();
//		转换为字符数组后，筛选出控制台读取到的字符串中的大写字母和数字，并打印出来
		char  s1[] = s.toCharArray();
		System.out.println(s1);
		//循环数组的内容
		for(char i: s1) {
			//用||或 or的意思
			if(Character.isUpperCase(i) || Character.isDigit(i))
				System.out.print(i);
		}

	}
}