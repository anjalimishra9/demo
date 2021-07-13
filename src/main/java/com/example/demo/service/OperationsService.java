package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.model.Operations;
import com.example.demo.utils.OperationsUtils;


/**
 * This class is used to implement business logic.
 * 
 * @author anjali.mishra
 */
@Service
public class OperationsService {
	
	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(OperationsService.class);

	/**
	 * Gets the operations by RL 100 code.
	 *
	 * @param rl100_Code the rl 100 code
	 * @return the operations by RL 100 code
	 */
	public Operations getOperationsByRL100Code(String rl100_Code) {
		LOGGER.debug("OperationsService:Method Called>getOperationsByRL100Code");
		Operations operations = null;
		List<Operations> operationsList = OperationsUtils.getOpreationsListFromCSVFile();
		if (operationsList != null && !operationsList.isEmpty()) {
			Optional<Operations> matchingObject = operationsList.stream()
					.filter(filterOperations -> filterOperations.getRl100_Code().equalsIgnoreCase(rl100_Code))
					.findFirst();
			operations = matchingObject.isPresent() ? matchingObject.get() : null;
		}
		return operations;
	}
}
