package com.goeuro.test.parser;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class JsonParser {

	public static Object parse(String jsonString,Type formatType ) {
		
		Gson gson = new Gson();
		Object formattedOutput = null;
		
		try {
			formattedOutput = gson.fromJson(jsonString, formatType);
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		}
		return formattedOutput;
	}
}
