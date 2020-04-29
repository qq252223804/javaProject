package src.main.on_the_road;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

//HashMap 是Map的一个实现类 是对Map的实现

//keySet()方法返回值是Map中key值的集合；entrySet()的返回值也是返回一个Set集合，此集合的类型为Map.Entry

public class map与hashmap {
    public static void main(String[] args) {
        Map<String,String> map=  new  HashMap<String,String>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        //第三种：推荐，尤其是容量大时</span>
        System.out.println(map);
        System.out.println(map.get("key1"));
        System.out.println(map.keySet());
        System.out.println(map.containsValue("value1"));
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + "\nand value= " + entry.getValue());
        }
        System.out.println("===============================");

        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("aa", "123");
        hashMap.put("bb", "456");
        System.out.println(hashMap);
        System.out.println(hashMap.get("aa"));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.containsValue("123"));
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("key= " + entry.getKey() + "\nand value= " + entry.getValue());
            hashMap.put(entry.getKey(), entry.getValue());
        }
//        1.有字符串转换为map对象
        System.out.println("map对象:"+hashMap);
//        获取hashcode 简称哈希码 也是对象的实例id（内存地址）
        System.out.println(hashMap.hashCode());

//        2.由Map对象转换成json字符串
        String x = JSONObject.toJSONString(hashMap);
        System.out.println("json字符串:"+x);

    }
}