
package com.roverpoc.rovermar01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Qualifier;

import  com.roverpoc.rovermar01.service.Rovermar01ProcedureExecutorService;
import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;
import com.wordnik.swagger.annotations.*;

@RestController(value = "Rovermar01.ProcedureExecutionController")
@Api(value = "/rovermar01/procedureExecutor", description = "Controller class for procedure execution")
@RequestMapping("/rovermar01/procedureExecutor")
public class ProcedureExecutionController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProcedureExecutionController.class);

	@Autowired
	private Rovermar01ProcedureExecutorService procedureService;
	
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverSystemCount", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverSystemCount(
		 )
	    {
			LOGGER.debug("Executing named procedure FunctionCallRoverSystemCount");

		List<Object> result = procedureService.executeFunctionCallRoverSystemCount();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfRecordInProd", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfRecordInProd(
		 )
	    {
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfRecordInProd");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfRecordInProd();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfRecordInUat", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfRecordInUat(
		 )
	    {
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfRecordInUat");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfRecordInUat();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfUncategorisedGroups", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfUncategorisedGroups(
		 )
	    {
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfUncategorisedGroups");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfUncategorisedGroups();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	

	@RequestMapping(value = "/procedure/execute/wm_custom", method = RequestMethod.POST)
	@ApiOperation(value = "Process request to execute custom Procedure")
	public List<Object> executeWMCustomProcedure(@RequestBody CustomProcedure procedure) {
		List<Object> result = procedureService.executeWMCustomProcedure(procedure);
		LOGGER.debug("got the result {}" + result);
		return result;
	}

}

