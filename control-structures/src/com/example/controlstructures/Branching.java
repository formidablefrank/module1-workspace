package com.example.controlstructures;

public class Branching {

	public static void main(String[] args) {
		System.out.println(args.length);
		
		// I don't want this executed of there aren't enough entries
		if (args.length >= 2) {
			System.out.println(args[1]);
		}	else {
			System.out.println("Not enough entries to show index 1");
		}
		// I want by array to be two or more entries
		// if (args.length > 1 || args.length >= 2)
		
		//Accessing with a variable index
		//Control structures: IF to check for range
		int x = 2;
		//assume this value comes from elsewhere
		//we should only permit 0 <= x < args.length
		//you want it to fail sooner
		if (x < args.length && x >= 0){
			System.out.println(args[x]);
		} else {
			System.out.println("Invalid entry selected");
		}
		
		int age = 9;
		String ageBracket = "none";
		if (age >= 0){
			ageBracket = "child";
			if (age < 13) {
				ageBracket = "teenager";
			} else if (age < 21) {
				ageBracket = "adult";
			} else if (age < 60){
				ageBracket = "senior";
			}
		}
		
		switch(ageBracket){
			case "child":
				//child
				break;
			case "teenager":
				//teenager
				break;
			case "adult":
				//adult
				break;
			case "senior":
				//senior
				break;
			default:
				System.out.println("age not in acceptable range");
		}
	}

}
