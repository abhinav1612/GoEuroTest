package com.goeuro.test.request;

import java.util.HashMap;
import java.util.Map;

import com.goeuro.test.util.GoEuroConstants;
import com.goeuro.test.util.GoEuroStringUtils;

public class GoEuroSimpleRequestBuilder implements RequestBuilder {
	
	@Override
	public String buildrequest(String parameterString) {
		
		String requestUrl;
		Map <String,String> values=new HashMap<>();
		values.put("reqParam",parameterString);
		requestUrl=GoEuroStringUtils.replacePlaceholder(GoEuroConstants.GOEURO_CITY_DETAILS_BASE_URL, values);
		System.out.println("Request URL ==> "+requestUrl);
	
		return requestUrl;
	}
}
