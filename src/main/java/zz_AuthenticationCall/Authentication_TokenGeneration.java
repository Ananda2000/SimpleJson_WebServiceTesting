package zz_AuthenticationCall;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authentication_TokenGeneration 
{
	//@Test
	public static String Auth_tokenGeneration()
	{
		//String UserName_password = "{\"username\":\"admin\",\"password\":\"password123\"}'";
		String UserName_password =	"{\"username\":\"admin\",\"password\":\"password123\"}";
		String url ="https://restful-booker.herokuapp.com";
		
		RestAssured.baseURI=url;
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		
		req.body(UserName_password);
		Response resp =req.post("/auth");
		System.out.println(resp.getStatusCode());
		
		String resp_string =resp.getBody().asString();
		System.out.println(resp_string);
		JsonPath jsp = new JsonPath(resp_string);
		String str_token = jsp.getString("token");
		System.out.println("The token is ------"+str_token);
		  String token = "token="+str_token;
		System.out.println("After appending the token ---"+token);
		return token;
	}

}
