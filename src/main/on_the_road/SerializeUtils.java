package src.main.on_the_road;

import java.io.*;


public class SerializeUtils {
//    序列化成字符串
    public static String serialize(Object obj) throws IOException{

//            字节数组输出流在内存中创建一个字节数组缓冲区
//            实际的数据流向：
//            ObjectOutputStream->ByteArrayOutputStream->ByteArrayInputStream ->ObjectInputStream，深度复制从序列化对象又转为序列化对象
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

            objectOutputStream.writeObject(obj);
            String string = byteArrayOutputStream.toString("ISO_8859_1");

            // 使用流对象给文件中写入数据
            FileOutputStream fos = new FileOutputStream("1.txt") ;
            fos.write(string.getBytes());
            System.out.println("序列化成功");
//            对象流与字节数组流关闭
            objectOutputStream.close();
            byteArrayOutputStream.close();
            return string;
    }
//    反序列化成对象
    public static Object serializeToObject (String str) throws IOException, ClassNotFoundException{


        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Object object = objectInputStream.readObject();
        System.out.println("反序列化成功");
        objectInputStream.close();
        byteArrayInputStream.close();
        return object;
        }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

       String str=serialize(new User("123","陶健",26));
       User user=(User) serializeToObject(str);
       System.out.println(user.toString());
       System.out.println("用户编号为："+user.getUserId()+"\n用户姓名为："+user.getUserName()+"\n用户年龄为："+user.getAge());

    }
}
