package fist_week;

public class Test1 {
	//	static表明方法是静态的,不依赖类的对象的,是属于类的,在类加载的时候main()方法也随着加载到内存中去
//	可以直接在main方法里test2()不用实例化类对象
//	void关键字表明main()的返回值是无类型。
	public static void test2() {
		System.out.println("方法2");
	}

	public void test1() {
		System.out.println("方法1");
	}

	static int i = 1; //属性名是i

	public void method1(int i) { //参数也是i
		System.out.println(i);
	}

	public static void main(String[] args) {
//		类的实例化
		Test1 t = new Test1();
		t.test1();
		System.out.println("hello world");
		//static 类自己的方法
		test2();
		//不用实例化
		new Test1().method1(i);


	}
}

