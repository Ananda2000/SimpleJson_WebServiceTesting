// Here am using the get call from this url [https://restful-booker.herokuapp.com/booking]
//
package com.StringReading.json;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class A5_program 
{
	@Test
	public void reading_Getcall()
	{
		String s1="[{\"bookingid\":12302},{\"bookingid\":3527},{\"bookingid\":3878},{\"bookingid\":1465},{\"bookingid\":11793},{\"bookingid\":10951},{\"bookingid\":5891},{\"bookingid\":6398}]";
		
		JsonPath jspath = new JsonPath(s1);
		//System.out.println(jspath.get("bookingid"));
		List<Integer> aa= jspath.get("bookingid");
		System.out.println(aa.size());
		
		for (Integer string11 : aa) 
		{
			System.out.println(string11);
		}
	
	}

}
