package com.bridgelabz.firstday;

class DemonstrationOfStaticVeriableMethodAndBlock {
	  static int a = 3;// demonstration Static variable
	  static int b;
	  // demonstration Static method 
	  static void meth(int x) {
	    System.out.println("x = " + x);
	    System.out.println("a = " + a);
	    System.out.println("b = " + b);
	  }
	    // demonstration Static block
	  static {
	    System.out.println("Static block initialized.");
	    b = a * 4;
	  }
	   
	  public static void main(String args[]) {
	    meth(42);
	  }
	}
