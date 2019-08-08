package fist_week.类的继承与封装;

public  class Test1 {
	public void show_name(String Fruit,int num){
		System.out.println(Fruit+":"+num);
	}

	public static void main(String[] args) {

		Test1 apple  = new Test1();
		apple.show_name("苹果",2);
	}
}
