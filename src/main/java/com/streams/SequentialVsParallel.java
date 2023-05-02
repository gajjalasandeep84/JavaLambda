package com.streams;

import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialVsParallel {
	
	public static void main(String[] args) {
		/*System.out.println("Total Memory(bytes): "+Runtime.getRuntime().totalMemory()/1024);
		System.out.println("Max Memory(bytes): "+Runtime.getRuntime().maxMemory()/1024);
		System.out.println("Free Memory(bytes): "+Runtime.getRuntime().freeMemory()/1024);
		FindCores cores=new FindCores();
		System.out.println("Number of cores: "+cores.getNumberOfCPUCores());
		*/
		int availableProcessor=Runtime.getRuntime().availableProcessors();
		System.out.println("Available Processors:"+availableProcessor);
		List<Integer> listIntegers=IntStream.range(1, 10).boxed().collect(Collectors.toList());
		System.out.println("Seq Flow");
		printStream(listIntegers.stream());
		System.out.println("ForkJoinPool");
		System.out.println(ForkJoinPool.getCommonPoolParallelism());
		
	}
	
	static void printStream(Stream<Integer> li) {
		li.parallel().forEach(s->{
			System.out.println(LocalTime.now()+" Value:"+s+" -thread: "+Thread.currentThread().getName());
		    try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

}
