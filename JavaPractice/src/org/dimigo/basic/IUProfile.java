package org.dimigo.basic;

/**
 * The First Homework
 * @author Alfred Woo
 * @since Mar. 13th, 2015
 * @version 1.1
 */

public class IUProfile {
	public static void main(String[] args) {
		boolean FEMALE = false;
		boolean MALE = true;
		
		String name = "아이유";
		boolean sex = FEMALE;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름: " + name);
		System.out.println("성별: " + (sex == FEMALE ? "여자" : "남자"));
		System.out.println("나이: " + age + "세");
		System.out.println("키: " + height + "cm");
		System.out.println("몸무게: " + weight + "kg");
		System.out.println("혈액형: " + bloodType);
	}
}