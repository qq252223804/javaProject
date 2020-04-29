package fist_week;

public class trim_indexof_replaceAll {
	public static void main(String[] args) {
		String content="1盖伦,在进行了连续8次击杀后,获得了超神 的称号 ";
		//去掉首尾空格 trim
		System.out.println(content.trim());
		System.out.println(content);
//		indexOf 判断字符或者子字符串出现的位置 空格也算一个索引位
//		contains 是否包含子字符串
		System.out.println(content.indexOf("1"));
		System.out.println(content.indexOf("超神"));//字符串第一次出现的位置
		System.out.println(content.lastIndexOf("了")); //字符串最后出现的位置
		System.out.println(content.contains("击杀")); //是否包含字符串"击杀"

//		replaceAll 替换所有的
//		replaceFirst 只替换第一个
		String temp=content.replaceAll("击杀","被击杀");
		System.out.println(temp);
		//在temp的基础上再替换一次
		temp = temp.replaceAll("超神", "超鬼");
		System.out.println(temp);
		System.out.println(content.replaceFirst(",",":"));






	}
}
