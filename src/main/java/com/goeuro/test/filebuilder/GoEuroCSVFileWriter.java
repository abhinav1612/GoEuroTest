package com.goeuro.test.filebuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.goeuro.test.databean.GoEuroDataBean;
import com.goeuro.test.util.GoEuroConstants;
import com.goeuro.test.util.GoEuroStringUtils;


public class GoEuroCSVFileWriter implements GoEuroFileWriter {

	@Override
	public boolean write(String fileName,List<GoEuroDataBean> dataBeanList) {

		System.out.println("Inside CSVFileWriter....");
		FileWriter fileWriter = null;
		boolean isSuccess=false;
		int recordCount=0;
			
		try {
			GoEuroCityDataFormatter dataFormatter = new GoEuroCityDataFormatter();
			fileWriter = new FileWriter(fileName);
			
			// Adding File Header Record
			fileWriter.append(dataFormatter.formatHeaderRecord(GoEuroConstants.COMMA_DELIMITER));
			fileWriter.append(GoEuroConstants.NEWLINE_CHARACTER);
		
			// Adding File Detail Records
			for (GoEuroDataBean dataBean : dataBeanList) {
				fileWriter.append(dataFormatter.formatDataRecord(dataBean, GoEuroConstants.COMMA_DELIMITER));
				fileWriter.append(GoEuroConstants.NEWLINE_CHARACTER);
				recordCount++;
				//System.out.println(dataFormatter.formatDataRecord(dataBean, GoEuroConstants.COMMA_DELIMITER));
			}
			isSuccess=true;
			
			if(recordCount==0){
				System.out.println("No Details found for requested City,File created with only header record");
			}
			
		} catch (IOException e) {
			System.out.println("Exception Occured while inserting records into file " +e);
			// e.printStackTrace();
			isSuccess=false;
		} finally {
			try {
				if (fileWriter != null) {
					fileWriter.flush();
					fileWriter.close();
				}
			} catch (IOException e) {
				System.out.println("Exception Occured while closing records into file "+e);
				//e.printStackTrace();
			}
		}
		
		return isSuccess;
	}
}
