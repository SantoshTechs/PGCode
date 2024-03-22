package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.pojo.PaymentRequestBody;
import com.demo.pojo.PaymentResponseBody;

@Service
public class TestServiceImp implements ITestService {

	@Autowired
	private RestTemplate restTemplate;


	@Override
	public PaymentResponseBody makePayment(PaymentRequestBody req) {
		String url = "https://test.ccavenue.com";
		HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    HttpEntity<PaymentRequestBody> requestEntity = new HttpEntity<>(req, headers);
	    
	    // Send POST request with request body
	    ResponseEntity<PaymentResponseBody> response = restTemplate.postForEntity(url, requestEntity, PaymentResponseBody.class);
		return response.getBody();
	}	

}
