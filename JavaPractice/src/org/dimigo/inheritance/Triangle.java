/**
 * 
 */
package org.dimigo.inheritance;

/**
 * org.dimigo.inheritance >> Triangle
 *
 * @author joona0825
 */
public class Triangle extends Figure {
	private int width, height;
	
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	public Triangle(int width, int height) {
		this(0, 0, width, height);
	}
	
	@Override
	protected double calcArea() {
		return (width * height) / 2;
	}
	
	@Override
	protected void printCenter() {
		System.out.print("삼각형 ");
		super.printCenter();
	}

}
