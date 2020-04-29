package src.main.on_the_road;

import org.omg.CORBA.ARG_IN;

import java.util.*;


//Set集合与List集合的区别就是，Set集合的元素不能重复，List集合的元素是可以重复的。
public class Set与list {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0);
        list.add("c");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        Set set=new HashSet<>();
        set.add("demo1");
        set.add("demo2");
//        set.add(1);
        System.out.println(set);
        boolean b=set.add("demo1");
        System.out.println("添加demo1元素的返回值是"+b);

// 创建一个int数组 对象
        int[]  c = new int[] {100,102,444,836,3236};
//        转换成String类型输出
        System.out.println(Arrays.toString(c));
// 创建一个string 数组对象
        String[] str ={"aa","ceshi"};
        System.out.println(Arrays.toString(str));

//        list转换为string
        String str1=String.join(",",str);
        System.out.println(str1);
//        string 转换list
        List<String> str2=Arrays.asList(str1.split(","));
        System.out.println(str2);

//        set集合转换为string数组
//        Set 转String数组直接用其toArray()方法
        String[] str11 = (String[]) set.toArray(new String[set.size()]);
        System.out.println(Arrays.toString(str11));
    }


}
