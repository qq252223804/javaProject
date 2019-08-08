package thrid_week;

import java.util.HashMap;
import java.util.Hashtable;

public class hashmap {
	public static void main(String[] args) {

		//HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式

		HashMap<String,String> hashMap = new HashMap<String,String>();

		//HashMap可以用null作key,作value
		hashMap.put(null, "123");
		hashMap.put("123", null);
		System.out.println(hashMap.values());
		System.out.println(hashMap);
		System.out.println(hashMap.containsKey("123"));

	}
}
