/**
 * 
 */
package org.dimigo.inheritance;

/**
 * org.dimigo.inheritance >> Galaxy
 *
 * @author joona0825
 */
public class Galaxy extends SmartPhone {
	
	public Galaxy() {
		super();
	}
	
	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	@Override
	public void pay() {
		System.out.print("삼성 페이");
		super.pay();
	}
	
	public void useWirelessCharging() {
		super.useSpecialFunction();
	}

}
