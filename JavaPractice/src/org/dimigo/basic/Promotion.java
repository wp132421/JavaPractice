package org.dimigo.basic;

/**
 * 
 * @author 우준하
 *
 */

public class Promotion {
	public static void main(String[] args) {
		int pay = 1700000;
		int people = 3;
		int count = 1500;
		long total = (long) pay * 12 * (long) people * (long) count;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여: " + String.format("%,d", pay) + "원");
		System.out.println("점포 내 직원 수: " + String.format("%,d", people) + "명");
		System.out.println("점포 수: " + String.format("%,d", count) + "개");
		System.out.println("");
		System.out.println("연간 인건비: " + String.format("%,d", total));
	}
}
