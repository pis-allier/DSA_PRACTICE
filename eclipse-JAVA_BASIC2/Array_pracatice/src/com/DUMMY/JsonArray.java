package com.DUMMY;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jsonData = "{\"locations\":[{\"lat\":\"23.053\","
				+ "\"long\":\"72.629\",\"location\":\"ABC\","
				+ "\"address\":\"DEF\",\"city\":\"Ahmedabad\","
				+ "\"state\":\"Gujrat\",\"phonenumber\":\"1234567\"},"
				+ "{\"lat\":\"21.013\",\"long\":\"52.619\","
				+ "\"location\":\"XYZ\",\"address\":\"MNP\",\"city\":\"Ghaziabad\","
				+ "\"state\":\"UP\",\"phonenumber\":\"212321\"}]}";
		
		//now convert json string into json object
		
		JSONObject json = new JSONObject(jsonData);
		
		//get array of filed data you need to fetch from json object and store into json array
		JSONArray jsonArray = json.getJSONArray("locations");
		
		//iterate json array using loop
		for(int i=0; i<jsonArray.length();i++) {
			//store each object into JSONOBJECT
			JSONObject object = jsonArray.getJSONObject(i);
			
			//get field value from JSONobject using get() method
			System.out.println(object.get("address"));
		}
	}

}
