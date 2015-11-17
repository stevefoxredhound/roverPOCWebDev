
package com.roverpoc.rover2.service;


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
public class Rover2ProcedureExecutorServiceImpl implements Rover2ProcedureExecutorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(Rover2ProcedureExecutorServiceImpl.class);

	@Autowired
	@Qualifier("rover2WMProcedureExecutor")
	private WMProcedureExecutor procedureExecutor;

	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcNumberOfRecordsInUAT()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("procNumberOfRecordsInUAT", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcCombinedSetTheory()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("procCombinedSetTheory", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcNumberCountProdSingleSystem(java.lang.String p1,java.lang.String p2)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        params.put("p2", p2);
        return procedureExecutor.executeNamedProcedure("procNumberCountProdSingleSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcNumberCountUATSingleSystem(java.lang.String p3)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p3", p3);
        return procedureExecutor.executeNamedProcedure("procNumberCountUATSingleSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcVenMain()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("procVenMain", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcNumberCountBothSingleSystem(java.lang.String p1,java.lang.String p2)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        params.put("p2", p2);
        return procedureExecutor.executeNamedProcedure("procNumberCountBothSingleSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcGraphACatByNumDifferences(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procGraphACatByNumDifferences", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcGraphBCatByNumClassifications(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procGraphBCatByNumClassifications", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcGNumDiffThisSysSysDetails(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procGNumDiffThisSysSysDetails", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcFNoDifferencesSysDetails(java.lang.String P1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("P1", P1);
        return procedureExecutor.executeNamedProcedure("procFNoDifferencesSysDetails", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcINumCatDiffSysDetails(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procINumCatDiffSysDetails", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcJNumOfClassificationSysDet(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procJNumOfClassificationSysDet", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcKNumUncatClassSysDet(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procKNumUncatClassSysDet", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcLNumCatClassSysDet(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procLNumCatClassSysDet", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcHNumUnclassDiffThisSysSysDet(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procHNumUnclassDiffThisSysSysDet", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcNumberOfMessagesPRODONLYForThisSystem(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procNumberOfMessagesPRODONLYForThisSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcENumberOfMessagesUATONLYForThisSystem(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procENumberOfMessagesUATONLYForThisSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcDNumberOfMessagesBOTHForThisSystem(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procDNumberOfMessagesBOTHForThisSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeQueryAClassificationsListForThisSystem(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("QueryAClassificationsListForThisSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcVennANumberOfMessagesPRODForThisSystem(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procVennANumberOfMessagesPRODForThisSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcVennBNumberOfMessagesUATForThisSystem(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procVennBNumberOfMessagesUATForThisSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcDClassAndCatClassificationsWithCatRulessListForThisSystem(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procDClassAndCatClassificationsWithCatRulessListForThisSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcEClassCAtDeleteRule(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procEClassCAtDeleteRule", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcAEditRuleUpdate(java.lang.String pCategory,java.lang.String Pcomment,java.lang.String pClassificationName)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pCategory", pCategory);
        params.put("Pcomment", Pcomment);
        params.put("pClassificationName", pClassificationName);
        return procedureExecutor.executeNamedProcedure("procAEditRuleUpdate", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcDEditRuleVersionDisplayOnly(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procDEditRuleVersionDisplayOnly", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeQueryAAMessagesforthisClassificationsWithDifferences(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("QueryAAMessagesforthisClassificationsWithDifferences", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeQueryAShowMessagesWithDifferencesForThisSystem(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("QueryAShowMessagesWithDifferencesForThisSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcMMessCovSysDet(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procMMessCovSysDet", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcNCatCovPerSysDet(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procNCatCovPerSysDet", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcCategorisatonEngine()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("procCategorisatonEngine", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcANumberOfSystems()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("procANumberOfSystems", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeGraphAUncatGroupsViaSystem()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("GraphAUncatGroupsViaSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcFUncategorisedGroups()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("procFUncategorisedGroups", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcBGroupReport(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("ProcBGroupReport", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcBuildMeARuleClassAndCat(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procBuildMeARuleClassAndCat", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcBClassificationColumnListForThisSystem(java.lang.String p1)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("p1", p1);
        return procedureExecutor.executeNamedProcedure("procBClassificationColumnListForThisSystem", params);

	}
	@Transactional(value = "rover2TransactionManager")
	@Override

	public List<Object> executeProcNumberOfRecordsInProd()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("procNumberOfRecordsInProd", params);

	}

	@Transactional(value = "rover2TransactionManager")
	@Override
	public List<Object> executeWMCustomProcedure(CustomProcedure procedure) {
	    return procedureExecutor.executeCustomProcedure(procedure);
	}


}

