package src.main.on_the_road;

import java.util.Scanner;
//表达式?值1:值2
//        如果表达式为真 返回值1
//        如果表达式为假 返回值2

public class scanner {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true) {
            System.out.println("输入1-7之间的整数");
            int day = s.nextInt();
//            表达式？值1:表达式二（假值2）？值2:值3
            String workOrNot = (day <= 5 & day > 0 )?"今天是工作日":(day <= 7 & day > 0)?"今天是周末":"输入不合法";
            System.out.println(workOrNot);

        }
    }
}
