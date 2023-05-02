package io.javabrains.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthSeparatorUI;

import io.javabrains.common.Person;

public class StreamsExample1 {
	public static void main(String[] args) {
		List<Person> peoples = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		//List<Person> peoples = null;

		//people.stream().filter(p -> p.getLastName().startsWith("C")).forEach(p -> System.out.println(p));
		
	//	peoples.parallelStream().filter(p -> p.getLastName().startsWith("C")).forEach(p -> System.out.println(p));

		List<Person> filteredList= Optional.ofNullable(peoples)
				.orElse(Collections.emptyList())
				.stream().filter(p -> p.getLastName().startsWith("Z")).collect(Collectors.toList());
		
		//System.out.println(filteredList.size());
		List<String> prints=Arrays.asList("sup1", "sup2", "sup3");
		
		System.out.println(prints);
	}

}
