package fist_week;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo{

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String start ="1995.1.1 00:00:00";
		String end ="1995.12.31 23:59:59";

		//解析时间格式  parse: 按指定的源格式把String转换为Date对象
		Date startTime =sdf.parse(start);
		Date endTime =sdf.parse(end);
		//获取时间对象
		System.out.println(endTime);
		//获取时间搓
		System.out.println(endTime.getTime());
		long suijiTime =(long)(Math.random()*(endTime.getTime()-startTime.getTime())+startTime.getTime());
		System.out.println("1995年的第一天:"+sdf.format(startTime));
		System.out.println("1995年的最后一天:"+sdf.format(endTime));
		System.out.println("1995年的随机一天:"+sdf.format(new Date(suijiTime)));


		//获取当前时间的时间搓
		Date now= new Date();
		System.out.println(now.getTime());
//		format: 按指定的目标格式把Date对象转换为String
		String dateFormat = sdf.format(now);
		System.out.println(dateFormat);
		System.out.println(dateFormat instanceof String);
	}
}

