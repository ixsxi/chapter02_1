package com.javaex.ex02;

public class Goods {
	//*******************재료 *********************************//
			
	//필드 
	
	private String name;  // 도장 -- > private = 접근못하게  
	
	private int price;
	
	
	//생성자  
	
	
	
	
	//메소드 - 갯터 셋터 
	
	
	 
	//메소드 - 일반
	//name 값을 입력
	public void setName(String n){
		name = n;
		
	}
	
	public void setPrice(int p) {
		price = p;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showInfo(){
		System.out.println("상품이름:"+name);
		System.out.println("가격:"+price );
		System.out.println("=============");
	}
	
}
