package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入生日，格式为yyyy-MM-dd");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sf.parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        Date now = new Date();
        long l = now.getTime() - parse.getTime();
        System.out.println("共经过了"+(l/1000/60/60/24/7)+"周");
    }
}
