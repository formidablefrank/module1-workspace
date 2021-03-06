package com.example.controlstructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loops {
	
	private static final int NUMBER_OF_CHIPMUNKS = 3;

	public static void main(String[] args) {
		System.out.println(args.length);
		
		for (int i=0; i<NUMBER_OF_CHIPMUNKS; i++) {
			System.out.println(args[i]);
		}
		// for loop for countable or indexed things
		
		System.out.println();
		
		int j = 0;
		while(j < 3){
			System.out.println(args[j]);
			j++;
		}
		// while loops are better if you don't know how many items there are
		// or if you have no idea when the exit condition is met
		System.out.println();
		
		//making loops responsive, using adaptive condition
		for (int i=0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		//iterating through a list and array the easy way
		List<String> chipmunks = new ArrayList<>();
		List<String> chipmunks2 = Arrays.asList(args); 
		//populate the list from the array
		//if args is empty, the program will not generate an exception
		//will iterate ALL values in the array
		for(String chipmunk: args){
			chipmunks.add(chipmunk);
		}
		
		//print out the contents of chipmunks
		for(String chipmunk: chipmunks){
			System.out.println(chipmunk);
		}
		
		System.out.println(chipmunks2);
	}
}
