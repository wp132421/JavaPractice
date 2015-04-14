/**
 * 
 */
package org.dimigo.oop;

/**
 * org.dimigo.oop >> Car
 *
 * @author joona0825
 */
public class Car2 {
	private String company, model, color;
	private int maxSpeed, price;
	
	public Car2() {
	}
	
	public Car2(String arg1, String arg2, String arg3, int arg4, int arg5) {
		company = arg1;
		model = arg2;
		color = arg3;
		maxSpeed = arg4;
		price = arg5;
	}

	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
}
