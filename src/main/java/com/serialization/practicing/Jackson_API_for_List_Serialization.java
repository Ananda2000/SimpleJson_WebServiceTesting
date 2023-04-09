package com.serialization.practicing;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jackson_API_for_List_Serialization 
{
	
	private static final String[] String123 = null;

	// The method is used to check the list serialization using Jackson API....
	@Test
	public void List_serialization() throws JsonProcessingException
	{
		ObjectMapper objmap = new ObjectMapper();
		List<String> progLangs= new ArrayList<String>();
		progLangs.add("C");
		progLangs.add("Java");
		progLangs.add("python");
		progLangs.add("C++");
		
		String list_serial = objmap.writeValueAsString(progLangs);
		System.out.println(list_serial);
		//This is finding the size of the list..
		System.out.println("The size of the list is ------------"+progLangs.size());
		
		String [] str= new String[progLangs.size()];
		int i=0;
		//CONVERT THE LIST TO STRING ARRAY....
		for (String string123 : progLangs) 
		{
			System.out.println(string123);
			str[i] = progLangs.get(i);
			i++;
			
		}
		System.out.println(str.length);
		
	}

}
