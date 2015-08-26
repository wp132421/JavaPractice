/**
 * 
 */
package org.dimigo.inheritance;

/**
 * org.dimigo.inheritance >> IPhone
 *
 * @author joona0825
 */
public class IPhone extends SmartPhone {
	
	public IPhone() {
		super();
	}
	
	public IPhone(String model, String company, int price) {
		super(model, company, price);
	}
	
	@Override
	public void pay() {
		System.out.print("애플 페이");
		super.pay();
	}
	
	public void useAirDrop() {
		System.out.println("AirDrop 기능을 사용합니다.");
	}

}
