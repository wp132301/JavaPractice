/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ FigureTest
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 8. 17.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public class FigureTest {
	
	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		System.out.println("원의 넓이 : " + String.format("%.1f", c.CalcArea()));
		Triangle t = new Triangle(10, 10, 5, 8);
		t.CalcArea();
		System.out.println("삼각형 넓이 : " + t.CalcArea());
		Rectangle r = new Rectangle(20, 20, 5, 8);
		r.CalcArea();
		System.out.println("사각형 넓이 : " + r.CalcArea());
		
		
		c.PrintCenter();
		t.PrintCenter();
		r.PrintCenter();
		
		System.out.println("--중심좌표 이동(x,y축 5씩)");
		
		c.MoveFigure(5, 5);
		t.MoveFigure(5, 5);
		r.MoveFigure(5, 5);
		
		c.PrintCenter();
		t.PrintCenter();
		r.PrintCenter();
		
		
		
		
	}
	
	
}
