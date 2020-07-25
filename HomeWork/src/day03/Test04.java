package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入生日，格式为yyyy-MM-dd");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        System.out.println("请再输入一个数字(保质期的天数)");
        int i = console.nextInt();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sf.parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        calendar.add(Calendar.DAY_OF_MONTH,i);
        calendar.add(Calendar.WEEK_OF_MONTH,-2);
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        Date time = calendar.getTime();
        System.out.println(time);
    }
}
