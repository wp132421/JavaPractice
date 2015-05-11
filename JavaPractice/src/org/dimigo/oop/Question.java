/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * org.dimigo.oop >> Question
 *
 * @author joona0825
 */
public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String ans1 = "오아시스";
		String ans2 = "이명박";
		String ans3 = "박근혜";
		
		System.out.println("세계 최고의 락 밴드는?");
		if(scanner.nextLine().equals(ans1)) {
			echo("정답입니다!! ^^");
		} else {
			echo("틀렸습니다!! ㅜㅜ");
		}
		
		System.out.println("4대강을 대차게 말아드신 아저씨의 이름은?");
		if(scanner.nextLine().equals(ans2)) {
			echo("정답입니다!! ^^");
		} else {
			echo("틀렸습니다!! ㅜㅜ");
		}
		
		System.out.println("우리나라 최고의 똥통은?");
		if(scanner.nextLine().equals(ans3)) {
			echo("정답입니다!! ^^");
		} else {
			echo("틀렸습니다!! ㅜㅜ");
		}
	}
	
	static final void echo(String arg) {
		System.out.println(arg);
	}

}
