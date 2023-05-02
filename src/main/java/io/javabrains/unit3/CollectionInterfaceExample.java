package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.common.Person;

public class CollectionInterfaceExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		System.out.println("Printing all the persons using for each loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		System.out.println();
		System.out.println("Printing all the persons using for in  loop");
		for (Person p : people) {
			System.out.println(p);
		}

		System.out.println();
		System.out.println();
		System.out.println("Printing all the persons using for each using lambda");
		System.out.println();
		people.forEach(System.out::println);

	}

}
