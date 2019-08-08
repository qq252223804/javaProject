package fist_week.interface_enum;

import java.util.ArrayList;

public class MyStringBuffer implements IStringBuffer {
	String str;

	public String toString(){
		return this.str;
	}
	//传object对象
//构造函数--1参数
	public MyStringBuffer(String str){
	this.str = str;
}
	//构造函数--无参
	public MyStringBuffer(){
		this.str = "";
	}

	//追加字符串
	@Override
	public void append(String str) {
		this.str += str;
	}
	//追加字符
	@Override
	public void append(char c) {
		this.str += c;
	}
	//指定位置插入字符
	@Override
	public void insert(int pos, char b) {
		String front = this.str.substring(0, pos);
		String behind = this.str.substring(pos);
		this.str = front + b + behind;
	}
	//指定位置插入字符串
	@Override
	public void insert(int pos, String str) {
		String front = this.str.substring(0, pos);
		String behind = this.str.substring(pos);
		this.str = front + str + behind;
	}
	//从开始位置删除剩下的
	@Override
	public void delete(int start) {
		this.str = this.str.substring(0, start);
	}
	//从start到end删除字符串（删除内容包括start但不包括end）
	@Override
	public void delete(int start, int end) {
		this.str = this.str.substring(0, start) + this.str.substring(end);
	}

	@Override
	public void reverse() {
//		把字符串转为char字符数组
		char[] cs = str.toCharArray();

		String tmp = "";
		System.out.println("反转后字符串是:");
		for (int j = cs.length - 1; j >= 0; j--) {
//			System.out.println((cs[j]));
			tmp+=cs[j];

		}
		System.out.println(tmp);
	}


	@Override
	public int length() {
		return str.length();
	}

	public static void main(String[] args) {
		String str = "高冉是个大傻叉！！";
		MyStringBuffer str1=new MyStringBuffer(str);
		str1.append("一点也没错。");
		System.out.println(str1);
		str1.append('c');
		System.out.println(str1);
		str1.delete(0, 9);
		System.out.println(str1);
		str1.delete(6);
		System.out.println(str1);
		str1.insert(4, '有');
		System.out.println(str1);
		str1.insert(7,"是你的错误");
		System.out.println(str1);
		str1.reverse();
		System.out.println(str1.length());
	}

}

