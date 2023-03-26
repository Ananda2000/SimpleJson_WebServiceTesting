// Here am passing simple json with single object....

package com.StringReading.json;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class A1_program 
{
	@Test
	public void simpleJson()
	{
		String s1 ="{\"Name\":\"guru\",\"Village\":\"kethaganahalli\",\"language\":\"kannada\"}";
		
		JsonPath jspath = new JsonPath(s1);
		String str =(jspath.get("Name"));
		Assert.assertEquals(str, "guru", "The Name is not  matching with expected values");
		
		
	}

}
