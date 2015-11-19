
package com.roverpoc.rovermar01.service;

import java.util.Map;
import java.util.List;


import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface Rovermar01ProcedureExecutorService {

    List<Object> executeFunctionCallRoverSystemCount() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfUncategorisedGroups() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverVennSetCountsForAllSystems() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverUncategorisedGroupsBySystem() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordInBoth( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordInUatOnly( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordNoDiff( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordDiff( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordDiffUncat( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordDiffCat( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeCallRoverNumberOfGroups( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfGroupsUncat( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfGroupsCat( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverMessageCoverage( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverGroupCoverage( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordInProd() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordInUat() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordsInProdBySystem( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordsInUatBySystem( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordInProdOnly( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverUncategorisedGroups( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverShowDataDifferences( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionroverBuildCategorisationRule( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverCategorisedGroups( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionRoverRemoveCategorisationRule( java.lang.String p1) throws QueryParameterMismatchException;


	
	List<Object> executeWMCustomProcedure(CustomProcedure procedure) ;


}

