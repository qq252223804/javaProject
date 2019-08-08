package fist_week.interface_enum;

import java.awt.*;

//测试类
public class TestColor_order {


	public static void main(String[] args) {
		//打印所有颜色value
		Color.get_colors();
		//根据index 打印value
		System.out.println(Color.getColor(1));
		//打印枚举的 注释文字
		System.out.println(Color.YELLOW.getName());
		//根据index 打印value
		System.out.println(OrderFromSourceEnum.valueOf(3));
		//打印枚举的 注释文字
		System.out.println(OrderFromSourceEnum.BILL.getName());


		Color color = Color.GREEN;
		switch (color) {
			case RED:
				System.out.println("红色");
				break;
			case GREEN:
				System.out.println("绿色");
				break;
			case BLANK:
				System.out.println("白色");
				break;
			case YELLOW:
				System.out.println("黄色");
				break;
			default:
				System.out.println("枚举错误");
		}
	}



}