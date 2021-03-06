/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/


package com.roverpoc.rovermar01.service;

import java.util.Map;
import java.util.List;


import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface Rovermar01ProcedureExecutorService {

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


    List<Object> executeFunctionroverBuildCategorisationRule( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverCategorisedGroups( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionRoverRemoveCategorisationRule( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionRoverroverGroupReport( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionRoverGroupReport( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallroverUpdateCategorisationRule( java.lang.String name, java.lang.String category, java.lang.String comment) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverCcolumnList( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverShowDataDifferences( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFuntionCallRoverComparisonEngine() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverEngineControl() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverDuplicatesForAllSystems() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverSystemCount() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverDuplicateCountForProd( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverDuplicateCountForUAT( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverDashboardCounts() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverSystemDetailCounts( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverCollationControl() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverEngineStatus() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverCollationStatus() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfUncategorisedGroups() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverVennSetCountsForAllSystems() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverDashboardVennCounts() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverVennSetCounts( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverReportHealthCheckTable( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverReportHealthCheck( java.lang.String p1) throws QueryParameterMismatchException;


	
	List<Object> executeWMCustomProcedure(CustomProcedure procedure) ;


}

