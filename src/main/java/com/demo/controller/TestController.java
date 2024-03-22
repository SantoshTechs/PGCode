package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.pojo.PaymentRequestBody;
import com.demo.pojo.PaymentResponseBody;
import com.demo.pojo.TestResp;
import com.demo.pojo.testReq;
import com.demo.service.TestServiceImp;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private TestServiceImp testServiceImp;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/payment")
	public PaymentResponseBody makePayment(@RequestBody PaymentRequestBody reqBody) {
		
		PaymentResponseBody resp = testServiceImp.makePayment(reqBody);
		return resp;
	}
	

	@PostMapping("/test2")
	public PaymentResponseBody getTest(@RequestBody PaymentRequestBody req) {
		
		//PaymentResponseBody resp = new PaymentResponseBody("test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test");
		PaymentResponseBody resp = new PaymentResponseBody();
		
		String url = "https://test.ccavenue.com/transaction/transaction.do?command=initiateTransaction";
		HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    HttpEntity<PaymentRequestBody> requestEntity = new HttpEntity<>(req, headers);
	    
	    // Send POST request with request body
	    ResponseEntity<PaymentResponseBody>	 response = restTemplate.postForEntity(url, requestEntity, PaymentResponseBody.class);
	    if(response.getClass().equals("PaymentResponseBody")) {
	    	return response.getBody();
	    }
	    
	    return new PaymentResponseBody();
			
	}
	
	
	
//	@PostMapping("/test2")
//	public ResponseEntity<?> getTest(@RequestBody PaymentRequestBody req) {
//	    
//	    String url = "https://test.ccavenue.com/transaction/transaction.do?command=initiateTransaction";
//	    HttpHeaders headers = new HttpHeaders();
//	    headers.setContentType(MediaType.APPLICATION_JSON);
//	    HttpEntity<PaymentRequestBody> requestEntity = new HttpEntity<>(req, headers);
//	    
//	    // Send POST request with request body
//	    ResponseEntity<String> response = restTemplate.postForEntity(url, requestEntity, String.class);
//	    
//	    // Check if response is successful
//	    if (response.getStatusCode() == HttpStatus.OK) {
//	        // Check if the response is HTML content
//	        if (response.getHeaders().getContentType().includes(MediaType.TEXT_HTML)) {
//	            // Return HTML content
//	            return ResponseEntity.ok(response.getBody());
//	        } else {
//	            try {
//	                // Parse JSON response
//	                ObjectMapper objectMapper = new ObjectMapper();
//	                PaymentResponseBody paymentResponseBody = objectMapper.readValue(response.getBody(), PaymentResponseBody.class);
//	                return ResponseEntity.ok(paymentResponseBody);
//	            } catch (JsonProcessingException e) {
//	                // Handle JSON processing exception
//	                e.printStackTrace(); // Handle the exception as required
//	                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//	            }
//	        }
//	    } else {
//	        // Handle other status codes if needed
//	        return ResponseEntity.status(response.getStatusCode()).build();
//	    }
//	}
	}
