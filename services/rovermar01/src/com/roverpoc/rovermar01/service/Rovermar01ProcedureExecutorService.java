
package com.roverpoc.rovermar01.service;

import java.util.Map;
import java.util.List;


import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface Rovermar01ProcedureExecutorService {

    List<Object> executeFunctionCallRoverSystemCount() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordInProd() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfRecordInUat() throws QueryParameterMismatchException;


    List<Object> executeFunctionCallRoverNumberOfUncategorisedGroups() throws QueryParameterMismatchException;


	
	List<Object> executeWMCustomProcedure(CustomProcedure procedure) ;


}

