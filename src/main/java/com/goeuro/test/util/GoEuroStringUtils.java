package com.goeuro.test.util;

import java.util.Map;

import org.apache.commons.lang3.text.StrSubstitutor;

public class GoEuroStringUtils {

	public static final String EMPTY_JSON_ARRAY_STRING="[]";
	
	public static boolean isEmptyorNull(String input) {

		boolean flag = true;
		if (input != null && !input.isEmpty()) {
			flag = false;
		}
		return flag;
	}
	
	public static String replacePlaceholder(String template,Map<String, String> values){
		String output=StrSubstitutor.replace(template, values);
		return output;
	}
	
	
}
