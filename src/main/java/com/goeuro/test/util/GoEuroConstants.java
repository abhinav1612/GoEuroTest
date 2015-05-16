package com.goeuro.test.util;

import java.text.SimpleDateFormat;

public class GoEuroConstants {

	public static final String GOEURO_CITY_DETAILS_BASE_URL="http://api.goeuro.com/api/v2/position/suggest/en/${reqParam}";
	public static final int MAX_RETRY_ATTEMPTS=7;
	public static final String JSON_RESPONSE_TYPE="application/json";
	public static final String EMPTY_JSON_ARRAY="[]";
	
	// File Header Constants - Can be moved into separate Property Files
	public static final String FIELD_DISCRTIPTOR_ID="ID";
	public static final String FIELD_DISCRTIPTOR_NAME="NAME";
	public static final String FIELD_DISCRTIPTOR_TYPE="TYPE";
	public static final String FIELD_DISCRTIPTOR_LATITUDE="LATITUDE";
	public static final String FIELD_DISCRTIPTOR_LONGITUDE="LONGITUDE";
	
	// Output File related constants 
	public static final String OUTPUT_FILENAME="Extract_${cityName}_${timestamp}.csv";
	public static final String CSV_FORMAT="csv";
	public static final String COMMA_DELIMITER=",";
	public static final String NEWLINE_CHARACTER="\n";
	
	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("ddMMyyyy_HHmmSS");
	
}
