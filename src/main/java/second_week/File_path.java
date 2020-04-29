package second_week;

import java.io.File;
import java.io.IOException;
public class File_path {
	public static void path() {
		// 绝对路径
		File f1 = new File("F:\\脚本py+java\\myproject\\src\\main\\java\\second_week\\lol");
		System.out.println("f1的绝对路径：" + f1.getAbsolutePath());

		// 相对路径,相对于工作目录，如果在eclipse中，就是项目目录
		File f2 = new File("stream.txt");
		System.out.println("f2的绝对路径：" + f2.getAbsolutePath());

		// 把f1作为父目录创建文件对象
		File f3 = new File(f1, "LOL.exe");

		System.out.println("f3的绝对路径：" + f3.getAbsolutePath());
	}


	public static void main(String[] args) throws IOException{
		File f= new File("F:\\脚本py+java\\myproject\\src\\main\\java\\second_week\\lol.txt");
		File F=new File("F:\\脚本py+java\\myproject\\src\\main\\java\\second_week\\lol");
		if (f.exists()) {
			System.out.println("文件已存在");
			// 刪除文件
			f.delete();
		} else f.createNewFile();
		if(F.exists()){
			System.out.println("文件夹已存在");
			// 刪除文件
			F.delete();
		}else F.mkdirs();
		if (F.isDirectory())
			System.out.println("判断是否是文件夹" + F.isDirectory());
		if (f.isFile())
			System.out.println("判断是否是文件：" + f.isFile());
		//打印文件夹绝对路径
		System.out.println(F.getAbsolutePath());
		//打印文件绝对路径
		System.out.println(f.getAbsolutePath());


	}
}