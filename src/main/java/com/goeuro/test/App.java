package com.goeuro.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.goeuro.test.databean.GoEuroCityDetails;
import com.goeuro.test.databean.GoEuroDataBean;
import com.goeuro.test.filebuilder.FileWriterFactory;
import com.goeuro.test.filebuilder.GoEuroFileWriter;
import com.goeuro.test.service.GoEuroServiceAPI;
import com.goeuro.test.util.GoEuroConstants;
import com.goeuro.test.util.GoEuroStringUtils;

/**
 * TODO: In Real time all System.out.println statements will be removed to logger. 
 * This is only for assignment purpose 
 * 
 * Output File Name : Extract_<CityName>_<DDMMYYY_HHMMSS>.csv
 * File will be generated next to your fat jar file.
 * 
 * When no data is received/available for a given Input, a File with header record is created 
 * next to your fat jar file.
 * 
 * Run the jar file with at least Java 7 version 
 *  
 */

public class App {
	public static void main(String[] args) {
		
		Map <String,String> dataSet=null;
		Date today = new Date();
		
		
		System.out.println("Starting GoEuro.jar .......");
		if(args.length>0){
			String input=args[0];			
			if (!GoEuroStringUtils.isEmptyorNull(input)) {
				System.out.println("Initial Parameter Validation Passed .......");
				
				// We can inject Service via Spring DI
				GoEuroServiceAPI goEuroService = new GoEuroServiceAPI();
	
				List<GoEuroCityDetails> cityList = goEuroService.getGoEuroCityDetails(input);
			
				GoEuroFileWriter fileWriter = FileWriterFactory.getFileWriter(GoEuroConstants.CSV_FORMAT);
				List<GoEuroDataBean> goEuroDataBeanList = new LinkedList<GoEuroDataBean>();
				goEuroDataBeanList.addAll(cityList);
				
				// Construct Output File Name with Parameter String & Timestamp
				today = new Date();
				dataSet=new HashMap<String,String>();
				dataSet.put("timestamp",GoEuroConstants.DATE_FORMAT.format(today));
				dataSet.put("cityName",input);
				String fileName=GoEuroStringUtils.replacePlaceholder(GoEuroConstants.OUTPUT_FILENAME, dataSet);
				
				boolean flag=fileWriter.write(fileName,goEuroDataBeanList);
				if(flag){
					System.out.println("Output File Created with name "+ fileName);
				} else {
					System.out.println("Error encountered while inserting records in Output file "+ fileName);
				}
			} else {
				System.out.println("Initial Parameter Validation Failed.......");
			}
		} else {
			System.out.println("Please provide City Name in command line argument");
		}
		System.out.println("Terminating the Call.....");
	}	
}
