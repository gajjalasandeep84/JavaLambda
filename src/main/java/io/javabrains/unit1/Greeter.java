package io.javabrains.unit1;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();

	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		Greeting mylambdafunction = () -> System.out.print("Hello!!!");

		Greeting greeting = new HelloWorldGreeting() {
			public void perform() {
				System.out.println("Hello Worlds");
			}
		};
		
		//greeting.perform();
		
		//mylambdafunction.perform();

		greeter.greet(mylambdafunction);
		System.out.println();
		
		greeter.greet(greeting);
	}

}