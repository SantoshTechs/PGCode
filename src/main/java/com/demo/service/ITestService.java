package com.demo.service;

import com.demo.pojo.PaymentRequestBody;
import com.demo.pojo.PaymentResponseBody;

public interface ITestService {
	
	PaymentResponseBody makePayment(PaymentRequestBody req); 

}
