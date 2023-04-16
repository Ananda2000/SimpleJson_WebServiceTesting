package zz_postcall;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.deserialization.pojoclasses.BookingIdPostcall_response;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import payloads.Payloadesss;

public class PostCall_passing_jsonobject_payload 
{
	@Test
	public void passingJavaobject_As_payload() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmap11 = new ObjectMapper();
		File fl123 = new File("JsonFiles/postcall.json");
		
		// HERE WE ARE CONVERTING JSON DATA FROM FILE TO JAVA OBJECT ,, DESERIALIZATION DIERECTLY FROM JSON FILE
		BookingIdPostcall_response bookpost = objmap11.readValue(fl123,BookingIdPostcall_response.class );
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		RequestSpecification requestspec = RestAssured.given();
		requestspec.contentType(ContentType.JSON);
		//HERE WE ARE PASSING REQUEST BODY AS JAVA OBJECT... DESERIALIZED OBJECT..
		requestspec.body(bookpost);
		Response resp = requestspec.post("/booking");
		
		System.out.println(resp.getStatusCode());
		int statusCode = resp.getStatusCode();
		
		ResponseBody respbody = resp.getBody();
		System.out.println("The response body --------------------------");
		System.out.println(respbody.asString());
		
		
	}

}
