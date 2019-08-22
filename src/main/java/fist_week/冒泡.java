package fist_week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 冒泡 {
	public static void main(String[] args) {
		int[] a= new int[20];
		int c;
		//随机生成一个10-30的正整数，放到a中
		//对这20个正整数进行从小到大排序
		//对20个数据进行去重
		for(int i=0;i<20;i++){
			a[i]=(int)(Math.random()*20+11);
		}
		//冒泡排序 第一轮循环是 记录扫描次数 第二次循环是 进行这一轮的冒泡排序
		for(int j=19;j>0;j--){
			for (int k=0;k<j;k++){
				//从第一个元素开始和下一个比较，比下一个大则交换
				if(a[k]>a[k+1]){
					c=a[k];
					a[k]=a[k+1];
					a[k+1]=c;
				}
			}

		}
		System.out.println(Arrays.toString(a));

//		去除原始List中的重复元素
		//创建一个list泛型
		List<Integer> list = new ArrayList<>();
//		for(int kk:a){

//			System.out.println(kk);
//		}
		for (int kk=0;kk<a.length;kk++) {
			if (!list.contains(a[kk])){
				list.add(a[kk]);
			}
		}
		//toArray()方法会返回一个包含集合所有元素的Object类型数组
		Object[] newlist = list.toArray();
		System.out.println(Arrays.toString(newlist));


}
}