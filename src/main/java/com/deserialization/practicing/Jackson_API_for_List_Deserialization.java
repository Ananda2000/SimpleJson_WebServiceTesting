package com.deserialization.practicing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Jackson_API_for_List_Deserialization 
{
	@Test
	public void List_Deserialization() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmapperss = new ObjectMapper();
		objmapperss.enable(SerializationFeature.INDENT_OUTPUT);
		
		String json="[ \"C\", \"C++\", \"Java\", \"Java EE\", \"Python\", \"Scala\", \"JavaScript\" ]";
		
		List<String> listr= new ArrayList<String>();
		listr = objmapperss.readValue(json, List.class);
		
		System.out.println(listr);
		for (String string1234 : listr) {
			System.out.println(string1234);
			
		}
	}

}
