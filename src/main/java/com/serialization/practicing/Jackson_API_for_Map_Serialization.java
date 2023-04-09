package com.serialization.practicing;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Jackson_API_for_Map_Serialization 
{
	@Test
	public void Map_serialization() throws JsonProcessingException
	{
		ObjectMapper objmap_map = new ObjectMapper();
		objmap_map.enable(SerializationFeature.INDENT_OUTPUT);
		
		Map<String, Integer> days = new HashMap<String, Integer>();
		days.put("MON", Calendar.MONDAY);
        days.put("TUE", Calendar.TUESDAY);
        days.put("WED", Calendar.WEDNESDAY);
        days.put("THU", Calendar.THURSDAY);
        days.put("FRI", Calendar.FRIDAY);
        days.put("SAT", Calendar.SATURDAY);
        days.put("SUN", Calendar.SUNDAY);
        
           
        // Here we doing serialization process easy......
        	String mapsjson = objmap_map.writeValueAsString(days);
        	System.out.println(mapsjson);
        	
        	 for (Map.Entry<String, Integer> mapentry: days.entrySet())
             {
             	
             	if(mapentry.getKey() =="SUN")
             	{
             		days.put("SUN", mapentry.getValue()+1);
             		System.out.println("--------------------");
             	}
             	System.out.println(mapentry.getKey() +"---"+mapentry.getValue());
             	
        		}
        	

	}

	
	 
}
