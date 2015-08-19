/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ Figure
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 8. 17.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public class Figure {

	private int centerX;
	private int centerY;
	/**
	 * @param centerX
	 * @param centerY
	 */
	public Figure(int centerX, int centerY) {

		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double CalcArea() {
		return 0.0;
	}
	
	protected void PrintCenter() {
	
		System.out.println("중심좌표 : ( " + centerX + "," + centerY + " ) ");
	}
	
	protected void MoveFigure(int x, int y) {
		
		centerX = centerX + x;
		centerY = centerY + y;
	}
	
	
	
}
