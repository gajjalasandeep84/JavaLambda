package com.generics.erasure;

public class Derived extends Base<String> {

	Derived(String o) {
		super(o);
		// TODO Auto-generated constructor stub
	}

	String getOb() {

		System.out.println("String getOb() method");
		return ob;
	}

}
