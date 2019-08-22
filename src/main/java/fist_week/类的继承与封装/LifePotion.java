package fist_week.类的继承与封装;



public class LifePotion extends Item {

	//相当于重写了 父类的方法  隐藏作用
	public void effect(String hero_name,String good_name){
		System.out.println(hero_name+"使用了:"+good_name);
	}

}