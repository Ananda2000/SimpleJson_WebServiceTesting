// This program reads json data from file and object contains array..

package com.Json.FileReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;

public class A3_program 
{
	@Test
	public void JsonArray() throws IOException
	{
		
		
		
	byte[] String3 = Files.readAllBytes(Paths.get("JsonFiles/3thr.json"));
		
		String s3 = new String(String3);		
		JsonPath jsp3 = new JsonPath(s3);
		
		System.out.println(jsp3.get("language"));
		ArrayList<String> aa =jsp3.get("language");
		System.out.println(aa);
		//Set<String> set11= (Set<String>) aa;
		ArrayList<String>ab = new ArrayList<String>();
		// here am storing all
		
		ab.addAll(aa);
		ab.add("aaa");
		System.out.println(aa.get(0)+"--"+ab.get(0));
		Assert.assertEquals(aa, ab,"Arraylist is not matching");
		
	
	}
	

}
