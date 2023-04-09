package com.deserialization.practicing;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import groovy.transform.builder.InitializerStrategy.SET;

public class Jackson_API_for_Set_Deserialization 
{
	@Test
	public void set_deserialization() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper set_mapper = new ObjectMapper();
		set_mapper.enable(SerializationFeature.INDENT_OUTPUT);
		
		String jsonSet ="[ \"C\", \"C++\", \"Java\", \"Java EE\", \"Python\", \"Scala\", \"JavaScript\" ]";
		Set<String> set123 = new HashSet<String>();
		
		set123 = (Set<String>) set_mapper.readValue(jsonSet, Set.class);
		for (String string_set : set123) 
		{
			System.out.println(string_set);
			
		}
		
	}

}
