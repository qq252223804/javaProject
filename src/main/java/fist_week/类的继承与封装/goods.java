package fist_week.类的继承与封装;
class good_base {

	String good_name;
	int good_price;
}
public class goods extends good_base {
	int add_damage; //加攻击力
	int add_blood; //加血
	int add_speed; //加速度


	public void getAdd_blood(String good_name) {
		switch (good_name) {
			case "血瓶":
				add_blood = 100;
				good_price = 50;
				break;
			case "鞋子":
				add_speed = 300;
				good_price = 300;
				break;
			case "长剑":
				add_damage = 80;
				good_price = 150;
				break;
		}
	}

	public static void main(String[] args) {

		goods name2 = new goods();
		name2.getAdd_blood("血瓶");

		System.out.println(name2.good_price);
		System.out.println(name2.add_blood);
	}
}