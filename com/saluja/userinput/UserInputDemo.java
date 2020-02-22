package com.saluja.userinput;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=obj.nextLine();
		System.out.println("Hello"+name);
		System.out.println(name.charAt(0));
		
		System.err.println("Some errors");

	}

}
