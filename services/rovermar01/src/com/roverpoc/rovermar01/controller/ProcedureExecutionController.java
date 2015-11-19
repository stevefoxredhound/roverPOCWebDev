
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
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverVennSetCountsForAllSystems", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverVennSetCountsForAllSystems(
		 )
	    {
			LOGGER.debug("Executing named procedure FunctionCallRoverVennSetCountsForAllSystems");

		List<Object> result = procedureService.executeFunctionCallRoverVennSetCountsForAllSystems();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverUncategorisedGroupsBySystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverUncategorisedGroupsBySystem(
		 )
	    {
			LOGGER.debug("Executing named procedure FunctionCallRoverUncategorisedGroupsBySystem");

		List<Object> result = procedureService.executeFunctionCallRoverUncategorisedGroupsBySystem();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfRecordInBoth", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfRecordInBoth(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfRecordInBoth");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfRecordInBoth( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfRecordInUatOnly", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfRecordInUatOnly(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfRecordInUatOnly");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfRecordInUatOnly( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfRecordNoDiff", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfRecordNoDiff(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfRecordNoDiff");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfRecordNoDiff( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfRecordDiff", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfRecordDiff(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfRecordDiff");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfRecordDiff( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfRecordDiffUncat", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfRecordDiffUncat(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfRecordDiffUncat");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfRecordDiffUncat( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfRecordDiffCat", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfRecordDiffCat(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfRecordDiffCat");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfRecordDiffCat( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/callRoverNumberOfGroups", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeCallRoverNumberOfGroups(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure callRoverNumberOfGroups");

		List<Object> result = procedureService.executeCallRoverNumberOfGroups( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfGroupsUncat", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfGroupsUncat(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfGroupsUncat");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfGroupsUncat( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfGroupsCat", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfGroupsCat(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfGroupsCat");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfGroupsCat( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverMessageCoverage", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverMessageCoverage(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverMessageCoverage");

		List<Object> result = procedureService.executeFunctionCallRoverMessageCoverage( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverGroupCoverage", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverGroupCoverage(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverGroupCoverage");

		List<Object> result = procedureService.executeFunctionCallRoverGroupCoverage( p1);

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
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfRecordsInProdBySystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfRecordsInProdBySystem(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfRecordsInProdBySystem");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfRecordsInProdBySystem( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfRecordsInUatBySystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfRecordsInUatBySystem(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfRecordsInUatBySystem");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfRecordsInUatBySystem( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/FunctionCallRoverNumberOfRecordInProdOnly", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeFunctionCallRoverNumberOfRecordInProdOnly(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure FunctionCallRoverNumberOfRecordInProdOnly");

		List<Object> result = procedureService.executeFunctionCallRoverNumberOfRecordInProdOnly( p1);

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

