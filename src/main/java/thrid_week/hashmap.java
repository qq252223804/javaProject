package thrid_week;

import java.util.HashMap;
import java.util.Hashtable;

public class hashmap {
	public static void main(String[] args) {

		//HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式

		HashMap<String,String> hashMap = new HashMap<String,String>();

		//HashMap可以用null作key,作value
		hashMap.put("aa", "123");
		hashMap.put("bb", "456");
		System.out.println(hashMap);
		System.out.println(hashMap.get("aa"));
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.containsValue("123"));

	}
}
