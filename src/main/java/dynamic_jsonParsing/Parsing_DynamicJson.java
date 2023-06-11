package dynamic_jsonParsing;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonObject;

public class Parsing_DynamicJson 
{
	
	public static void parseJsonobject (JSONObject jsonobj, String key)
	{
		String keyss= key;
		System.out.println(jsonobj.has("key"));
		System.out.println(keyss +":"+jsonobj.get("key"));
	}
	public static void getKey(JSONObject jsonobj, String key)
	{
		boolean keypresent =jsonobj.has(key);
		Iterator<?> keys;
		String nextkeys;
		if(!keypresent)
		{
			keys= jsonobj.keys();
			parseJsonobject(jsonobj, key);
			
		}
		else
		{
			System.out.println(jsonobj.get(key));
			if(jsonobj.get(key) instanceof JsonObject)
			{
				System.out.println(jsonobj.get("key"));
			}
			else if(jsonobj.get(key) instanceof JSONArray)
			{
				JSONArray jsonarrr = new JSONArray(key);
				int arraysize = jsonarrr.length();
				for(int i=0;i<arraysize;i++)
				{
					System.out.println(jsonarrr.get(i));
				}
				
			}
		}
	}

}
