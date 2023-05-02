package com.generics.erasure;

public class Base<T> {

	T ob;

	Base(T o) {
		ob = o;
	}

	T getOb() {
		return ob;
	}
}
