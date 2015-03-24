package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		final int EXPRESS_BUS = 1;
		final int LIGHT_CAR = 2;
		
		int dist = 20;
		int carType = LIGHT_CAR;
		int cost;
		String sCarType;
		
		switch(carType) {
			case EXPRESS_BUS:
				sCarType = "고속버스";
				cost = 850 + (((dist - 1) / 10) * 300);
				break;
			case LIGHT_CAR:
				sCarType = "경차";
				cost = 300 + (((dist - 1) / 10) * 200);
				break;
			default:
				sCarType = "그 외";
				cost = 600 + (((dist - 1) / 10) * 200);
				break;
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리: " + dist + "km");
		System.out.println("차종: " + sCarType);
		System.out.println("통행료: " + cost + "원");
	}
}
