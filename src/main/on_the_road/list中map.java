package src.main.on_the_road;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

//首先map<String,Object>是定义了一个Map集合变量，然后list<map<String,Object>>是定义了一个List的集合变量，是map的一个集合；map是那个list的其中一个值。
//        List<Map<String,Object> list=new ArrayList<Map<String,Object>>;
//        Map<String,Object> map=new HashMap<String,Object>;
//List集合中的对象是一个Map对象,而这个Map对象的键是String类型,值是Object类型
public class list中map {
    public static void main(String[] args) {
        //json字符串
        String jsondata = "{\"contend\":[{\"bid\":\"22\",\"carid\":\"11\"},{\"bid\":\"23\",\"carid\":\"0\"}],\"result\":100,\"total\":2}";
        //        jsonobject对象
        JSONObject jsonObject = JSONObject.parseObject(jsondata);
//        取出来的值是一个对象
        Object res = jsonObject.get("contend");
//        类型转换
        List<Map<String, Object>> infos = (List<Map<String, Object>>) res;
        for (Map<String, Object> info : infos) {
            String bid = (String) info.get("bid");
            String carid = (String) info.get("carid");
            System.out.println(bid);
//            System.out.println(carid);
        }


    }
}
