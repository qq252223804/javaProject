package fist_week.类的继承与封装;

public class APHero  extends Hero1 implements AP{
	//ADhero类继承 Hero父类 并实现 AD抽象类
	public APHero(String name, float hp) {
		super(name, hp);
		super.attack();
	}

	@Override
	public void magicAttack(Hero1 hero,int damage) {

			hero.hp = hero.hp - damage;
			System.out.print(name + "攻击了" + hero.name + ",他受到魔法攻击伤害:" + damage);
			System.out.println(hero.name + "最终血量为" + hero.hp);

		}

	public static void main(String[] args) {

		APHero name1=new APHero("德玛",1000);
		APHero name2=new APHero("TIMO",1000);

		name2.magicAttack(name1,70);
	}
}
