package fist_week.类的继承与封装;

public   class ADAPHero extends Hero1 implements AD,AP {
//	ADhero类继承 Hero父类 并实现 AD抽象类

//	super引用父类的对象 直接赋值
	public ADAPHero() {
		super("zhangsan",1000);
	}
	//重写AD抽象类的physicAttack方法
	@Override
	public void physicAttack(Hero1 hero,int damage) {

		hero.hp = hero.hp - damage;
		System.out.print(name+"攻击了"+hero.name+",他受到物理攻击伤害:"+damage);
		System.out.println(hero.name+"最终血量为"+hero.hp);
	}
	@Override
	public void magicAttack(Hero1 hero,int damage) {

		hero.hp = hero.hp - damage;
		System.out.print(name + "攻击了" + hero.name + ",他受到魔法攻击伤害:" + damage);
		System.out.println(hero.name + "最终血量为" + hero.hp);

	}

	public static void main(String[] args) {
		ADAPHero hero1=new ADAPHero();
		ADHero name1=new ADHero("赏金猎人",1000);
		name1.physicAttack(hero1,300);
	}

}
