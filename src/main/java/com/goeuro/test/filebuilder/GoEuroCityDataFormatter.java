package com.goeuro.test.filebuilder;

import com.goeuro.test.databean.GoEuroCityDetails;
import com.goeuro.test.databean.GoEuroDataBean;
import com.goeuro.test.util.GoEuroConstants;

public class GoEuroCityDataFormatter{
	
	public String formatDataRecord(GoEuroDataBean dataBean,String delimiter) {
		
		StringBuffer record;
		
		if(dataBean instanceof GoEuroCityDetails){
			record=new StringBuffer();
			GoEuroCityDetails city=(GoEuroCityDetails) dataBean;
			record.append(city.get_id());
			record.append(delimiter);
			
			record.append(city.getName());
			record.append(delimiter);
			
			record.append(city.getType());
			record.append(delimiter);
			
			record.append(city.getGeo_position().getLatitude());
			record.append(delimiter);
			
			record.append(city.getGeo_position().getLongitude());
			
		}else{
			System.out.println("Not a valid GoEuroCityDetails Data Bean");
			record=new StringBuffer("-1");
		}
				
		return record.toString();
	}
	
	public String formatHeaderRecord(String delimiter){
		
		StringBuffer header= new StringBuffer();
		header.append(GoEuroConstants.FIELD_DISCRTIPTOR_ID);
		header.append(delimiter);
		
		header.append(GoEuroConstants.FIELD_DISCRTIPTOR_NAME);
		header.append(delimiter);
		
		header.append(GoEuroConstants.FIELD_DISCRTIPTOR_TYPE);
		header.append(delimiter);
		
		header.append(GoEuroConstants.FIELD_DISCRTIPTOR_LATITUDE);
		header.append(delimiter);
		
		header.append(GoEuroConstants.FIELD_DISCRTIPTOR_LONGITUDE);
		
		return header.toString();
	}
}
