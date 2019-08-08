package fist_week;

public class string的可变字符delect_insert {
	public static void main(String[] args) {
		String str1 = "let there ";
		//根据str1创建一个StringBuffer对象
		StringBuffer sb = new StringBuffer(str1);
		sb.append("be light"); //在最后追加
		System.out.println(sb);
		sb.delete(4, 10);//删除4-10之间的字符

		System.out.println(sb);

		sb.insert(4, "there ");//在4这个位置插入 there

		System.out.println(sb);

		sb.reverse(); //反转

		System.out.println(sb);
		System.out.println(sb.length()); //总长度
//		总空间 会无限长 分配一个新的数组，长度比原来多一些，把原来的数据复制到新的数组中
		System.out.println(sb.capacity());

	}
		
	}

