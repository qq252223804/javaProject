package fist_week.类的继承与封装;

public class Lol {

	//主运行函数
	public static void main(String[] args) {

		Person name1 = new Person("dema", 100 ,120, 1000);
		Person name2 = new Person("timo", 40,110, 1000);
		name1.buy_goods("血瓶");
		name1.buy_goods("大保健");
		name2.buy_goods("鞋子");

		//开始互相伤害
		name1.attack(40,name2);
		name2.keng();
		//timo开始复活自己
		name2.useItem("救心丸");
		name2.revive(name2);

		System.out.println(name2.getName()+"复活后的血量:"+name2.getBlood()+
		" 他得速度为:"+name2.speed+" 他的金钱为:"+name2.price);

		name2.attack(80,name1);
		name2.legendary();
//类方法调用
		Person.judge(name1,name2);

	}
}

