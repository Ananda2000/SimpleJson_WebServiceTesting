package com.deserialization.practicing;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Jackson_API_for_Map_Deserialization 
{
	@Test
	public void map_deserialization() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper map_object = new ObjectMapper();
		map_object.enable(SerializationFeature.INDENT_OUTPUT);
		
		String mapString ="{" +
	            "  \"THU\" : 5," +
	            "  \"TUE\" : 3," +
	            "  \"WED\" : 4," +
	            "  \"SAT\" : 7," +
	            "  \"FRI\" : 6," +
	            "  \"MON\" : 2," +
	            "  \"SUN\" : 1" +
	            "}";
		Map<String, Integer> map_converion = new HashMap<String, Integer>();
		map_converion = map_object.readValue(mapString, Map.class);
		
		for (Map.Entry<String, Integer> itrElement : map_converion.entrySet()) {
			
			System.out.println(itrElement.getKey() +"----"+itrElement.getValue());
		}
	
	}

}
