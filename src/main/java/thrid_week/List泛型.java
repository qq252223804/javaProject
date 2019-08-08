package thrid_week;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List泛型 {
	public static void main(String[] args) {
		List<String> heros = new ArrayList<>();

		//放5个Hero进入容器
		for (int i = 0; i < 5; i++) {
			heros.add("hero name " +i);
		}

		//第二种遍历，使用迭代器
		System.out.println("--------使用while的iterator-------");
		Iterator<String> it= heros.iterator();
		//从最开始的位置判断"下一个"位置是否有数据
		//如果有就通过next取出来，并且把指针向下移动
		//直到"下一个"位置没有数据
		while(it.hasNext()){
			String h = it.next();
			System.out.println(h);
		}
		// 第一种遍历 for循环
		System.out.println("--------for 循环-------");
		for (int i = 0; i < heros.size(); i++) {
			String h = heros.get(i);
			System.out.println(h);
		}

		// 第三种，增强型for循环
		System.out.println("--------增强型for循环-------");
		for (String h : heros) {
			System.out.println(h);
		}

	}
}
