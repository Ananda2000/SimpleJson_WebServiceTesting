// This class we are reading array in a object....

package com.StringReading.json;

import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class A3_program 
{
	@Test
	public void arrayOfObjects()
	{
		String s1 ="{\"Name\":\"guru\",\"Village\":\"kethaganahalli\",\"language\":[\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\"]}";
		
		JsonPath jspath = new JsonPath(s1);
		System.out.println(jspath.get("language"));
		
		List<String> setvalues = jspath.getList("language");
		
		for (String string123 : setvalues) 
		{
			System.out.println(string123);
			
		}
	}

}
