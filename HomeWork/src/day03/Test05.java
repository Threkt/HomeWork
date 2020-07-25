package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入身份证号");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        String geshi = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$" +
                "|^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$";
        while (true){
            if (str.matches(geshi)){
                char[] chars = str.toCharArray();
                String str1 = "";
                for (int i = 0; i < 8; i++) {
                    str1+=chars[i+6];
                }
                SimpleDateFormat sf =new SimpleDateFormat("yyyyMMdd");
                Date parse = sf.parse(str1);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(parse);
                calendar.add(Calendar.YEAR,20);
                calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
                Date time = calendar.getTime();
                SimpleDateFormat sf1 =new SimpleDateFormat("yyyy-MM-dd");
                String format = sf1.format(time);
                System.out.println(format);
                break;
            }
            else {
                System.out.println("身份证格式错误");
            }
        }
    }
}
