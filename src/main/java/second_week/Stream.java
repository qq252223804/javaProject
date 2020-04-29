package second_week;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
public class Stream {

	public static void main(String[] args) {

		File f =new File("src/main/java/second_week/stream.txt");
//		FileOutputStream
		try {
			// 准备文件stream.txt其中的内容是空的
			// 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
			byte data[] = { 88, 89 };

			//向指定 File 对象表示的文件中写入数据的文件输出流。
			FileOutputStream fos = new FileOutputStream(f);
			// 把数据写入到输出流
			fos.write(data);
			// 关闭输出流
			fos.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

//	    FileInputStream
		try {

			//准备文件lol.txt其中的内容是XY，对应的ASCII分别是88 89

//			读取数据的文件输入流。
			FileInputStream fis =new FileInputStream(f);
			//创建字节数组，其长度就是文件的长度
			byte[] all =new byte[(int) f.length()];
			//以字节流的形式读取文件所有内容
			fis.read(all);
			for (byte b : all) {
				//打印出来是88 89
				System.out.println(b);
			}

			//每次使用完流，都应该进行关闭
			fis.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}


}
