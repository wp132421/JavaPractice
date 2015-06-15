/**
 * 
 */
package org.dimigo.oop;

/**
 * org.dimigo.oop >> FamilyMember
 *
 * @author joona0825
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원수: " + memberCnt);
	}

}
