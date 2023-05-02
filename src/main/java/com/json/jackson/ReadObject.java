package com.json.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadObject {
	public static void main(String args[]) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper obj = new ObjectMapper();
		String employeeJson = "{\"name\":\"Sandeep\",\"city\":\"Cohoes\",\"department\":\"NYSOH\",\"designation\":\"Software Developer Advisor\"};";
		Employee employee = obj.readValue(employeeJson, Employee.class);
		System.out.println(employee.getName());

		JsonNode jsonNode = obj.readTree(employeeJson);
		String name = jsonNode.get("name").asText();
		String city = jsonNode.get("city").asText();
		String department = jsonNode.get("department").asText();
		String designation = jsonNode.get("designation").asText();

		obj.writeValue(new File("target/empNode.txt"), name + ";" + city + ";" + department + ";" + designation);

	}
}
