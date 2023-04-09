package zz_postcall;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCall_testing_viaString 
{
	@Test
	public void postcallTesting()
	{
		ObjectMapper objmap = new ObjectMapper();
		String requestBody ="{\"firstname\":\"Jim\",\"lastname\":\"Brown\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Breakfast\"}";
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		RequestSpecification requestpost= RestAssured.given();
		requestpost.contentType(ContentType.JSON);
		requestpost.body(requestBody);
		Response resp = requestpost.post();
		
		int StatusCode =resp.getStatusCode();
		System.out.println("The status code is ---"+StatusCode);
		
		
		
		
		
		
		
	}

}
