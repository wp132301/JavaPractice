/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ Triangle
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 8. 17.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public class Triangle extends Figure{
	
	private int width;
	private int height;
	
	
	public Triangle(int width, int height) {
		this(0,0,width,height);
	}
	
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
		
	}
	
	protected double CalcArea() {
		return width*height*0.5;
	}
	
	protected void PrintCenter() {
		
		System.out.print("삼각형 ");
		super.PrintCenter();
	}
	
}
