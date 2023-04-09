// Here we are read a object array from json file...

package com.Json.Deserialization;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

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
		FileReader fr1 = new FileReader(fl);
		VillagePojoclass[] vlss;
		vlss=objmapper.readValue(fl, VillagePojoclass[].class);
		// THIS IS LOOPS WITH DESERIALIZATION.....
		for (VillagePojoclass vvvvv : vlss) {
			System.out.println(vvvvv.getLanguage());
			System.out.println(vvvvv.getName());
			System.out.println(vvvvv.getVillage());
			System.out.println("-------------------");
			
		}
		
		
		// HERE AM CONVERTING OBJECT ARRAY TO MAP AND DISPLAYING.....
		Map[] mapstr = objmapper.readValue(fr1, Map[].class);
		System.out.println(mapstr.length);
		
		for(int i=0;i<mapstr.length;i++)
		{
				Map<String, String> mapstr1 = mapstr[i];
				for (Map.Entry<String, String> map999 : mapstr1.entrySet()) 
				{
					System.out.println(map999.getKey()+" ---- "+map999.getValue());
				}
		System.out.println("======================================");
		}
		
		
		
	}

}
