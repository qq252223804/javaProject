package second_week;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class 字符流File_write_read {
	public static void main(String[] args) {
		System.out.println("默认编码方式:"+ Charset.defaultCharset());
		File f = new File("src/main/java/second_week/lol.txt");
		// 创建基于文件的Writer
		try (FileWriter fr = new FileWriter(f)) {
			// 以字符流的形式把数据写入到文件中
			String data="abcdefg1234567890"+"\n"+"中国";
//将字符串转为字符串数组
//			char[] cs = data.toCharArray();
//			fr.write(cs);
			fr.write(data);

		} catch (IOException e) {
			e.printStackTrace();
		}

		// 创建基于文件的Reader
		try (FileReader fr = new FileReader(f)) {
			// 创建字符数组，其长度就是文件的长度
			char[] all = new char[(int) f.length()];
			// 以字符流的形式读取文件所有内容
			fr.read(all);
			System.out.println(all);
			for (char b : all) {
				System.out.println(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

