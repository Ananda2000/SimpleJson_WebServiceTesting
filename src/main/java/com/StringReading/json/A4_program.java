// Array of objects......

package com.StringReading.json;

import java.util.List;

import org.json.simple.JSONArray;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class A4_program {
	
	@Test
	public void arrayOfObjects()
	{
		String s1="{\"products\":[{\"Name\":\"guru\",\"Village\":\"kethaganahalli\",\"language\":\"Kannda\"},{\"Name\":\"guru1\",\"Village\":\"kethaganahalli1\",\"language\":\"Kannda1\"}]}";
		JsonPath jspath = new JsonPath(s1);
	List <String> sls= jspath.get("products.Name");
	System.out.println("The list size is ---"+sls.size());
	
	for (String string123 : sls) {
		System.out.println(string123);
		
	}
	
		
		
	}

}
