package zz_getCall;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.deserialization.pojoclasses.Bookid;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Getcall_1 
{
	@Test
	public void firstResponseBody() throws JsonParseException, JsonMappingException, IOException
	{

		ObjectMapper objmpr = new ObjectMapper();
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		
		RequestSpecification request = RestAssured.given();
		Response resp = request.get("/booking");
	
		System.out.println(resp.getStatusCode());
		ResponseBody respbody = resp.getBody();
		String ss = respbody.asString();
		System.out.println(ss);
		Bookid [] bid ;
		List<Integer> lis = new ArrayList<Integer>();
		bid = objmpr.readValue(ss, Bookid[].class);
		
		System.out.println(bid.length);
		for (Bookid bookid : bid) 
		{
			//System.out.println(bookid.getBookingid());
			lis.add(bookid.getBookingid());
		}
		System.out.println(lis);
		System.out.println(lis.contains(246));
		
		
		// Now we are reading the response header....
		Headers headersss = resp.getHeaders();
		System.out.println(headersss);
		
		for (Header header : headersss) {
			System.out.println(header.getName()+"---"+header.getValue());
		}
		
		
		/// here we are displaying STATUS LINE...
		
		System.out.println("----- THE STATUS LINE IS ------");
		System.out.println(resp.getStatusLine());

	// HERE WE DISPLAYING THE RESPONSE TIME
		
		System.out.println("--------------- THE RESPONSE TIME IS ----------------");
		//System.out.println(resp.ti);
	}



}
