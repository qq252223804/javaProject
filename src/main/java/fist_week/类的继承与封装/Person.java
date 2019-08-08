package fist_week.类的继承与封装;



public class Person {
	public String name;
	public int blood;
	public int speed;
	public int price;

	//构造函数
	Person(String name, int blood, int speed, int basie_price) {
		this.name = name;
		//基础血量都定义为300
		this.blood = blood;
		this.speed = speed;
		this.price = basie_price;

	}

	public void addSpeed(int speed) {
		this.speed += speed;
		System.out.println(this.name + "加速成功，速度:" + this.speed);
	}

	public void addBlood(int blood) {
		this.blood += blood;
		System.out.println(this.name + "加血成功，血量:" + this.blood);

	}

	//	//类类型传参  类型+ 参数
//	public void dellBlood(Person name1,Person name2,int blood) {
//		name2.blood -= blood;
//		System.out.println(name1.getName() + "攻击了"+name2.getName()+"他的血量最终为:" + name2.blood);
//
//	}
	// 可变数量的参数  类类型 参数 可关联对象属性
	public void attack(int damage, Person... heroAll) {
		for (Person hero : heroAll) {
			//name等于构造方法里传进去的那个名字 hero.name等于 可变形参hero 中的一个人名字
			hero.blood = hero.blood - damage;
			String s = this.name + "攻击了" + hero.name + damage + "血," + hero.name + "的最终血量为" + hero.blood;
			System.out.println(s);
		}
	}

	//获取血量值
	public int getBlood() {
//		System.out.println(this.blood);
		return this.blood;

	}

	//获取移动速度
	public int getSpeed() {
//		System.out.println(this.speed);
		return this.speed;

	}

	//获取名字
	public String getName() {
		return name;
	}

	//超神
	public void legendary() {
		System.out.println("超神！");
	}

	//坑队友
	public void keng() {
		System.out.println("坑队友！");
	}

	//复活
	public void revive(Person person) {
		person.blood = 300;
	}


	//购物 花钱类
	public void fuPrice(String good_name, int price) {
		this.price -= price;
		System.out.println(this.name + "购买" + good_name + "成功，余额:" + this.price);
	}

	//购物方法
	public void buy_goods(String good_name) {
		goods good = new goods();
		switch (good_name) {
			case "血瓶":
				good.getAdd_blood("血瓶");
				fuPrice("血瓶", good.good_price);
				addBlood(good.add_blood);
				break;
			case "鞋子":
				good.getAdd_blood("鞋子");
				fuPrice("鞋子", good.good_price);
				addSpeed(good.add_speed);
				break;
			case "长剑":
				good.getAdd_blood("长剑");
				fuPrice("鞋子", good.good_price);
				addSpeed(good.add_damage);
				break;
			default:
				System.out.println("没有此类商品:" + good_name);
				break;
		}


	}

	//使用物品方法
	//直接传类的 新对象 然后调用对象的方法
	public void useItem( String good_name) {
		System.out.println(name+" use item："+good_name);

	}

	//判断方法 用于判断谁的属性(血量，速度)更大
	//比较两个Person的实例，那就入参里面传两个name 叫实例化对象
	public static void judge(Person name1, Person name2) {
		System.out.println(name1.getName()+"血量:"+name1.getBlood()+name2.getName()+"血量"+name2.getBlood());
		System.out.println(name1.getName()+"速度:"+name1.getSpeed()+name2.getName()+"速度"+name2.getSpeed());
		if (name1.getBlood() > name2.getBlood()) {
			System.out.println(name1.getName() + ":现在更肉");
		} else {
			System.out.println(name2.getName() + ":现在更肉");
		}
		if (name1.getSpeed() > name2.getSpeed()) {
			System.out.println(name1.getName() + "现在跑的更快");
		} else {
			System.out.println(name2.getName() + "现在跑的更快");
		}

	}

}