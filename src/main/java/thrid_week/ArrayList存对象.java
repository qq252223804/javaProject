package thrid_week;

import java.util.ArrayList;

public class ArrayList存对象 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		//容器类ArrayList，用于存放对象
		ArrayList<String> heros = new ArrayList<>();
		heros.add("盖伦");
		System.out.println(heros.size());

		//容器的容量"capacity"会随着对象的增加，自动增长
		//只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
		heros.add("提莫");
		System.out.println(heros.size());
		System.out.println(heros);


		//创建一个 List集合
		ArrayList<Integer> list = new ArrayList();
		//为集合添加对象
		list.add(11);
		//添加对象
		list.add(12);
		//可得出容量增加
		System.out.println(list);

	}
}
