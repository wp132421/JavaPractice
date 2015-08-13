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
	
	protected void printCenter() {
		System.out.println(String.format("중심좌표 : (%d, %d)", centerX, centerY));
	}
	
	protected void moveFigure(int x, int y) {
		centerX += x;
		centerY += y;
	}
}
