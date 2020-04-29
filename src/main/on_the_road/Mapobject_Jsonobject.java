package src.main.on_the_road;
//JAVA中JSONObject对象和Map对象之间的相互转换

import java.util.*;
import com.alibaba.fastjson.JSONObject;

public class Mapobject_Jsonobject {
    public static void main(String[] args) {
//   1.由json字符串转换成Map对象
        //json字符串
        String jsondata="{\"contend\":[{\"bid\":\"22\",\"carid\":\"11\"},{\"bid\":\"23\",\"carid\":\"0\"}],\"result\":100,\"total\":2}";
//        jsonobject对象
        JSONObject jsonObject= JSONObject.parseObject(jsondata);
        System.out.println("json字符串"+jsonObject);

//map对象
        Map<String, Object> data =new HashMap<>();
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()){
            data.put(entry.getKey(), entry.getValue());
        }

        System.out.println("map对象:"+data.toString());
        //        获取hashcode 简称哈希码 也是对象的实例id（内存地址）
//        System.out.println(data.hashCode());
//在jsonobject对象中取某一个值需封装 不采取
        System.out.println(jsonObject.get("contend"));
//   在map对象中取值
        Object res=data.get("contend");
        List<Map<String, Object>> infos= (List<Map<String, Object>>) res;
        for(Map<String, Object> info :infos){
            String bid= (String) info.get("bid");
            String carid= (String) info.get("carid");
            System.out.println(bid);
//            System.out.println(carid);
        }


//2.由Map对象转换成json字符串

        String x =JSONObject.toJSONString(data);
        System.out.println("json字符串:"+x);
//

    }



}
