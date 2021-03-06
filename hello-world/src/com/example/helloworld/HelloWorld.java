package com.example.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		int quantityPurchased = 100;
		int price = 100;
		System.out.println(quantityPurchased * price);
		
		//method call on a null object
		String name = "Procopio";
		if(name != null && name.equals("Procopio")){
			System.out.println("name match");
		}
		
		//an expression that involves int, short, byte: all elements got promoted to int
		byte result = 0, addend1 = 126, addend2 = 2;
		//byte range is (-128 to 127)
		//if you know what you're doing, perform a cast
		result = (byte) (addend1 + addend2);
		//for byte, 127 + 1 = -128
		System.out.println(result);

	}

}
