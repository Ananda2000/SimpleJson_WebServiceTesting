package com.serialization.practicing;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jackson_API_for_Set_Serialization 
{
	@Test
	public void Set_Serialization() throws JsonProcessingException
	{
		ObjectMapper objMap_set = new ObjectMapper();
		
		Set<String> set1 = new HashSet<String>();
		
		set1.add("set12");
		set1.add("set21");
		set1.add("validating");
		set1.add("Game1");
		
		String jsonset = objMap_set.writeValueAsString(set1);
		//HERE ITERATING THE SET VALUES...
		
		for (String string123 : set1)
		{
			System.out.println(string123);
		}
		
		System.out.println("The serialized set values is -----------");
		System.out.println(jsonset);
		
		
	}

}
