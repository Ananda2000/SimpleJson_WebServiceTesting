package zz_putCall;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import payloads.Payloadesss;
import zz_AuthenticationCall.Authentication_TokenGeneration;

public class Putcall 
{
	@Test
	public void putcall()
	{
		ObjectMapper putmapper = new ObjectMapper();
		String puturl ="https://restful-booker.herokuapp.com/booking/2644";
		RestAssured.baseURI=puturl;
		RequestSpecification putRequest = RestAssured.given();
		String str = Payloadesss.putPayload();
		String cookievalue = Authentication_TokenGeneration.Auth_tokenGeneration();
		System.out.println("The token generated is ---"+cookievalue);
		putRequest.header("Content-Type","application/json").header("Accept","application/json").header("Cookie",cookievalue);
		
		putRequest.body(str);
		Response putresponse=putRequest.put();
		System.out.println("The status code ---"+putresponse.getStatusCode());
		 ResponseBody respbody = putresponse.getBody();
		 System.out.println(respbody.asString());
	}

}
