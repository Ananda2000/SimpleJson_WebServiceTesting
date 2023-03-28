// Here am reading simple json file with only single object...

package com.Json.FileReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class A1_program 
{
	@Test
	public void readjsonfile1() throws IOException, ParseException
	{
		/*JSONParser jsp = new JSONParser();
		
		FileReader fr = new FileReader("JsonFiles/one1.json");
		Object obj =  jsp.parse(fr);
		String s1 = (String) obj;
		System.out.println(s1);
		*/
		
		
		byte[] fileinput = Files.readAllBytes(Paths.get("JsonFiles/one1.json"));
		
		String s1 = new String(fileinput);
		
		//System.out.println(s1);
		JsonPath jsop = new JsonPath(s1);
		
		System.out.println(jsop.get("Name"));
		System.out.println(jsop.get("Village"));
		System.out.println(jsop.get("language"));
		
	}

}
