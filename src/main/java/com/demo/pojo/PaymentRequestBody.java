package com.demo.pojo;

public class PaymentRequestBody {

	private String merchant_id;
	private String order_id;
	private String currency;
	private String amount;
	private String redirect_url;
	private String cancel_url;
	private String language;

	public String getMerchant_id() {
		return merchant_id;
	}

	public void setMerchant_id(String merchant_id) {
		this.merchant_id = merchant_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getRedirect_url() {
		return redirect_url;
	}

	public void setRedirect_url(String redirect_url) {
		this.redirect_url = redirect_url;
	}

	public String getCancel_url() {
		return cancel_url;
	}

	public void setCancel_url(String cancel_url) {
		this.cancel_url = cancel_url;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public PaymentRequestBody(String merchant_id, String order_id, String currency, String amount, String redirect_url,
			String cancel_url, String language) {
		super();
		this.merchant_id = merchant_id;
		this.order_id = order_id;
		this.currency = currency;
		this.amount = amount;
		this.redirect_url = redirect_url;
		this.cancel_url = cancel_url;
		this.language = language;
	}

	public PaymentRequestBody() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String billing_name;
	private String billing_address;
	private String billing_city;
	private String billing_state;
	private String billing_zip;
	private String billing_country;
	private String billing_tel;
	private String billing_notes;
	private String billing_email;
//	
//	
	private String delivery_name;
	private String delivery_address;
	private String delivery_city;
	private String delivery_state;
	private String delivery_zip;
	private String delivery_country;
	private String delivery_tel;
	private String delivery_notes;
	private String delivery_email;
//	
//	
//	private String card_name;
//	private String card_type;
//	private String payment_option;
//	private String card_number;
//	private String expiry_month;
//	private String expiry_year;
//	private String cvv_number;
//	private String issuing_bank;
//	
//	
//	private String integration_type;
//	
	private String merchant_param1;
	private String merchant_param2;
	private String merchant_param3;
	private String merchant_param4;
	private String merchant_param5;
	
	private String promo_code;
	private String tid;

	public String getBilling_name() {
		return billing_name;
	}

	public void setBilling_name(String billing_name) {
		this.billing_name = billing_name;
	}

	public String getBilling_address() {
		return billing_address;
	}

	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}

	public String getBilling_city() {
		return billing_city;
	}

	public void setBilling_city(String billing_city) {
		this.billing_city = billing_city;
	}

	public String getBilling_state() {
		return billing_state;
	}

	public void setBilling_state(String billing_state) {
		this.billing_state = billing_state;
	}

	public String getBilling_zip() {
		return billing_zip;
	}

	public void setBilling_zip(String billing_zip) {
		this.billing_zip = billing_zip;
	}

	public String getBilling_country() {
		return billing_country;
	}

	public void setBilling_country(String billing_country) {
		this.billing_country = billing_country;
	}

	public String getBilling_tel() {
		return billing_tel;
	}

	public void setBilling_tel(String billing_tel) {
		this.billing_tel = billing_tel;
	}

	public String getBilling_notes() {
		return billing_notes;
	}

	public void setBilling_notes(String billing_notes) {
		this.billing_notes = billing_notes;
	}

	public String getBilling_email() {
		return billing_email;
	}

	public void setBilling_email(String billing_email) {
		this.billing_email = billing_email;
	}

	public String getDelivery_name() {
		return delivery_name;
	}

	public void setDelivery_name(String delivery_name) {
		this.delivery_name = delivery_name;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public String getDelivery_city() {
		return delivery_city;
	}

	public void setDelivery_city(String delivery_city) {
		this.delivery_city = delivery_city;
	}

	public String getDelivery_state() {
		return delivery_state;
	}

	public void setDelivery_state(String delivery_state) {
		this.delivery_state = delivery_state;
	}

	public String getDelivery_zip() {
		return delivery_zip;
	}

	public void setDelivery_zip(String delivery_zip) {
		this.delivery_zip = delivery_zip;
	}

	public String getDelivery_country() {
		return delivery_country;
	}

	public void setDelivery_country(String delivery_country) {
		this.delivery_country = delivery_country;
	}

	public String getDelivery_tel() {
		return delivery_tel;
	}

	public void setDelivery_tel(String delivery_tel) {
		this.delivery_tel = delivery_tel;
	}

	public String getDelivery_notes() {
		return delivery_notes;
	}

	public void setDelivery_notes(String delivery_notes) {
		this.delivery_notes = delivery_notes;
	}

	public String getDelivery_email() {
		return delivery_email;
	}

	public void setDelivery_email(String delivery_email) {
		this.delivery_email = delivery_email;
	}

	public String getMerchant_param1() {
		return merchant_param1;
	}

	public void setMerchant_param1(String merchant_param1) {
		this.merchant_param1 = merchant_param1;
	}

	public String getMerchant_param2() {
		return merchant_param2;
	}

	public void setMerchant_param2(String merchant_param2) {
		this.merchant_param2 = merchant_param2;
	}

	public String getMerchant_param3() {
		return merchant_param3;
	}

	public void setMerchant_param3(String merchant_param3) {
		this.merchant_param3 = merchant_param3;
	}

	public String getMerchant_param4() {
		return merchant_param4;
	}

	public void setMerchant_param4(String merchant_param4) {
		this.merchant_param4 = merchant_param4;
	}

	public String getMerchant_param5() {
		return merchant_param5;
	}

	public void setMerchant_param5(String merchant_param5) {
		this.merchant_param5 = merchant_param5;
	}

	public String getPromo_code() {
		return promo_code;
	}

	public void setPromo_code(String promo_code) {
		this.promo_code = promo_code;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public PaymentRequestBody(String merchant_id, String order_id, String currency, String amount, String redirect_url,
			String cancel_url, String language, String billing_name, String billing_address, String billing_city,
			String billing_state, String billing_zip, String billing_country, String billing_tel, String billing_notes,
			String billing_email, String delivery_name, String delivery_address, String delivery_city,
			String delivery_state, String delivery_zip, String delivery_country, String delivery_tel,
			String delivery_notes, String delivery_email, String merchant_param1, String merchant_param2,
			String merchant_param3, String merchant_param4, String merchant_param5, String promo_code, String tid) {
		super();
		this.merchant_id = merchant_id;
		this.order_id = order_id;
		this.currency = currency;
		this.amount = amount;
		this.redirect_url = redirect_url;
		this.cancel_url = cancel_url;
		this.language = language;
		this.billing_name = billing_name;
		this.billing_address = billing_address;
		this.billing_city = billing_city;
		this.billing_state = billing_state;
		this.billing_zip = billing_zip;
		this.billing_country = billing_country;
		this.billing_tel = billing_tel;
		this.billing_notes = billing_notes;
		this.billing_email = billing_email;
		this.delivery_name = delivery_name;
		this.delivery_address = delivery_address;
		this.delivery_city = delivery_city;
		this.delivery_state = delivery_state;
		this.delivery_zip = delivery_zip;
		this.delivery_country = delivery_country;
		this.delivery_tel = delivery_tel;
		this.delivery_notes = delivery_notes;
		this.delivery_email = delivery_email;
		this.merchant_param1 = merchant_param1;
		this.merchant_param2 = merchant_param2;
		this.merchant_param3 = merchant_param3;
		this.merchant_param4 = merchant_param4;
		this.merchant_param5 = merchant_param5;
		this.promo_code = promo_code;
		this.tid = tid;
	}
	
	

}
