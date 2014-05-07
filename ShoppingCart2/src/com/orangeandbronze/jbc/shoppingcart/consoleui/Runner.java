package com.orangeandbronze.jbc.shoppingcart.consoleui;


import java.io.*;

public class Runner {
	public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("resources/test"))){
            writer.write("hello");
            writer.newLine();
            System.out.println(writer);
        }
        catch(Exception e){
            e.printStackTrace();
        }
	}
}
