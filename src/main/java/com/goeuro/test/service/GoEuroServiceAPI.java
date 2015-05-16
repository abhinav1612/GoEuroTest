package com.goeuro.test.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.goeuro.test.client.WSClient;
import com.goeuro.test.databean.GoEuroCityDetails;
import com.goeuro.test.parser.JsonParser;
import com.goeuro.test.request.RequestBuilder;
import com.goeuro.test.request.GoEuroSimpleRequestBuilder;
import com.goeuro.test.util.GoEuroConstants;
import com.goeuro.test.util.GoEuroStringUtils;
import com.google.gson.reflect.TypeToken;


public class GoEuroServiceAPI {

	public List<GoEuroCityDetails> getGoEuroCityDetails(String paramString) {

		List<GoEuroCityDetails> goEuroCityList = null;
		Type formatType = null; 
		Object parsedOuputObj = null;
		RequestBuilder requestBuilderObj = new GoEuroSimpleRequestBuilder();

		WSClient goEuroClient = WSClient.getClientInstance();
		String requestURL = requestBuilderObj.buildrequest(paramString);
		String jsonResponse = goEuroClient.getData(requestURL,GoEuroConstants.JSON_RESPONSE_TYPE);
		
		if(GoEuroStringUtils.isEmptyorNull(jsonResponse) || jsonResponse.equalsIgnoreCase(GoEuroConstants.EMPTY_JSON_ARRAY)){
			System.out.println("No details found for the requested city.....");
			goEuroCityList = Collections.emptyList();
		} else {
			formatType = new TypeToken<List<GoEuroCityDetails>>(){}.getType();
			parsedOuputObj = JsonParser.parse(jsonResponse, formatType);
			if (parsedOuputObj == null) {
				goEuroCityList = Collections.emptyList();
			} else {
				goEuroCityList = (List<GoEuroCityDetails>) parsedOuputObj;
			}
		}
		
		return goEuroCityList;
	}
}
