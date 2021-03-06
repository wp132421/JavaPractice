/**
 * 
 */
package org.dimigo.inheritance;

/**
 * org.dimigo.inheritance >> FigureTest
 *
 * @author joona0825
 */
public class FigureTest {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Triangle triangle = new Triangle(10, 10, 5, 8);
		Rectangle rectangle = new Rectangle(20, 20, 5, 8);
		
		System.out.println(String.format("원의 넓이: %.1f", circle.calcArea()));
		System.out.println(String.format("삼각형의 넓이: %.1f", triangle.calcArea()));
		System.out.println(String.format("사각형의 넓이: %.1f", rectangle.calcArea()));
		
		circle.printCenter();
		triangle.printCenter();
		rectangle.printCenter();
		
		circle.moveFigure(5, 5);
		triangle.moveFigure(5, 5);
		rectangle.moveFigure(5, 5);
		
		System.out.println("-- 중심좌표 이동됨 --");

		circle.printCenter();
		triangle.printCenter();
		rectangle.printCenter();
	}
}
