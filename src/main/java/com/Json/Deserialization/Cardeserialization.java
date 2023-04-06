package com.Json.Deserialization;

import java.io.IOException;

import org.testng.annotations.Test;

import com.deserialization.pojoclasses.Car;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Cardeserialization 


{
	@Test
	public void test0909() {
	ObjectMapper objectMapper = new ObjectMapper();
	
	String carJson ="{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";
	try {
	    Car car = objectMapper.readValue(carJson, Car.class);

	    System.out.println("car brand = " + car.getBrand());
	    System.out.println("car doors = " + car.getDoors());
	} catch (IOException e)
	{
	    e.printStackTrace();
	}
}
}
