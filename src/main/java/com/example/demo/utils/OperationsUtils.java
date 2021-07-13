package com.example.demo.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import com.example.demo.model.Operations;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * This class is used to provide common utils functions.
 * 
 * @author anjali.mishra
 */
public class OperationsUtils {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(OperationsUtils.class);

	/** The operations list to store operations object from csv file. */
	private static List<Operations> operationsList = null;

	/**
	 * Gets the opreations list after parsing data from CSV file.
	 *
	 * @return the opreations list from CSV file
	 */
	public static List<Operations> getOpreationsListFromCSVFile() {
		LOGGER.debug("FileUtils:Method Called>getOpreationsListFromCSVFile");
		if (operationsList == null) {
			try {
				InputStream resource = new ClassPathResource(
						"static/csvfiles/DBNetz-Betriebsstellenverzeichnis-Stand2021-07.csv").getInputStream();
				try (BufferedReader reader = new BufferedReader(
						new InputStreamReader(resource, StandardCharsets.UTF_8))) {
					CsvToBean<Operations> csvToBean = new CsvToBeanBuilder<Operations>(reader).withSeparator(';')
							.withType(Operations.class).withSkipLines(1).withIgnoreLeadingWhiteSpace(true).build();
					operationsList = csvToBean.parse();
				}
			} catch (IOException e) {
				LOGGER.error(String.format("Unable to process file! Error Message:%s", e.getMessage()));
			}
		}

		return operationsList;
	}

}
