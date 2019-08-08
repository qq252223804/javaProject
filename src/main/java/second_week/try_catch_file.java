package second_week;

import java.io.File;
import java.text.ParseException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class try_catch_file {
//	使用异常的父类Exception进行catch
	public void Exception(){

		File f= new File("d:/LOL.exe");

		try{
			System.out.println("试图打开 d:/LOL.exe");
			new FileInputStream(f);
			System.out.println("成功打开");
		}
		catch(Exception e){
			System.out.println("d:/LOL.exe不存在");
//			e.printStackTrace(); 会打印出方法的调用痕迹
			e.printStackTrace();
		}

	}
//	多异常捕捉办法1
	public void File_parse(){
		//File既可以表示目录 或者文件
		File f = new File("C:\\Users\\p\\Desktop\\myproject\\src\\main\\java\\second_week\\LOL.exe");

		try {
			System.out.println("试图打开 LOL.exe");
			new FileInputStream(f);
			System.out.println("成功打开");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd");
			Date d = sdf.parse("2016.06.03");
			System.out.println(d);
		} catch (FileNotFoundException e) {
			System.out.println("d:/LOL.exe不存在");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("日期格式解析错误");
			e.printStackTrace();
		}
		finally{
			System.out.println("无论文件是否存在， 都会执行的代码");
		}
	}

	public static void main(String[] args) {

		try_catch_file test1=new try_catch_file();
//		test1.Exception();
		test1.File_parse();
//		StringBuffer sb =new StringBuffer();
//		for (int i = 0; i < Integer.MAX_VALUE; i++) {
//			sb.append('a');
//			System.out.println(sb);
//		}
//		System.out.println(sb);


	}

}


