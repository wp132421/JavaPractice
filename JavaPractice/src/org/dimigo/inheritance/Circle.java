/**
 * 
 */
package org.dimigo.inheritance;

/**
 * org.dimigo.inheritance >> Circle
 *
 * @author joona0825
 */
public class Circle extends Figure {
	private int radius;
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	public Circle(int radius) {
		this(0, 0, radius);
	}
	
	@Override
	protected double calcArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
}
