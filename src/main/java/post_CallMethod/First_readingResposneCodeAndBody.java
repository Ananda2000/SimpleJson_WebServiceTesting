package post_CallMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.deserialization.pojoclasses.Bookid;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class First_readingResposneCodeAndBody
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
			System.out.println(bookid.getBookingid());
			lis.add(bookid.getBookingid());
		}
		System.out.println(lis);
		System.out.println(lis.contains(2463333));
		List<Integer> lise = new ArrayList<Integer>();
		lise.add(2392);
		lise.add(875);
		
	}

}
