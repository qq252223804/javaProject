package thrid_week;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStream对象流 {
	public static void main(String[] args) {
		//创建一个Hero garen
		//要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
		Hero h = new Hero();
		h.hp=616;
		h.name="timo";

		//准备一个文件用于保存该对象
		File f =new File("C:\\Users\\p\\Desktop\\myproject\\src\\main\\java\\thrid_week\\garen.lol");

		try(
				//创建对象输出流
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos =new ObjectOutputStream(fos);
				//创建对象输入流
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois =new ObjectInputStream(fis);
		) {
			oos.writeObject(h);
			Hero h2 = (Hero) ois.readObject();
			System.out.println(h2.hp);
			System.out.println(h2.name);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
