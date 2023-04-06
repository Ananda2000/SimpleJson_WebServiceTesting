package com.Json.FileReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.json.simple.JSONArray;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.path.json.JsonPath;

public class A4_program 
{
	@Test
	public void A4_program() throws IOException
	{
		File ff = new File("JsonFiles/4four.json");
		byte[] bits = Files.readAllBytes(Paths.get("JsonFiles/4four.json"));
		
		String sss= new String(bits);
		JsonPath jsp4= new JsonPath(sss);
		System.out.println(jsp4.get("products.Village"));
		List<String> villagenames = jsp4.get("products.Village");
	boolean bbb =villagenames.contains("kethaganahalli1");
	System.out.println(bbb ==true);
	{
		System.out.println("The expected value is matching");
	}
		
	}

}
