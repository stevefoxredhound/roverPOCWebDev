/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rover2.controller; 

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.roverpoc.rover2.service.NclProdMessages1mService;
import org.joda.time.LocalDateTime;
import org.springframework.web.bind.annotation.RequestBody;


import java.io.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.TypeMismatchException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wordnik.swagger.annotations.*;

import com.roverpoc.rover2.*;
import com.roverpoc.rover2.service.*;


/**
 * Controller object for domain model class NclProdMessages1m.
 * @see com.roverpoc.rover2.NclProdMessages1m
 */

@RestController(value = "Rover2.NclProdMessages1mController")
@Api(value = "/rover2/NclProdMessages1m", description = "Exposes APIs to work with NclProdMessages1m resource.")
@RequestMapping("/rover2/NclProdMessages1m")
public class NclProdMessages1mController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NclProdMessages1mController.class);

	@Autowired
	@Qualifier("rover2.NclProdMessages1mService")
	private NclProdMessages1mService nclProdMessages1mService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of NclProdMessages1m instances matching the search criteria.")
	public Page<NclProdMessages1m> findNclProdMessages1ms( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering NclProdMessages1ms list");
		return nclProdMessages1mService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of NclProdMessages1m instances.")
	public Page<NclProdMessages1m> getNclProdMessages1ms(Pageable pageable) {
		LOGGER.debug("Rendering NclProdMessages1ms list");
		return nclProdMessages1mService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of NclProdMessages1m instances.")
	public Long countAllNclProdMessages1ms() {
		LOGGER.debug("counting NclProdMessages1ms");
		Long count = nclProdMessages1mService.countAll();
		return count;
	}


	@RequestMapping(value = "/composite-id", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the NclProdMessages1m instance associated with the given composite-id.")
	public NclProdMessages1m getNclProdMessages1m( @RequestParam("marketId") Double marketId, @RequestParam("batchId") Double batchId, @RequestParam("marketAction") String marketAction, @RequestParam("srcTradeId") String srcTradeId, @RequestParam("srcOrderId") String srcOrderId, @RequestParam("tradeId") Double tradeId, @RequestParam("orderId") Double orderId, @RequestParam("tradeType") String tradeType, @RequestParam("tradeStatus") String tradeStatus, @RequestParam("environmentId") Double environmentId, @RequestParam("environmentCode") String environmentCode, @RequestParam("sourceId") Double sourceId, @RequestParam("sourceCode") String sourceCode, @RequestParam("srcMarket") Double srcMarket, @RequestParam("srcContract") String srcContract, @RequestParam("srcContractType") String srcContractType, @RequestParam("marketCode") Double marketCode, @RequestParam("contractCode") String contractCode, @RequestParam("contractType") String contractType, @RequestParam("expiry") LocalDateTime expiry, @RequestParam("subType") String subType, @RequestParam("strike") Double strike, @RequestParam("price") Double price, @RequestParam("buySell") Double buySell, @RequestParam("quantity") Double quantity, @RequestParam("srcExecutingBroker") String srcExecutingBroker, @RequestParam("executingBroker") String executingBroker, @RequestParam("trader") String trader, @RequestParam("giveInMsg") Double giveInMsg, @RequestParam("openClose") String openClose, @RequestParam("businessDate") LocalDateTime businessDate, @RequestParam("tradeDate") LocalDateTime tradeDate, @RequestParam("userId") String userId, @RequestParam("login") String login, @RequestParam("comment") String comment, @RequestParam("misc1") String misc1, @RequestParam("misc2") String misc2, @RequestParam("misc3") String misc3, @RequestParam("srcCurrency") String srcCurrency, @RequestParam("currencyCode") String currencyCode, @RequestParam("srcFirm") Double srcFirm, @RequestParam("srcOffice") String srcOffice, @RequestParam("srcAccount") String srcAccount, @RequestParam("srcAccountType") String srcAccountType, @RequestParam("firm") Double firm, @RequestParam("office") String office, @RequestParam("account") String account, @RequestParam("accountType") String accountType, @RequestParam("marketStamp") LocalDateTime marketStamp, @RequestParam("marketStatus") String marketStatus, @RequestParam("marketStatusDesc") String marketStatusDesc, @RequestParam("dateTime") LocalDateTime dateTime, @RequestParam("coreSystem") String coreSystem, @RequestParam("coreKey") String coreKey)
	 throws EntityNotFoundException {
	    NclProdMessages1mId temp = new NclProdMessages1mId();
	    temp.setMarketId(marketId);
	    temp.setBatchId(batchId);
	    temp.setMarketAction(marketAction);
	    temp.setSrcTradeId(srcTradeId);
	    temp.setSrcOrderId(srcOrderId);
	    temp.setTradeId(tradeId);
	    temp.setOrderId(orderId);
	    temp.setTradeType(tradeType);
	    temp.setTradeStatus(tradeStatus);
	    temp.setEnvironmentId(environmentId);
	    temp.setEnvironmentCode(environmentCode);
	    temp.setSourceId(sourceId);
	    temp.setSourceCode(sourceCode);
	    temp.setSrcMarket(srcMarket);
	    temp.setSrcContract(srcContract);
	    temp.setSrcContractType(srcContractType);
	    temp.setMarketCode(marketCode);
	    temp.setContractCode(contractCode);
	    temp.setContractType(contractType);
	    temp.setExpiry(expiry);
	    temp.setSubType(subType);
	    temp.setStrike(strike);
	    temp.setPrice(price);
	    temp.setBuySell(buySell);
	    temp.setQuantity(quantity);
	    temp.setSrcExecutingBroker(srcExecutingBroker);
	    temp.setExecutingBroker(executingBroker);
	    temp.setTrader(trader);
	    temp.setGiveInMsg(giveInMsg);
	    temp.setOpenClose(openClose);
	    temp.setBusinessDate(businessDate);
	    temp.setTradeDate(tradeDate);
	    temp.setUserId(userId);
	    temp.setLogin(login);
	    temp.setComment(comment);
	    temp.setMisc1(misc1);
	    temp.setMisc2(misc2);
	    temp.setMisc3(misc3);
	    temp.setSrcCurrency(srcCurrency);
	    temp.setCurrencyCode(currencyCode);
	    temp.setSrcFirm(srcFirm);
	    temp.setSrcOffice(srcOffice);
	    temp.setSrcAccount(srcAccount);
	    temp.setSrcAccountType(srcAccountType);
	    temp.setFirm(firm);
	    temp.setOffice(office);
	    temp.setAccount(account);
	    temp.setAccountType(accountType);
	    temp.setMarketStamp(marketStamp);
	    temp.setMarketStatus(marketStatus);
	    temp.setMarketStatusDesc(marketStatusDesc);
	    temp.setDateTime(dateTime);
	    temp.setCoreSystem(coreSystem);
	    temp.setCoreKey(coreKey);
		LOGGER.debug("Getting NclProdMessages1m with id: {}" , temp);
		NclProdMessages1m instance = nclProdMessages1mService.findById(temp);
		LOGGER.debug("NclProdMessages1m details with id: {}" , instance);
		return instance;
	}
	@RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
	@ApiOperation(value = "Deletes the NclProdMessages1m instance associated with the given composite-id.")
	public boolean deleteNclProdMessages1m( @RequestParam("marketId") Double marketId, @RequestParam("batchId") Double batchId, @RequestParam("marketAction") String marketAction, @RequestParam("srcTradeId") String srcTradeId, @RequestParam("srcOrderId") String srcOrderId, @RequestParam("tradeId") Double tradeId, @RequestParam("orderId") Double orderId, @RequestParam("tradeType") String tradeType, @RequestParam("tradeStatus") String tradeStatus, @RequestParam("environmentId") Double environmentId, @RequestParam("environmentCode") String environmentCode, @RequestParam("sourceId") Double sourceId, @RequestParam("sourceCode") String sourceCode, @RequestParam("srcMarket") Double srcMarket, @RequestParam("srcContract") String srcContract, @RequestParam("srcContractType") String srcContractType, @RequestParam("marketCode") Double marketCode, @RequestParam("contractCode") String contractCode, @RequestParam("contractType") String contractType, @RequestParam("expiry") LocalDateTime expiry, @RequestParam("subType") String subType, @RequestParam("strike") Double strike, @RequestParam("price") Double price, @RequestParam("buySell") Double buySell, @RequestParam("quantity") Double quantity, @RequestParam("srcExecutingBroker") String srcExecutingBroker, @RequestParam("executingBroker") String executingBroker, @RequestParam("trader") String trader, @RequestParam("giveInMsg") Double giveInMsg, @RequestParam("openClose") String openClose, @RequestParam("businessDate") LocalDateTime businessDate, @RequestParam("tradeDate") LocalDateTime tradeDate, @RequestParam("userId") String userId, @RequestParam("login") String login, @RequestParam("comment") String comment, @RequestParam("misc1") String misc1, @RequestParam("misc2") String misc2, @RequestParam("misc3") String misc3, @RequestParam("srcCurrency") String srcCurrency, @RequestParam("currencyCode") String currencyCode, @RequestParam("srcFirm") Double srcFirm, @RequestParam("srcOffice") String srcOffice, @RequestParam("srcAccount") String srcAccount, @RequestParam("srcAccountType") String srcAccountType, @RequestParam("firm") Double firm, @RequestParam("office") String office, @RequestParam("account") String account, @RequestParam("accountType") String accountType, @RequestParam("marketStamp") LocalDateTime marketStamp, @RequestParam("marketStatus") String marketStatus, @RequestParam("marketStatusDesc") String marketStatusDesc, @RequestParam("dateTime") LocalDateTime dateTime, @RequestParam("coreSystem") String coreSystem, @RequestParam("coreKey") String coreKey)throws EntityNotFoundException {
	    NclProdMessages1mId temp = new NclProdMessages1mId();
        temp.setMarketId(marketId);
        temp.setBatchId(batchId);
        temp.setMarketAction(marketAction);
        temp.setSrcTradeId(srcTradeId);
        temp.setSrcOrderId(srcOrderId);
        temp.setTradeId(tradeId);
        temp.setOrderId(orderId);
        temp.setTradeType(tradeType);
        temp.setTradeStatus(tradeStatus);
        temp.setEnvironmentId(environmentId);
        temp.setEnvironmentCode(environmentCode);
        temp.setSourceId(sourceId);
        temp.setSourceCode(sourceCode);
        temp.setSrcMarket(srcMarket);
        temp.setSrcContract(srcContract);
        temp.setSrcContractType(srcContractType);
        temp.setMarketCode(marketCode);
        temp.setContractCode(contractCode);
        temp.setContractType(contractType);
        temp.setExpiry(expiry);
        temp.setSubType(subType);
        temp.setStrike(strike);
        temp.setPrice(price);
        temp.setBuySell(buySell);
        temp.setQuantity(quantity);
        temp.setSrcExecutingBroker(srcExecutingBroker);
        temp.setExecutingBroker(executingBroker);
        temp.setTrader(trader);
        temp.setGiveInMsg(giveInMsg);
        temp.setOpenClose(openClose);
        temp.setBusinessDate(businessDate);
        temp.setTradeDate(tradeDate);
        temp.setUserId(userId);
        temp.setLogin(login);
        temp.setComment(comment);
        temp.setMisc1(misc1);
        temp.setMisc2(misc2);
        temp.setMisc3(misc3);
        temp.setSrcCurrency(srcCurrency);
        temp.setCurrencyCode(currencyCode);
        temp.setSrcFirm(srcFirm);
        temp.setSrcOffice(srcOffice);
        temp.setSrcAccount(srcAccount);
        temp.setSrcAccountType(srcAccountType);
        temp.setFirm(firm);
        temp.setOffice(office);
        temp.setAccount(account);
        temp.setAccountType(accountType);
        temp.setMarketStamp(marketStamp);
        temp.setMarketStatus(marketStatus);
        temp.setMarketStatusDesc(marketStatusDesc);
        temp.setDateTime(dateTime);
        temp.setCoreSystem(coreSystem);
        temp.setCoreKey(coreKey);
		LOGGER.debug("Deleting NclProdMessages1m with id: {}" , temp);
		NclProdMessages1m deleted = nclProdMessages1mService.delete(temp);
		return deleted != null;
	}

	@RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
	@ApiOperation(value = "Updates the NclProdMessages1m instance associated with the given composite-id.")
	public NclProdMessages1m editNclProdMessages1m( @RequestParam("marketId") Double marketId, @RequestParam("batchId") Double batchId, @RequestParam("marketAction") String marketAction, @RequestParam("srcTradeId") String srcTradeId, @RequestParam("srcOrderId") String srcOrderId, @RequestParam("tradeId") Double tradeId, @RequestParam("orderId") Double orderId, @RequestParam("tradeType") String tradeType, @RequestParam("tradeStatus") String tradeStatus, @RequestParam("environmentId") Double environmentId, @RequestParam("environmentCode") String environmentCode, @RequestParam("sourceId") Double sourceId, @RequestParam("sourceCode") String sourceCode, @RequestParam("srcMarket") Double srcMarket, @RequestParam("srcContract") String srcContract, @RequestParam("srcContractType") String srcContractType, @RequestParam("marketCode") Double marketCode, @RequestParam("contractCode") String contractCode, @RequestParam("contractType") String contractType, @RequestParam("expiry") LocalDateTime expiry, @RequestParam("subType") String subType, @RequestParam("strike") Double strike, @RequestParam("price") Double price, @RequestParam("buySell") Double buySell, @RequestParam("quantity") Double quantity, @RequestParam("srcExecutingBroker") String srcExecutingBroker, @RequestParam("executingBroker") String executingBroker, @RequestParam("trader") String trader, @RequestParam("giveInMsg") Double giveInMsg, @RequestParam("openClose") String openClose, @RequestParam("businessDate") LocalDateTime businessDate, @RequestParam("tradeDate") LocalDateTime tradeDate, @RequestParam("userId") String userId, @RequestParam("login") String login, @RequestParam("comment") String comment, @RequestParam("misc1") String misc1, @RequestParam("misc2") String misc2, @RequestParam("misc3") String misc3, @RequestParam("srcCurrency") String srcCurrency, @RequestParam("currencyCode") String currencyCode, @RequestParam("srcFirm") Double srcFirm, @RequestParam("srcOffice") String srcOffice, @RequestParam("srcAccount") String srcAccount, @RequestParam("srcAccountType") String srcAccountType, @RequestParam("firm") Double firm, @RequestParam("office") String office, @RequestParam("account") String account, @RequestParam("accountType") String accountType, @RequestParam("marketStamp") LocalDateTime marketStamp, @RequestParam("marketStatus") String marketStatus, @RequestParam("marketStatusDesc") String marketStatusDesc, @RequestParam("dateTime") LocalDateTime dateTime, @RequestParam("coreSystem") String coreSystem, @RequestParam("coreKey") String coreKey, @RequestBody NclProdMessages1m instance) throws EntityNotFoundException {
	    NclProdMessages1mId temp = new NclProdMessages1mId();
         temp.setMarketId(marketId);
         temp.setBatchId(batchId);
         temp.setMarketAction(marketAction);
         temp.setSrcTradeId(srcTradeId);
         temp.setSrcOrderId(srcOrderId);
         temp.setTradeId(tradeId);
         temp.setOrderId(orderId);
         temp.setTradeType(tradeType);
         temp.setTradeStatus(tradeStatus);
         temp.setEnvironmentId(environmentId);
         temp.setEnvironmentCode(environmentCode);
         temp.setSourceId(sourceId);
         temp.setSourceCode(sourceCode);
         temp.setSrcMarket(srcMarket);
         temp.setSrcContract(srcContract);
         temp.setSrcContractType(srcContractType);
         temp.setMarketCode(marketCode);
         temp.setContractCode(contractCode);
         temp.setContractType(contractType);
         temp.setExpiry(expiry);
         temp.setSubType(subType);
         temp.setStrike(strike);
         temp.setPrice(price);
         temp.setBuySell(buySell);
         temp.setQuantity(quantity);
         temp.setSrcExecutingBroker(srcExecutingBroker);
         temp.setExecutingBroker(executingBroker);
         temp.setTrader(trader);
         temp.setGiveInMsg(giveInMsg);
         temp.setOpenClose(openClose);
         temp.setBusinessDate(businessDate);
         temp.setTradeDate(tradeDate);
         temp.setUserId(userId);
         temp.setLogin(login);
         temp.setComment(comment);
         temp.setMisc1(misc1);
         temp.setMisc2(misc2);
         temp.setMisc3(misc3);
         temp.setSrcCurrency(srcCurrency);
         temp.setCurrencyCode(currencyCode);
         temp.setSrcFirm(srcFirm);
         temp.setSrcOffice(srcOffice);
         temp.setSrcAccount(srcAccount);
         temp.setSrcAccountType(srcAccountType);
         temp.setFirm(firm);
         temp.setOffice(office);
         temp.setAccount(account);
         temp.setAccountType(accountType);
         temp.setMarketStamp(marketStamp);
         temp.setMarketStatus(marketStatus);
         temp.setMarketStatusDesc(marketStatusDesc);
         temp.setDateTime(dateTime);
         temp.setCoreSystem(coreSystem);
         temp.setCoreKey(coreKey);
        nclProdMessages1mService.delete(temp);
        instance = nclProdMessages1mService.create(instance);
	    LOGGER.debug("NclProdMessages1m details with id is updated: {}" , instance);
		return instance;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new NclProdMessages1m instance.")
	public NclProdMessages1m createNclProdMessages1m(@RequestBody NclProdMessages1m instance) {
		LOGGER.debug("Create NclProdMessages1m with information: {}" , instance);
		instance = nclProdMessages1mService.create(instance);
		LOGGER.debug("Created NclProdMessages1m with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setNclProdMessages1mService(NclProdMessages1mService service) {
		this.nclProdMessages1mService = service;
	}
}
