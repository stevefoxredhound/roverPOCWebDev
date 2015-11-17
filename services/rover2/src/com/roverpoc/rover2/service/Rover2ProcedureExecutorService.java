
package com.roverpoc.rover2.service;

import java.util.Map;
import java.util.List;


import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface Rover2ProcedureExecutorService {

    List<Object> executeProcNumberOfRecordsInUAT() throws QueryParameterMismatchException;


    List<Object> executeProcCombinedSetTheory() throws QueryParameterMismatchException;


    List<Object> executeProcNumberCountProdSingleSystem( java.lang.String p1, java.lang.String p2) throws QueryParameterMismatchException;


    List<Object> executeProcNumberCountUATSingleSystem( java.lang.String p3) throws QueryParameterMismatchException;


    List<Object> executeProcVenMain() throws QueryParameterMismatchException;


    List<Object> executeProcNumberCountBothSingleSystem( java.lang.String p1, java.lang.String p2) throws QueryParameterMismatchException;


    List<Object> executeProcGraphACatByNumDifferences( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcGraphBCatByNumClassifications( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcGNumDiffThisSysSysDetails( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcFNoDifferencesSysDetails( java.lang.String P1) throws QueryParameterMismatchException;


    List<Object> executeProcINumCatDiffSysDetails( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcJNumOfClassificationSysDet( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcKNumUncatClassSysDet( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcLNumCatClassSysDet( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcHNumUnclassDiffThisSysSysDet( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcNumberOfMessagesPRODONLYForThisSystem( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcENumberOfMessagesUATONLYForThisSystem( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcDNumberOfMessagesBOTHForThisSystem( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeQueryAClassificationsListForThisSystem( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcVennANumberOfMessagesPRODForThisSystem( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcVennBNumberOfMessagesUATForThisSystem( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcDClassAndCatClassificationsWithCatRulessListForThisSystem( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcEClassCAtDeleteRule( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcAEditRuleUpdate( java.lang.String pCategory, java.lang.String Pcomment, java.lang.String pClassificationName) throws QueryParameterMismatchException;


    List<Object> executeProcDEditRuleVersionDisplayOnly( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeQueryAAMessagesforthisClassificationsWithDifferences( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeQueryAShowMessagesWithDifferencesForThisSystem( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcMMessCovSysDet( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcNCatCovPerSysDet( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcCategorisatonEngine() throws QueryParameterMismatchException;


    List<Object> executeProcANumberOfSystems() throws QueryParameterMismatchException;


    List<Object> executeGraphAUncatGroupsViaSystem() throws QueryParameterMismatchException;


    List<Object> executeProcFUncategorisedGroups() throws QueryParameterMismatchException;


    List<Object> executeProcBGroupReport( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcBuildMeARuleClassAndCat( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcBClassificationColumnListForThisSystem( java.lang.String p1) throws QueryParameterMismatchException;


    List<Object> executeProcNumberOfRecordsInProd() throws QueryParameterMismatchException;


	
	List<Object> executeWMCustomProcedure(CustomProcedure procedure) ;


}

