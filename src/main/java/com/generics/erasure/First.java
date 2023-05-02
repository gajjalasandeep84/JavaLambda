package com.generics.erasure;

public class First<T> {
	T s;

	public T getS() {
		return s;
	}

	public void setS(T s) {

		System.out.println(s);
	}

}
