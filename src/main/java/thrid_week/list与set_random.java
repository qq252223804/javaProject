package thrid_week;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class list与set_random {
	public static void main(String[] args) {
//
//		List中的数据可以重复
//		Set中的数据不能够重复
		List list = new ArrayList();
		//循环数组赋值
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);

		//随机获取50个正整数存到hashset
		HashSet<Integer> hs = new HashSet<>();
		Random random = new Random();
		while (hs.size() < 50) {
			hs.add(random.nextInt(9999));
		}
		System.out.println("得到五十个不重复的随机数：");
		System.out.println(hs);
//		int num=0;
//		for (Integer s : hs) {
//			System.out.print(s + " ");
//			if((num+1)%10==0){
//				System.out.println();
//			}
//			num++;
//		}

	}
}
