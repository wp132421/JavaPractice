/**
 * 
 */
package org.dimigo.oop;

/**
 * org.dimigo.oop >> IdolGroup
 *
 * @author joona0825
 */
public class IdolGroup {
	public static void main(String[] args) {
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		String[][] members = {
				new String[] {"GD", "태양", "대성", "탑", "승리"},
				new String[] {"CL", "산다라박", "박봄", "민지"},
				new String[] {"유라", "혜리", "소진", "민아"}
		};
		
		for(int i = 0; i < idolGroup.length; i++) {
			System.out.println("<< " + idolGroup[i] + " 멤버 >>");
			for(String name : members[i]) {
				System.out.println(name);				
			}
			System.out.println();
		}
	}

}