package org.dimigo.basic;

/**
 * 
 * @author 2421 Alfred Woo.
 *
 */

public class Operator {
	public static void main(String[] args) {
		double a1 = 9, b1 = 10, h1 = 5.8;
		double a2 = 9, h2 = 5.4;
		double r1, r2, cha;
		
		r1 = ((a1 + b1) * h1) / 2;
		r2 = a2 * h2;
		
		cha = Math.abs(r1 - r2);
		
		if(r1 > r2) System.out.print("사다리꼴이 평행사변형보다 ");
		else System.out.print("평행사변형이 사다리꼴보다 ");
		
		System.out.print(cha + " 더 큽니다.");
	}
}
