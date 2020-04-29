package thrid_week;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

public class object_file {
	public static void main(String[] args){
		hero[] heroes=new hero[10];
		for(int i=0;i<heroes.length;i++){
			heroes[i]=new hero("hero",i);

		}
        System.out.println("默认编码方式:"+ Charset.defaultCharset());
		System.out.println("查看中文件中反序列化出的数组中地每一个元素：");
		File f=new File("src/main/java/thrid_week/heros.txt");
		try(
				FileOutputStream fos=new FileOutputStream(f);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis)
		){
			oos.writeObject(heroes);
			oos.flush();

			hero[] h=(hero[])ois.readObject();
			for(int i=0;i<heroes.length;i++){
				System.out.println(h[i].name+":"+h[i].hp);
			}
		}catch (IOException e){
			e.printStackTrace();

		}catch (ClassNotFoundException x){
			x.printStackTrace();
		}
	}
	public static class hero implements Serializable{
		private static final long serialVersionUID = 1L;
		public String name;
		public int hp;
		public hero(String name,int hp){
			this.name=name;
			this.hp=hp;
		}

	}
}
