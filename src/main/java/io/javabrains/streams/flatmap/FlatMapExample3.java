package io.javabrains.streams.flatmap;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample3 {

	public static void main(String[] args) throws IOException {

		Stream<String> lines = Files.lines(Paths.get("C:\\Users\\sgajjal\\Documents\\test\\test.txt"));

		
		 Map<String,Integer> map= lines.flatMap(line -> Stream.of(line.split(" +")))
		 .collect(Collectors.toMap(word -> word, word -> word.length()));
		 System.out.println(map);
		
		Map<Integer, List<String>> map1 = lines.map(line -> line.split("[\\s]+")).filter(word -> word.length > 4)
				.collect(Collectors.groupingBy(word -> Integer.valueOf(word[0].length()),
						Collectors.mapping(word -> word[0], Collectors.toList())));

		System.out.println(map1);

	}
}
