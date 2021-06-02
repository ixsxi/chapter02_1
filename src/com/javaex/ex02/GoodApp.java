package com.javaex.ex02;

public class GoodApp {

	public static void main(String[] args) {
		//*************************메인 판 **********************/

		//*******************3개의 상품 변수 넣어서 지정 힙에 3개 들엉가있음 내용은 알수없음********
		Goods camera = new Goods(); // new Goods();  --> Goods에 있는 도장을 새로 찍는다.
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		
		//*************************** 변수 . (도장틀) 이어주는 거라고 생각 연결? *********
		//camera.name = "니콘";
		camera.setName("니콘");
		
		//camera.price = 400000;
		camera.setPrice (400000);
		
		//computer.name = "그램";
		computer.setName("그램");
		
		//computer.price = 1000000;
		computer.setPrice(1000000);
		
		
		//cup.name ="머그컵";
		cup.setName("머그컵");
		
		//cup.price = 2000 ;
		cup.setPrice(2000);
		
		
		
		//System.out.println("상품명:"+camera.name +","+"가격"+camera.price+"원");
		camera.showInfo();
		//System.out.println("상품명:"+camera.getName() +","+"가격"+camera.getPrice()+"원");
		//System.out.println("상품명:"+computer.getName() +","+"가격"+computer.getPrice()+"원");
		computer.showInfo();
		
		//System.out.println("상품명:"+cup.getName() +","+"가격"+cup.getPrice()+"원");
		cup.showInfo();
		
		
		
		
		
	}

}
