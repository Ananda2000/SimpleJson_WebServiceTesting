// Here we are read a object array from json file...

package com.Json.Deserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.deserialization.pojoclasses.VillagePojoclass;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadObject_arrayFromJsonArrayString 
{
	@Test
	public void read_object_ArrayFromJsonArrayString() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmapper = new ObjectMapper();
		File fl = new File("JsonFiles/5five.json");
		VillagePojoclass[] vlss;
		vlss=objmapper.readValue(fl, VillagePojoclass[].class);
		
		for (VillagePojoclass vvvvv : vlss) {
			System.out.println(vvvvv.getLanguage());
			System.out.println(vvvvv.getName());
			System.out.println(vvvvv.getVillage());
			System.out.println("-------------------");
			
		}
		
	}

}
