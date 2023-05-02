package com.generics.erasure;

public class TestDerived {
	
	public static void main(String[] args) {
		Derived num=new Derived("String");
		System.out.println(num.getOb());//Hello
	}

}
