// HERE WE ARE PASSING REQUEST PAYLOAD AS JSON FILE..
package zz_postcall;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postCall_requestBodyAs_jsonfile 
{
	@Test
	public void requestPayload_asJsonFile() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmap = new ObjectMapper();
		
		File fl12 = new File("JsonFiles/postcall.json");
		System.out.println(fl12);
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		RequestSpecification requestSpec1= RestAssured.given();
		requestSpec1.contentType(ContentType.JSON);
		
		requestSpec1.body(fl12);
		Response resp =requestSpec1.post("/booking");
		
		int StatusCode = resp.getStatusCode();
		Assert.assertEquals(StatusCode, 200,"The status is not matching.. hence failing");
		
		//System.out.println(resp.getBody().asString());
		//Map map123 = objmap.readValue(resp, Map.class);
		String ss= resp.getBody().asString();
		System.out.println(ss);
		
		
		JsonPath jsp = new JsonPath(ss);
		System.out.println(jsp.get("booking.bookingdates.checkin"));
		
		
}
}
