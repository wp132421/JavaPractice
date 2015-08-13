/**
 * 
 */
package org.dimigo.inheritance;

/**
 * org.dimigo.inheritance >> Rectangle
 *
 * @author joona0825
 */
public class Rectangle extends Figure {
	private int width, height;
	
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int width, int height) {
		this(0, 0, width, height);
	}
	
	@Override
	protected double calcArea() {
		return width * height;
	}
	

}
