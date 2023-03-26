// here we are reading 2 different object inside one object... nested objects...

package com.StringReading.json;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class A2_program 
{

	@Test
	public void nestedJsonobjects()
	{
		String s1 ="{\"Names1\":{\"Name\":\"guru\",\"Village\":\"kethaganahalli\",\"language\":\"kannada\"},\"Names2\":{\"Name\":\"guru1\",\"Village\":\"kethaganahalli_1\",\"language\":\"kannada_1\"}}";
		JsonPath jsopath = new JsonPath(s1);
		System.out.println(jsopath.get("Names1.Name"));
		System.out.println(jsopath.get("Names2.Name"));
		//System.out.println(s1);
	}
}
