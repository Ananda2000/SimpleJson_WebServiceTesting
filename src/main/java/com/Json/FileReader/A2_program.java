package com.Json.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.google.gson.JsonParser;

public class A2_program 
{
	@Test
	public void readingNestedObjects() throws IOException
	
	{
		byte[] Filejson = Files.readAllBytes(Paths.get("JsonFiles/2two.json"));
		String s1 = new String(Filejson);
		
		System.out.println(s1);
		
	}

}
