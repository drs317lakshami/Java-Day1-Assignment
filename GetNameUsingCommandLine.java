package com.bridgelabz.firstday;


import java.util.Scanner;

public class GetNameUsingCommandLine {
	public static void main(String[] args) {
		System.out.println("This is command line problems");

		for (String name : args) {
			System.out.println(name);
		}
	}
}