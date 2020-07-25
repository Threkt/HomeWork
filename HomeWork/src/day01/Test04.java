package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		String guifan = "^\\w{6,18}@qq\\.com$";
		System.out.println("请输入一个QQ邮箱（规范：6~18位数字+@qq.com）");
		Scanner console = new Scanner(System.in);
		while (true){
			String str = console.next();
			if (str.matches(guifan)){
				String[] split = str.split("@");
				System.out.println(split[0]);
				break;
			}else {
				System.out.println("输入错误，请按照规范输入");
			}
		}

	}
}
