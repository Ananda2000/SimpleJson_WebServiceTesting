package com.Json.Deserialization;

import java.io.IOException;

import org.testng.annotations.Test;

import com.deserialization.pojoclasses.VillagePojoclass;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;

import io.restassured.path.json.JsonPath;

public class A1_program 
{
	@Test
	public void test1234() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmap = new ObjectMapper();
	String ss ="{ \"name\" : \"Guru\", \"village\" : \"kethaganahalli\" , \"language\" : \"kannada\" }";

	
	VillagePojoclass vpj = new VillagePojoclass();
	
	//JsonPath jsp = new JsonPath(ss);
	//System.out.println(jsp.get("Name"));
	 vpj = objmap.readValue(ss, VillagePojoclass.class);
	System.out.println(vpj);
	System.out.println(vpj.getName());
	System.out.println(vpj.getLanguage());
	System.out.println(vpj.getVillage());
	
	}
}
