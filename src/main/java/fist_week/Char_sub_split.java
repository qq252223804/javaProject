package fist_week;

public class Char_sub_split {
	public static void main(String[] args) {
		String content="的吗,杀了8个,超神了";
		String sentence = "Garen";
		//charAt(int index)获取指定位置的字符
		char c=content.charAt(0);
		char d=content.charAt(6);
		System.out.println(c);
		System.out.println(d);
		//获取对应的字符数组
		char[] cs = content.toCharArray();
		System.out.println(content.length() == cs.length);
//		subString截取子字符串  截取从第3个开始的字符串 （基0）
		System.out.println(content.substring(3));
//		subString截取子字符串  截取从第0-3个开始的字符串 （基0）
		System.out.println(content.substring(0,3));
		System.out.println("=========");
//		打印数组 定义的数组对象无法打印出内容 必须循环出
		String list1[]=content.split(",");
		for (String i :list1){
			System.out.println(i);
		}

		//全部变成小写
		System.out.println(sentence.toLowerCase());
		//全部变成大写
		System.out.println(sentence.toUpperCase());




	}
}
