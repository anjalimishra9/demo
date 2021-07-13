/**
 * 
 */
package com.example.demo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Operations;
import com.example.demo.service.OperationsService;


/**
 * This class is used to define rest endpoint(s) to call different implemented functions in the service.
 *
 * @author anjali.mishra
 */
@RestController
public class OperationsController {
	
	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(OperationsController.class);

	/** The operations service. */
	@Autowired
	private OperationsService operationsService;

	/**
	 * Gets the operations by RL 100 code.
	 *
	 * @param rl100_Code the rl 100 code
	 * @return the operations by RL 100 code
	 */
	@GetMapping("/operations/{rl100_Code}")
	public ResponseEntity<Operations> getOperationsByRL100Code(@PathVariable("rl100_Code") String rl100_Code) {
		LOGGER.debug("OperationsController:Method Called>getOperationsByRL100Code");
		Operations operations = operationsService.getOperationsByRL100Code(rl100_Code);
		if (operations == null) {
			return new ResponseEntity<Operations>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Operations>(operations, HttpStatus.OK);
	}

}
