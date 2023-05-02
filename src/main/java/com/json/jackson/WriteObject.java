package com.json.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteObject {

	public static void main(String args[]) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper obj = new ObjectMapper();
		Employee employee = new Employee("Sandeep", "Cohoes", "NYSOH", "Software Developer Advisor");
		obj.writeValue(new File("target/emp.json"), employee);
	}

}
