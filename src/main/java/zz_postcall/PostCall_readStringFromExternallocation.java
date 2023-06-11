// Here am reading the payload from #payloads/payloadessss.java files

package zz_postcall;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import payloads.Payloadesss;

public class PostCall_readStringFromExternallocation 
{
@Test	
	public void read_fromOtherClasss()
	{
		ObjectMapper objmappp= new ObjectMapper();
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		RequestSpecification requestspec = RestAssured.given();
		requestspec.contentType(ContentType.JSON);
		requestspec.body(Payloadesss.CreateBooking());
		Response resp = requestspec.post();
		
		System.out.println(resp.getStatusCode());
		int statusCode = resp.getStatusCode();
		
		ResponseBody respbody = resp.getBody();
		System.out.println("The response body --------------------------");
		System.out.println(respbody.asString());
	}

}
