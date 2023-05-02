package com.generics.erasure;

public class Second<T extends Number> {
	T s;

	public T getS() {
		return s;
	}

	public void setS(T s) {

		System.out.println(s);
	}

}
