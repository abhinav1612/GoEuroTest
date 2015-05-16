package com.goeuro.test.filebuilder;

import java.io.File;
import java.io.IOException;

import com.goeuro.test.util.GoEuroConstants;

public class FileWriterFactory {

	private FileWriterFactory() {
	}

	public static GoEuroFileWriter getFileWriter(String fileType) {

		GoEuroFileWriter fileWriter = null;
		fileType = fileType.toLowerCase();
	
		switch (fileType) {
		case GoEuroConstants.CSV_FORMAT:
			fileWriter = new GoEuroCSVFileWriter();
			break;

		default:
			System.out.println("Invalid File Type");
			break;
		}

		return fileWriter;
	}
}
