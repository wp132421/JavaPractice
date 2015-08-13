/**
 * 
 */
package org.dimigo.inheritance;

/**
 * org.dimigo.inheritance >> Figure
 *
 * @author joona0825
 */
public class Figure {
	private int centerX, centerY;
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 0.0;
	}
}
