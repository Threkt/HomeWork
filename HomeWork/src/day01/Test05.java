package day01;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String[] strings =new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g",
				"h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			sb.append(strings[(int)(Math.random()*53)]);
		}
		System.out.println(sb);
		System.out.println("请输入该验证码，大小写不限");
		Scanner console = new Scanner(System.in);
		String str = console.next();
		String str1 = sb.toString();
		if (str1.toLowerCase().equals(str.toLowerCase())){
			System.out.println("验证成功");
		}else{
			System.out.println("验证码错误");
		}

	}
	
}
