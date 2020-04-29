package src.main.on_the_road;

//import java.util.HashMap;
import java.util.*;

public class map_tostring {
    public static void main(String[] args) {

        Map<String,Object> map = new HashMap<>();
        map.put("name","小明");
        map.put("sex","男");
        map.put("age","16");
        System.out.println(map);
        //Map转String
        String str1 = getMapToString(map);
        System.out.println(str1);
        try {
            //String转map
            Map<String, Object> map1 = getStringToMap(str1);
            System.out.println(map1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * Map转String
     * @param map
     * @return
     */
    public static String getMapToString(Map<String,Object> map){
        Set<String> keySet = map.keySet();
        System.out.println("打印出map中的key值 以集合的方式");
        System.out.println(keySet);
        //将set集合转换为字符串数组
        String[] keyArray = (String[]) keySet.toArray(new String[keySet.size()]);
        //给数组排序(升序)
//        Arrays.sort(keyArray);
        System.out.println("打印出字符串数组key");
        System.out.println(Arrays.toString(keyArray));
//        System.out.println(keyArray.length);
        //因为String拼接效率会很低的，所以转用StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keyArray.length; i++) {
            // 参数值为空，则不参与签名 这个方法trim()是去空格
            if ((String.valueOf(map.get(keyArray[i]))).trim().length() > 0) {
                sb.append(keyArray[i]).append(":").append(String.valueOf(map.get(keyArray[i])).trim());
//                System.out.println(sb);
            }
            if(i != keyArray.length-1){
                sb.append(",");
                System.out.println(sb);
            }
        }
        return sb.toString();
    }

    /**
     *
     * String转map
     * @param str
     * @return
     */
    public static Map<String,Object> getStringToMap(String str){
        //根据逗号截取字符串数组
        String[] str1 = str.split(",");
//        System.out.println(str1.length);
        //创建Map对象
        Map<String,Object> map = new HashMap<>();
        //循环加入map集合
        for (int i = 0; i < str1.length; i++) {
            //根据":"截取字符串数组
            String[] str2 = str1[i].split(":");
//            System.out.println("将sting按：切割后形成多块 的sting数组");
//            System.out.println(Arrays.toString(str2));
            //str2[0]为KEY,str2[1]为值
            map.put(str2[0],str2[1]);
        }
        return map;
    }


}
