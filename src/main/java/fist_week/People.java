package fist_week;

public class People{
	//年龄
	int age;
	//姓名
	String name;
	//身高
	float height;
	public void eat(){
		System.out.println("我会吃饭");
	}

	public static void main(String[] args){
//实例化一个人类，名字叫张三
		People zhangsan = new People();
//给张三赋属性年龄18，名字zhangsan，身高171.1f
		zhangsan.eat();
		zhangsan.age = 18;
		zhangsan.name = "zhangsan";
		zhangsan.height = 171.1f;

		System.out.println("年龄："+zhangsan.age+" 姓名："+zhangsan.name+"身高："+zhangsan.height);

		String a="abcd"; /* 静态区域存储*/
		String b=new String("abcd");  /* 堆内存存储*/
		String c=new String("abcd");  /* 堆内存存储*/
		String d="abcd";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a==d);
		System.out.println(b.equals(c));
//		因为new生成的是两个对象，其内存地址不同
		System.out.println(b==c);

		System.out.println(1+'1');
		System.out.println(1+1);
		System.out.println(1+" 1");
		System.out.println("a"+"b");
		System.out.println("a"+1);
//		String类中有一个charAt方法来获取字符串中的字符
		String s = "nihaoHHH换行";
		System.out.println(s.charAt(1));
		System.out.println(s.toCharArray()[8]);
//		int数组取值
		int[]  smallPrimes = { 17,19,21,23,25,27 };
		System.out.println(smallPrimes[1]);
//		Integer类型的valueOf范围 -128-127
//		f1与f2引用的是用一地址范围  f3与f4引用的不是同一地址
		Integer f1=100 ,f2=100,f3=150,f4=150;
		System.out.println(f1==f2);//true
		System.out.println(f3==f4); //false
		Integer i = new Integer(100);
		Integer j = new Integer(100);
		System.out.println(i == j); //false
//		一元与二元运算符
		int aa=5;
		int bb,cc;
		bb = +aa; //正值
		System.out.println(bb);
		System.out.println("bb="+bb);
		cc = -aa; //负值
		System.out.println("cc="+cc +",aa="+aa);
		int l = 2;
		int f = ++l; //先l=l+1;再f=l
		System.out.println("pl="+f+",l="+l);
		//1左移3位  1=2的0次方 二进制补码 0000 0001 左移3:0000 1000 十进制为8
		System.out.println(1<<3);
		//8右移3位 8=2的三次方 二进制补码 0000 1000 右移3：0000 0001 十进制为1
		System.out.println(8>>3);



	}
}
