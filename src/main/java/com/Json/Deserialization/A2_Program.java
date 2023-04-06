// Here we are doing deserialize to json to java object by reading data from json file..

package com.Json.Deserialization;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.testng.annotations.Test;

import com.deserialization.pojoclasses.VillagePojoclass;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class A2_Program 
{
	@Test
	public void deserialize_filejsondata() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmp = new ObjectMapper();
		File fl = new File("JsonFiles/one1.json");
		FileReader flread = new FileReader(fl);
		
		VillagePojoclass vilpj = new VillagePojoclass();
		vilpj = objmp.readValue(fl, VillagePojoclass.class);
		
		System.out.println("Name--"+vilpj.getName());
		System.out.println("village --"+vilpj.getLanguage());
		System.out.println("language --"+vilpj.getVillage());
	}

}
