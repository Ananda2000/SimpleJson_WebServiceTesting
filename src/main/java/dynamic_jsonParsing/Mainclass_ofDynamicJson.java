package dynamic_jsonParsing;

import java.util.Map;

import org.json.JSONObject;

import com.google.gson.JsonObject;

import java.lang.Object;

public class Mainclass_ofDynamicJson 
{
	public static void main(String[] args)
	{
		String jsonstring=JsonDataStrong.json1();
		JSONObject jsonobj = new JSONObject(jsonstring);
		Parsing_DynamicJson pardynamic = new Parsing_DynamicJson();
		String key_value ="gender";
		
		System.out.println("the string is -----"+jsonstring);
		
		pardynamic.getKey(jsonobj, key_value);
		
		
	}

}
