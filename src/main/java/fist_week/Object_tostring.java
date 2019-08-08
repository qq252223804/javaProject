package fist_week;

import java.util.Arrays;

public class Object_tostring {
	private String name="张三";
	private int age=23;
	public void Object_tostring(){
		System.out.println("不带参数的构造器");
	}
	public void Object_tostring(Object obj){
		System.out.println("可以传任意参数的构造器"+obj);
	}
	//传object对象
	public static Object toStrings(Object obj){
		return obj;
	}

//	toString方法可以将任何一个对象转换成字符串返回
	public String toString(){

		return "Student:" + "name=" + name + ",age=" + age;

	}


//封装静态方法tostrings
	void f(Object obj) {
		System.out.println(obj);
		Object_tostring.toStrings(obj);

	}
	public static void main(String[] args) {

		Object_tostring exam = new Object_tostring();

		int[] array = new int[4];
		for(int i=0;i<array.length;i++) {
			array[i] = (int) (Math.random() * 10 + 11);
			System.out.println(array[i]);

		}
		exam.f(Arrays.toString(array));

		System.out.println(exam.toString());


	}

}