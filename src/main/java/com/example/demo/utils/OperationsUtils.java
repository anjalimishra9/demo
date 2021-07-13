package com.example.demo.utils;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;

import com.example.demo.model.Operations;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;


/**
 * This class is used to provide common utils functions.
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
		File file = null;
		try {
			if (operationsList == null) {
				file = ResourceUtils
						.getFile("classpath:static/csvfiles/DBNetz-Betriebsstellenverzeichnis-Stand2021-07.csv");
				Reader reader = Files.newBufferedReader(Paths.get(file.toURI()), StandardCharsets.UTF_8);
				CsvToBean<Operations> csvToBean = new CsvToBeanBuilder<Operations>(reader).withSeparator(';')
						.withType(Operations.class).withSkipLines(1).withIgnoreLeadingWhiteSpace(true).build();
				operationsList = csvToBean.parse();
			}

		} catch (IOException e) {
			LOGGER.error(String.format("Unable to process file: %s. Error Message:%s", file.getName(), e.getMessage()));
		}

		return operationsList;
	}

}
