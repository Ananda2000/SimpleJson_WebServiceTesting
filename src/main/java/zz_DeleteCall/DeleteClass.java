package zz_DeleteCall;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import zz_AuthenticationCall.Authentication_TokenGeneration;

public class DeleteClass 
{
	@Test
	public void deleteClass()
	{
		ObjectMapper objmapp = new ObjectMapper();
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking/13836";
		RequestSpecification requsp = RestAssured.given();
		String cookiesss=Authentication_TokenGeneration.Auth_tokenGeneration();
		
		requsp.contentType(ContentType.JSON);
		requsp.header("Cookie",cookiesss);
		Response respdele = requsp.delete();
		
		String stttt= respdele.getBody().asString();
		System.out.println("The status code ---"+ respdele.getStatusCode());
		int statuscode = respdele.getStatusCode();
		Assert.assertEquals(201, statuscode);
		System.out.println(stttt);
		
	}

}
