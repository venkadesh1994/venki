package com.java;

public class value_variable extends variables{
   public void num() {

	   System.out.println(b);
       System.out.println(c);
   }
   
   @Override
	public void stdId() {
		super.stdId();
	}
   
public static void main(String[] args) {
	value_variable v = new value_variable();
	v.num();
	v.stdId();
}
}
