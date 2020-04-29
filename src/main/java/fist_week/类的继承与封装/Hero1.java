package fist_week.类的继承与封装;



class hero_base{
	String name;
	float hp; // 血量
}

public class Hero1 extends hero_base {
	public void attack() {
			System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
		}
	Hero1(String name, float hp) {
		this.name = name;
		this.hp = hp;
	}
	// 可变数量的参数  类类型 参数 可关联对象属性
	public void attack(int damage, Hero1... heroAll) {
		for (Hero1 hero : heroAll) {
			//name等于构造方法里传进去的那个名字 hero.name等于 可变形参hero 中的一个人名字
			hero.hp = hero.hp - damage;
			String s = name + "攻击了" + hero.name+damage+"血,"+hero.name+"的最终血量为"+hero.hp;
			System.out.println(s);
		}
	}
//	回当前对象的字符串表达
	public String toString(){
		return name;
	}

   //直接传类的 新对象 然后调用对象的方法
   public void useItem(Item i){
	   System.out.println("hero use item");
	   i.effect(name,"血瓶");
   }

	public static void main(String[] args) {
		Hero1 bh = new Hero1("赏金猎人",1000);

		Hero1 h1 = new Hero1("盖伦",600);
		Hero1 h2 = new Hero1("提莫",300);

		bh.attack();
		// bh这个逼同时攻击三个人
		bh.attack(300,h1, h2,bh);

		LifePotion ii =new LifePotion();
		h2.useItem(ii);
		System.out.println(h2.name);
		System.out.println(h2.hp);


	}

}
