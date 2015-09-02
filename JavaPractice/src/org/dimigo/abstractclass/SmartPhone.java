/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ SmartPhone
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 8. 28.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public abstract class SmartPhone {
	
	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnoff() {
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	abstract public void pay();
	
	public void useSpecialFunction() {
		if(this instanceof IPhone) {
			((IPhone)this).useAirDrop();
		}
		
		else if(this instanceof Galaxy)
			((Galaxy)this).useWirelessCharging();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "모델명 : " + model + ", 제조사 : " + company
				+ ", 가격 : " + String.format("%,d", price) + "원";
	}
	
	
}
