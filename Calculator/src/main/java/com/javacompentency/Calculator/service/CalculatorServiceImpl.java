package com.javacompentency.Calculator.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacompentency.Calculator.controller.MinMax;
import com.javacompentency.Calculator.dao.CalculatorDao;
import com.javacompentency.Calculator.model.RequestResponseCache;

@Service
public class CalculatorServiceImpl implements CalculatorService{

	private static final Logger LOG = LoggerFactory.getLogger(CalculatorServiceImpl.class);
	
	@Autowired
	CalculatorDao calculatorDao;
	
	private static final String ANSWER = "Answer";
	private static final String DETAIL = "Detail";
	private Map<String,String> response = new HashMap<>();
	
	public String addition( Integer number1, Integer number2 ){
		LOG.info("CalculatorService : addition Start");
		RequestResponseCache res;
		RequestResponseCache reqres = calculatorDao.findById(number1+" + "+number2).orElse(null);

		if(reqres != null) {
			return reqres.getResponse();
		} else {
			RequestResponseCache req = new RequestResponseCache();
			req.setId(number1+" + "+number2);
			req.setOperation("addition");
			req.setRequest(number1+" + "+number2);

			response.put(ANSWER, String.valueOf(number1+number2));
			response.put(DETAIL, number1+" + "+number2+" = "+(number1+number2)); 
			req.setResponse(response.toString());

			req.setCreationTime(LocalDateTime.now());
			req.setUpdatedTime(LocalDateTime.now());
			res= calculatorDao.save(req);
		}
		return res.toString();
	}

	public String subtraction( Integer number1, Integer number2 ){
		LOG.info("CalculatorService : subtraction Start");
		RequestResponseCache res;
		RequestResponseCache reqres = calculatorDao.findById(number1+" - "+number2).orElse(null);

		if(reqres != null) {
			return reqres.getResponse();
		} else {
			RequestResponseCache req = new RequestResponseCache();
			req.setId(number1+" - "+number2);
			req.setOperation("subtraction");
			req.setRequest(number1+" - "+number2);

			response.put(ANSWER, String.valueOf(number1-number2));
			response.put(DETAIL, number1+" - "+number2+" = "+(number1-number2));
			req.setResponse(response.toString());

			req.setCreationTime(LocalDateTime.now());
			req.setUpdatedTime(LocalDateTime.now());
			res= calculatorDao.save(req);
		}
		return res.toString();
	}
	
	public String multiplication( Integer number1, Integer number2 ){
		LOG.info("CalculatorService : multiplication Start");
		RequestResponseCache res;
		RequestResponseCache reqres = calculatorDao.findById(number1+" * "+number2).orElse(null);

		if(reqres != null) {
			return reqres.getResponse();
		} else {
			RequestResponseCache req = new RequestResponseCache();
			req.setId(number1+" * "+number2);
			req.setOperation("multiplication");
			req.setRequest(number1+" * "+number2);

			response.put(ANSWER, String.valueOf(number1*number2));
			response.put(DETAIL, number1+" * "+number2+" = "+(number1*number2));
			req.setResponse(response.toString());

			req.setCreationTime(LocalDateTime.now());
			req.setUpdatedTime(LocalDateTime.now());
			res= calculatorDao.save(req);
		}
		return res.toString();
	}
	
	public String division( Integer number1, Integer number2 ){
		LOG.info("CalculatorService : division Start");
		RequestResponseCache res;
		RequestResponseCache reqres = calculatorDao.findById(number1+" / "+number2).orElse(null);

		if(reqres != null) {
			return reqres.getResponse();
		} else {
			RequestResponseCache req = new RequestResponseCache();
			req.setId(number1+" / "+number2);
			req.setOperation("division");
			req.setRequest(number1+" / "+number2);

			response.put(ANSWER, String.valueOf(number1/number2));
			response.put(DETAIL, number1+" / "+number2+" = "+(number1/number2));
			req.setResponse(response.toString());

			req.setCreationTime(LocalDateTime.now());
			req.setUpdatedTime(LocalDateTime.now());
			res= calculatorDao.save(req);
		}
		return res.toString();
	}
	
	public String square( Integer number){
		LOG.info("CalculatorService : square Start");
		RequestResponseCache res;
		RequestResponseCache reqres = calculatorDao.findById("Square of "+number).orElse(null);

		if(reqres != null) {
			return reqres.getResponse();
		} else {
			RequestResponseCache req = new RequestResponseCache();
			req.setId("Square of "+number);
			req.setOperation("square");
			req.setRequest("Square of "+number);

			response.put(ANSWER, String.valueOf(number*number));
			response.put(DETAIL, "Square of "+number+" = "+(number*number));
			req.setResponse(response.toString());

			req.setCreationTime(LocalDateTime.now());
			req.setUpdatedTime(LocalDateTime.now());
			res= calculatorDao.save(req);
		}
		return res.toString();
	}
	
	public String squareroot( Integer number){
		LOG.info("CalculatorService : squareroot Start");
		RequestResponseCache res;
		RequestResponseCache reqres = calculatorDao.findById("squareroot of "+number).orElse(null);

		if(reqres != null) {
			return reqres.getResponse();
		} else {
			RequestResponseCache req = new RequestResponseCache();
			req.setId("squareroot of "+number);
			req.setOperation("squareroot");
			req.setRequest("squareroot of "+number);

			response.put(ANSWER, String.valueOf(Math.sqrt(number)));
			response.put(DETAIL, "squareroot of "+number+" = "+(Math.sqrt(number)));
			req.setResponse(response.toString());

			req.setCreationTime(LocalDateTime.now());
			req.setUpdatedTime(LocalDateTime.now());
			res= calculatorDao.save(req);
		}
		return res.toString();
	}
	
	public String factorial( Integer number){
		LOG.info("CalculatorService : factorial Start");
		RequestResponseCache res;
		RequestResponseCache reqres = calculatorDao.findById(number+"!").orElse(null);

		if(reqres != null) {
			return reqres.getResponse();
		} else {
			RequestResponseCache req = new RequestResponseCache();
			req.setId(number+"!");
			req.setOperation("factorial");
			req.setRequest(number+"!");

			int fact=1;

			for(int i=1;i<=number;i++) {
				fact = i * fact;
			}
			
			response.put(ANSWER, String.valueOf(fact));
			response.put(DETAIL, number+"! = "+fact);
			req.setResponse(response.toString());

			req.setCreationTime(LocalDateTime.now());
			req.setUpdatedTime(LocalDateTime.now());
			res= calculatorDao.save(req);
		}
		return res.toString();
	}
	
	public String minmax( MinMax minmax){
		LOG.info("CalculatorService : minmax Start");
		RequestResponseCache res;
		RequestResponseCache reqres = calculatorDao.findById(minmax.toString()).orElse(null);

		if(reqres != null) {
			return reqres.getResponse();
		} else {
			RequestResponseCache req = new RequestResponseCache();
			req.setId(minmax.toString());
			req.setOperation("minmax");
			req.setRequest(minmax.toString());

			Integer max = minmax.getNumbers().stream().max((n1,n2)->n1.compareTo(n2)).get();
			Integer min = minmax.getNumbers().stream().min((n1,n2)->n1.compareTo(n2)).get();
			
			response.put(ANSWER, "Min : "+min+" ,Max : "+max);
			response.put(DETAIL, minmax.getNumbers().toString());
			
			req.setResponse(response.toString());

			req.setCreationTime(LocalDateTime.now());
			req.setUpdatedTime(LocalDateTime.now());
			res= calculatorDao.save(req);
		}
		return res.toString();
	}
	
}
