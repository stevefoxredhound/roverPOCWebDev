
package com.roverpoc.rover2.controller;

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

import  com.roverpoc.rover2.service.Rover2ProcedureExecutorService;
import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;
import com.wordnik.swagger.annotations.*;

@RestController(value = "Rover2.ProcedureExecutionController")
@Api(value = "/rover2/procedureExecutor", description = "Controller class for procedure execution")
@RequestMapping("/rover2/procedureExecutor")
public class ProcedureExecutionController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProcedureExecutionController.class);

	@Autowired
	private Rover2ProcedureExecutorService procedureService;
	
	@RequestMapping(value = "/procedure/execute/procNumberOfRecordsInUAT", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcNumberOfRecordsInUAT(
		 )
	    {
			LOGGER.debug("Executing named procedure procNumberOfRecordsInUAT");

		List<Object> result = procedureService.executeProcNumberOfRecordsInUAT();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procCombinedSetTheory", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcCombinedSetTheory(
		 )
	    {
			LOGGER.debug("Executing named procedure procCombinedSetTheory");

		List<Object> result = procedureService.executeProcCombinedSetTheory();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procNumberCountProdSingleSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcNumberCountProdSingleSystem(
			@RequestParam(value="p1", required=false) java.lang.String p1,
			@RequestParam(value="p2", required=false) java.lang.String p2
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procNumberCountProdSingleSystem");

		List<Object> result = procedureService.executeProcNumberCountProdSingleSystem( p1, p2);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procNumberCountUATSingleSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcNumberCountUATSingleSystem(
			@RequestParam(value="p3", required=false) java.lang.String p3
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procNumberCountUATSingleSystem");

		List<Object> result = procedureService.executeProcNumberCountUATSingleSystem( p3);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procVenMain", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcVenMain(
		 )
	    {
			LOGGER.debug("Executing named procedure procVenMain");

		List<Object> result = procedureService.executeProcVenMain();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procNumberCountBothSingleSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcNumberCountBothSingleSystem(
			@RequestParam(value="p1", required=false) java.lang.String p1,
			@RequestParam(value="p2", required=false) java.lang.String p2
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procNumberCountBothSingleSystem");

		List<Object> result = procedureService.executeProcNumberCountBothSingleSystem( p1, p2);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procGraphACatByNumDifferences", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcGraphACatByNumDifferences(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procGraphACatByNumDifferences");

		List<Object> result = procedureService.executeProcGraphACatByNumDifferences( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procGraphBCatByNumClassifications", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcGraphBCatByNumClassifications(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procGraphBCatByNumClassifications");

		List<Object> result = procedureService.executeProcGraphBCatByNumClassifications( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procGNumDiffThisSysSysDetails", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcGNumDiffThisSysSysDetails(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procGNumDiffThisSysSysDetails");

		List<Object> result = procedureService.executeProcGNumDiffThisSysSysDetails( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procFNoDifferencesSysDetails", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcFNoDifferencesSysDetails(
			@RequestParam(value="P1", required=false) java.lang.String P1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procFNoDifferencesSysDetails");

		List<Object> result = procedureService.executeProcFNoDifferencesSysDetails( P1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procINumCatDiffSysDetails", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcINumCatDiffSysDetails(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procINumCatDiffSysDetails");

		List<Object> result = procedureService.executeProcINumCatDiffSysDetails( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procJNumOfClassificationSysDet", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcJNumOfClassificationSysDet(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procJNumOfClassificationSysDet");

		List<Object> result = procedureService.executeProcJNumOfClassificationSysDet( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procKNumUncatClassSysDet", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcKNumUncatClassSysDet(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procKNumUncatClassSysDet");

		List<Object> result = procedureService.executeProcKNumUncatClassSysDet( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procLNumCatClassSysDet", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcLNumCatClassSysDet(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procLNumCatClassSysDet");

		List<Object> result = procedureService.executeProcLNumCatClassSysDet( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procHNumUnclassDiffThisSysSysDet", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcHNumUnclassDiffThisSysSysDet(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procHNumUnclassDiffThisSysSysDet");

		List<Object> result = procedureService.executeProcHNumUnclassDiffThisSysSysDet( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procNumberOfMessagesPRODONLYForThisSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcNumberOfMessagesPRODONLYForThisSystem(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procNumberOfMessagesPRODONLYForThisSystem");

		List<Object> result = procedureService.executeProcNumberOfMessagesPRODONLYForThisSystem( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procENumberOfMessagesUATONLYForThisSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcENumberOfMessagesUATONLYForThisSystem(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procENumberOfMessagesUATONLYForThisSystem");

		List<Object> result = procedureService.executeProcENumberOfMessagesUATONLYForThisSystem( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procDNumberOfMessagesBOTHForThisSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcDNumberOfMessagesBOTHForThisSystem(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procDNumberOfMessagesBOTHForThisSystem");

		List<Object> result = procedureService.executeProcDNumberOfMessagesBOTHForThisSystem( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/QueryAClassificationsListForThisSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeQueryAClassificationsListForThisSystem(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure QueryAClassificationsListForThisSystem");

		List<Object> result = procedureService.executeQueryAClassificationsListForThisSystem( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procVennANumberOfMessagesPRODForThisSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcVennANumberOfMessagesPRODForThisSystem(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procVennANumberOfMessagesPRODForThisSystem");

		List<Object> result = procedureService.executeProcVennANumberOfMessagesPRODForThisSystem( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procVennBNumberOfMessagesUATForThisSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcVennBNumberOfMessagesUATForThisSystem(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procVennBNumberOfMessagesUATForThisSystem");

		List<Object> result = procedureService.executeProcVennBNumberOfMessagesUATForThisSystem( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procDClassAndCatClassificationsWithCatRulessListForThisSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcDClassAndCatClassificationsWithCatRulessListForThisSystem(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procDClassAndCatClassificationsWithCatRulessListForThisSystem");

		List<Object> result = procedureService.executeProcDClassAndCatClassificationsWithCatRulessListForThisSystem( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procEClassCAtDeleteRule", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcEClassCAtDeleteRule(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procEClassCAtDeleteRule");

		List<Object> result = procedureService.executeProcEClassCAtDeleteRule( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procAEditRuleUpdate", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcAEditRuleUpdate(
			@RequestParam(value="pCategory", required=false) java.lang.String pCategory,
			@RequestParam(value="Pcomment", required=false) java.lang.String Pcomment,
			@RequestParam(value="pClassificationName", required=false) java.lang.String pClassificationName
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procAEditRuleUpdate");

		List<Object> result = procedureService.executeProcAEditRuleUpdate( pCategory, Pcomment, pClassificationName);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procDEditRuleVersionDisplayOnly", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcDEditRuleVersionDisplayOnly(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procDEditRuleVersionDisplayOnly");

		List<Object> result = procedureService.executeProcDEditRuleVersionDisplayOnly( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/QueryAAMessagesforthisClassificationsWithDifferences", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeQueryAAMessagesforthisClassificationsWithDifferences(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure QueryAAMessagesforthisClassificationsWithDifferences");

		List<Object> result = procedureService.executeQueryAAMessagesforthisClassificationsWithDifferences( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/QueryAShowMessagesWithDifferencesForThisSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeQueryAShowMessagesWithDifferencesForThisSystem(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure QueryAShowMessagesWithDifferencesForThisSystem");

		List<Object> result = procedureService.executeQueryAShowMessagesWithDifferencesForThisSystem( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procMMessCovSysDet", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcMMessCovSysDet(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procMMessCovSysDet");

		List<Object> result = procedureService.executeProcMMessCovSysDet( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procNCatCovPerSysDet", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcNCatCovPerSysDet(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procNCatCovPerSysDet");

		List<Object> result = procedureService.executeProcNCatCovPerSysDet( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procCategorisatonEngine", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcCategorisatonEngine(
		 )
	    {
			LOGGER.debug("Executing named procedure procCategorisatonEngine");

		List<Object> result = procedureService.executeProcCategorisatonEngine();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procANumberOfSystems", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcANumberOfSystems(
		 )
	    {
			LOGGER.debug("Executing named procedure procANumberOfSystems");

		List<Object> result = procedureService.executeProcANumberOfSystems();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/GraphAUncatGroupsViaSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeGraphAUncatGroupsViaSystem(
		 )
	    {
			LOGGER.debug("Executing named procedure GraphAUncatGroupsViaSystem");

		List<Object> result = procedureService.executeGraphAUncatGroupsViaSystem();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procFUncategorisedGroups", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcFUncategorisedGroups(
		 )
	    {
			LOGGER.debug("Executing named procedure procFUncategorisedGroups");

		List<Object> result = procedureService.executeProcFUncategorisedGroups();

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/ProcBGroupReport", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcBGroupReport(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure ProcBGroupReport");

		List<Object> result = procedureService.executeProcBGroupReport( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procBuildMeARuleClassAndCat", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcBuildMeARuleClassAndCat(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procBuildMeARuleClassAndCat");

		List<Object> result = procedureService.executeProcBuildMeARuleClassAndCat( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procBClassificationColumnListForThisSystem", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcBClassificationColumnListForThisSystem(
			@RequestParam(value="p1", required=false) java.lang.String p1
		 )
	     throws QueryParameterMismatchException{
			LOGGER.debug("Executing named procedure procBClassificationColumnListForThisSystem");

		List<Object> result = procedureService.executeProcBClassificationColumnListForThisSystem( p1);

		LOGGER.debug("got the result of named procedure {}", result);
		return result;
	}
	@RequestMapping(value = "/procedure/execute/procNumberOfRecordsInProd", method = RequestMethod.GET)
	@ApiOperation(value = "Process request to execute Procedure")
	public List<Object> executeProcNumberOfRecordsInProd(
		 )
	    {
			LOGGER.debug("Executing named procedure procNumberOfRecordsInProd");

		List<Object> result = procedureService.executeProcNumberOfRecordsInProd();

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

