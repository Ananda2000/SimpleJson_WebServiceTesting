package com.Json.Deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.deserialization.pojoclasses.VillagePojoclass;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadObjectFrom_InputStream 
{
	@Test
	public void read_object_from_inputstream() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmap = new ObjectMapper();

		File fl = new File("JsonFiles/one1.json");
		FileInputStream finps = new FileInputStream(fl);
		
		VillagePojoclass vljc= new VillagePojoclass();
		vljc = objmap.readValue(finps, VillagePojoclass.class);
		String str = finps.toString();
		System.out.println("The string is ---"+str);
		System.out.println(vljc.getLanguage());
		System.out.println(vljc.getName());
		System.out.println(vljc.getVillage());
	}

}
