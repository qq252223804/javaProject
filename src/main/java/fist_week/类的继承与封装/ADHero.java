package fist_week.类的继承与封装;

import javax.print.attribute.standard.MediaSize;

public class ADHero extends Hero1 implements AD{
//ADhero类继承 Hero父类 并实现 AD抽象类
	public ADHero(String name, float hp) {
		super(name, hp); //引用父类的变量属性
	}

	//重写AD抽象类的physicAttack方法
	@Override
	public void physicAttack(Hero1 hero,int damage) {

			hero.hp = hero.hp - damage;
			System.out.print(name+"攻击了"+hero.name+",他受到物理攻击伤害:"+damage);
			System.out.println(hero.name+"最终血量为"+hero.hp);
		}




	public static void main(String[] args) {

		ADHero name1=new ADHero("赏金猎人",1000);
		ADHero name2=new ADHero("德玛",1000);
		name1.physicAttack(name2,30);
		name2.physicAttack(name1,70);
	}
}
