package src.main.on_the_road;

import java.util.Arrays;
import java.util.HashSet;

//hashmap实现了map接口  hashset实现了set接口
//hashmap存储的是键值对  hashset仅仅存储对象,set存储元素
//使用put将元素加到map   使用add将元素加到set
//hashmap更快 因为使用的是唯一的键来获取对象
public class hashmap与hashset {


    public static void main(String[] args) {
        News news = new News(1, "北京终于放晴了！", "新闻社");
        News news2 = new News(2, "香港回归纪念日", "人民新闻");
        News news3 = new News(3, "假奶粉事件曝光", "人民新闻网");

        //创建HashSet集合，储存无序，唯一的数据
        //HashSet是是使用equals来进行对象对比，确定数据是唯一的
        //如果两个数据的对象是一致的，那么HashSet将会把这两个合并，只储存一个空间
        HashSet<News> hashSet = new HashSet<News>();
        HashSet<String> hashSet2=new HashSet<>();
        hashSet2.add("aj");
        hashSet.add(news);
        hashSet.add(news2);
        hashSet.add(news3);
        System.out.println(hashSet);
        System.out.println(hashSet2);

        //由于HashSet储存数据都是无序的，所以不能用get(i);来获取具体对象
        //所以我们必须通过遍历来得到HashSet的各个数据，由于是没有索引的
        //所以不能使用普通类型的for来遍历它
        //HashSet只能通过增强型for和迭代器来遍历它
        for(News n:hashSet){
            System.out.println(n.a);
            System.out.println(n.b);

        }
    }


}
