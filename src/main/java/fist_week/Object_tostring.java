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
	public static Object obj_toStrings(Object obj){
		return obj;
	}

//	toString方法可以将任何一个对象转换成字符串返回
	public String toString(){

		return "Student:" + "name=" + name + ",age=" + age;

	}


//封装静态方法obj_toStrings
	void f(Object obj) {
//		只是多一步打印
		System.out.println(obj);
		Object_tostring.obj_toStrings(obj);

	}
	public static void main(String[] args) {



		int[] array = new int[4];
		for(int i=0;i<array.length;i++) {
			array[i] = (int) (Math.random() * 10 + 11);
			System.out.println(array[i]);

		}
		System.out.println(Arrays.toString(array));

		Object_tostring exam = new Object_tostring();
		exam.obj_toStrings(Arrays.toString(array));

		System.out.println(exam.toString());


	}

}