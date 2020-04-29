package second_week;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class 缓存流buffer {
	public static void main(String[] args) {
		// 向文件lol2.txt中写入三行语句
		File f = new File("src/main/java/second_week/stream.txt");
		try {
			// 创建文件字符流
			FileWriter fw = new FileWriter(f);
			// 缓存流必须建立在一个存在的流的基础上
			PrintWriter pw = new PrintWriter(fw);
//			有的时候，需要立即把数据写入到硬盘，而不是等缓存满了才写出去。 这时候就需要用到flush
			pw.flush();
			pw.println("teemo revive after 1 minutes");
			pw.flush();
			pw.println("teemo try to garen, but killed again");
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
