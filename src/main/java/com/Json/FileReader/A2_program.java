package com.Json.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonParser;

import io.restassured.path.json.JsonPath;

public class A2_program 
{
	@Test
	public void readingNestedObjects() throws IOException
	
	{
		byte[] Filejson = Files.readAllBytes(Paths.get("JsonFiles/2two.json"));
		String s1 = new String(Filejson);
		
		//System.out.println(s1);
		JsonPath jsp1 = new JsonPath(s1);

String name =jsp1.get("Names1.Name");
String Village =jsp1.get("Names1.Village");
String language =jsp1.get("Names1.language");
Assert.assertEquals(name, "guru","The name is not matching");
Assert.assertEquals(Village, "kethaganahalli", "Village name is not matching");
Assert.assertEquals(language, "kannada", "The Language is not matching ---");


		

		System.out.println(jsp1.get("Names1"));

		System.out.println("this is latest changes on everning 8:08pm");

	


	}

}
