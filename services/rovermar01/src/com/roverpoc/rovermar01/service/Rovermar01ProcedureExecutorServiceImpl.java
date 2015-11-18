
package com.roverpoc.rovermar01.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@Service
public class Rovermar01ProcedureExecutorServiceImpl implements Rovermar01ProcedureExecutorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(Rovermar01ProcedureExecutorServiceImpl.class);

	@Autowired
	@Qualifier("rovermar01WMProcedureExecutor")
	private WMProcedureExecutor procedureExecutor;

	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverSystemCount()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverSystemCount", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfRecordInProd()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfRecordInProd", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfRecordInUat()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfRecordInUat", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfUncategorisedGroups()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfUncategorisedGroups", params);

	}

	@Transactional(value = "rovermar01TransactionManager")
	@Override
	public List<Object> executeWMCustomProcedure(CustomProcedure procedure) {
	    return procedureExecutor.executeCustomProcedure(procedure);
	}


}

