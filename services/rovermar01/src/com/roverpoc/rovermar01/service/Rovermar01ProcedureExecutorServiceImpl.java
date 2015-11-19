
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

	public List<Object> executeFunctionCallRoverNumberOfUncategorisedGroups()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfUncategorisedGroups", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverVennSetCountsForAllSystems()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverVennSetCountsForAllSystems", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverUncategorisedGroupsBySystem()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverUncategorisedGroupsBySystem", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfRecordInBoth(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfRecordInBoth", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfRecordInUatOnly(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfRecordInUatOnly", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfRecordNoDiff(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfRecordNoDiff", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfRecordDiff(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfRecordDiff", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfRecordDiffUncat(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfRecordDiffUncat", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfRecordDiffCat(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfRecordDiffCat", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeCallRoverNumberOfGroups(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("callRoverNumberOfGroups", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfGroupsUncat(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfGroupsUncat", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfGroupsCat(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfGroupsCat", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverMessageCoverage(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverMessageCoverage", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverGroupCoverage(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverGroupCoverage", params);

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

	public List<Object> executeFunctionCallRoverNumberOfRecordsInProdBySystem(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfRecordsInProdBySystem", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfRecordsInUatBySystem(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfRecordsInUatBySystem", params);

	}
	@Transactional(value = "rovermar01TransactionManager")
	@Override

	public List<Object> executeFunctionCallRoverNumberOfRecordInProdOnly(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("FunctionCallRoverNumberOfRecordInProdOnly", params);

	}

	@Transactional(value = "rovermar01TransactionManager")
	@Override
	public List<Object> executeWMCustomProcedure(CustomProcedure procedure) {
	    return procedureExecutor.executeCustomProcedure(procedure);
	}


}

