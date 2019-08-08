package fist_week.类的继承与封装;


public class Test2 extends Test1 {
	@Override
	public  void show_name(String good,int num){

		System.out.println("Apple");
	}

	public static void main(String[] args) {
		Test2 a=new Test2();
		// 此处标明 调用新复写的方法，//复写的方法 重新传值不会 打印原方法内容 非继承
		a.show_name("飞机",2);


		Test1 b=new Test1();
		b.show_name("苹果",2);
		// 只有new一个父类的对象 调用自己的方法 才会执行里面内容

		Hero1 bh = new Hero1("赏金猎人",1000);

		Hero1 h1 = new Hero1("盖伦",600);
		Hero1 h2 = new Hero1("提莫",300);

		bh.attack();
		// bh这个逼同时攻击三个人
		bh.attack(300,h1, h2,bh);

	}
}
