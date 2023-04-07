package objectMapperClassesExamples;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.deserialization.pojoclasses.VillagePojoclass;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Read_Object_List_From_JSON_Array_String 
{
	@Test
	public void readObjectListFromJsonArrayString() throws JsonParseException, JsonMappingException, IOException
	{
		File fl = new File("JsonFiles/5five.json");
		ObjectMapper objmapp = new ObjectMapper();
		
		//VillagePojoclass vlgg = new VillagePojoclass();
		List<VillagePojoclass> vlgg= objmapp.readValue(fl, new TypeReference<List<VillagePojoclass>>() {});
		
		System.out.println(vlgg.size());
		
		for (VillagePojoclass voll11 : vlgg) 
		{
			System.out.println(voll11.getLanguage());
			System.out.println(voll11.getName());
			System.out.println(voll11.getVillage());
			
		}
		
	}

}
