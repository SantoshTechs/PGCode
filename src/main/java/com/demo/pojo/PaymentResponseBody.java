package com.demo.pojo;

public class PaymentResponseBody {

	public PaymentResponseBody() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String order_id;
	private String tracking_id;
	private String bank_ref_no;
	private String order_status;
	private String failure_message;
	private String payment_mode;
	private String card_name;
	private String status_code;
	private String status_message;
	private String currency;
	private String amount;

	private String billing_name;
	private String billing_address;
	private String billing_city;
	private String billing_state;
	private String billing_zip;
	private String billing_country;
	private String billing_tel;
	private String billing_notes;
	private String billing_email;

	private String delivery_name;
	private String delivery_address;
	private String delivery_city;
	private String delivery_state;
	private String delivery_zip;
	private String delivery_country;
	private String delivery_tel;

	private String merchant_param1;
	private String merchant_param2;
	private String merchant_param3;
	private String merchant_param4;
	private String merchant_param5;

	private String vault;
	private String offer_type;
	private String offer_code;
	private String discount_value;
	
	
	private int si_status;
	private String si_sub_ref_no;
	private String si_mer_ref_no;
	private String si_erroe_desc;
	private char si_created;
	private String si_ref_no;
	private char retry;
	private int response_code;
	private String bene_account;
	private String bene_name;
	private String bene_ifsc;
	private String bene_bank;
	private String inv_mer_reference_no;
	private String trans_date;
	private String mer_amount;
	private String sub_account_id;
	private int eci_value;
	private String billing_note;
	private String bin_country;
	private String customer_card_id;
	private String bin_supported;
	private String trans_fee;
	private String service_tax;

	
	public PaymentResponseBody(String order_id, String tracking_id, String bank_ref_no, String order_status,
			String failure_message, String payment_mode, String card_name, String status_code, String status_message,
			String currency, String amount, String billing_name, String billing_address, String billing_city,
			String billing_state, String billing_zip, String billing_country, String billing_tel, String billing_notes,
			String billing_email, String delivery_name, String delivery_address, String delivery_city,
			String delivery_state, String delivery_zip, String delivery_country, String delivery_tel,
			String merchant_param1, String merchant_param2, String merchant_param3, String merchant_param4,
			String merchant_param5, String vault, String offer_type, String offer_code, String discount_value,
			int si_status, String si_sub_ref_no, String si_mer_ref_no, String si_erroe_desc, char si_created,
			String si_ref_no, char retry, int response_code, String bene_account, String bene_name, String bene_ifsc,
			String bene_bank, String inv_mer_reference_no, String trans_date, String mer_amount, String sub_account_id,
			int eci_value, String billing_note, String bin_country, String customer_card_id, String bin_supported,
			String trans_fee, String service_tax) {
		super();
		this.order_id = order_id;
		this.tracking_id = tracking_id;
		this.bank_ref_no = bank_ref_no;
		this.order_status = order_status;
		this.failure_message = failure_message;
		this.payment_mode = payment_mode;
		this.card_name = card_name;
		this.status_code = status_code;
		this.status_message = status_message;
		this.currency = currency;
		this.amount = amount;
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
		this.merchant_param1 = merchant_param1;
		this.merchant_param2 = merchant_param2;
		this.merchant_param3 = merchant_param3;
		this.merchant_param4 = merchant_param4;
		this.merchant_param5 = merchant_param5;
		this.vault = vault;
		this.offer_type = offer_type;
		this.offer_code = offer_code;
		this.discount_value = discount_value;
		this.si_status = si_status;
		this.si_sub_ref_no = si_sub_ref_no;
		this.si_mer_ref_no = si_mer_ref_no;
		this.si_erroe_desc = si_erroe_desc;
		this.si_created = si_created;
		this.si_ref_no = si_ref_no;
		this.retry = retry;
		this.response_code = response_code;
		this.bene_account = bene_account;
		this.bene_name = bene_name;
		this.bene_ifsc = bene_ifsc;
		this.bene_bank = bene_bank;
		this.inv_mer_reference_no = inv_mer_reference_no;
		this.trans_date = trans_date;
		this.mer_amount = mer_amount;
		this.sub_account_id = sub_account_id;
		this.eci_value = eci_value;
		this.billing_note = billing_note;
		this.bin_country = bin_country;
		this.customer_card_id = customer_card_id;
		this.bin_supported = bin_supported;
		this.trans_fee = trans_fee;
		this.service_tax = service_tax;
	}

	public int getSi_status() {
		return si_status;
	}

	public void setSi_status(int si_status) {
		this.si_status = si_status;
	}

	public String getSi_sub_ref_no() {
		return si_sub_ref_no;
	}

	public void setSi_sub_ref_no(String si_sub_ref_no) {
		this.si_sub_ref_no = si_sub_ref_no;
	}

	public String getSi_mer_ref_no() {
		return si_mer_ref_no;
	}

	public void setSi_mer_ref_no(String si_mer_ref_no) {
		this.si_mer_ref_no = si_mer_ref_no;
	}

	public String getSi_erroe_desc() {
		return si_erroe_desc;
	}

	public void setSi_erroe_desc(String si_erroe_desc) {
		this.si_erroe_desc = si_erroe_desc;
	}

	public char getSi_created() {
		return si_created;
	}

	public void setSi_created(char si_created) {
		this.si_created = si_created;
	}

	public String getSi_ref_no() {
		return si_ref_no;
	}

	public void setSi_ref_no(String si_ref_no) {
		this.si_ref_no = si_ref_no;
	}

	public char getRetry() {
		return retry;
	}

	public void setRetry(char retry) {
		this.retry = retry;
	}

	public int getResponse_code() {
		return response_code;
	}

	public void setResponse_code(int response_code) {
		this.response_code = response_code;
	}

	public String getBene_account() {
		return bene_account;
	}

	public void setBene_account(String bene_account) {
		this.bene_account = bene_account;
	}

	public String getBene_name() {
		return bene_name;
	}

	public void setBene_name(String bene_name) {
		this.bene_name = bene_name;
	}

	public String getBene_ifsc() {
		return bene_ifsc;
	}

	public void setBene_ifsc(String bene_ifsc) {
		this.bene_ifsc = bene_ifsc;
	}

	public String getBene_bank() {
		return bene_bank;
	}

	public void setBene_bank(String bene_bank) {
		this.bene_bank = bene_bank;
	}

	public String getInv_mer_reference_no() {
		return inv_mer_reference_no;
	}

	public void setInv_mer_reference_no(String inv_mer_reference_no) {
		this.inv_mer_reference_no = inv_mer_reference_no;
	}

	public String getTrans_date() {
		return trans_date;
	}

	public void setTrans_date(String trans_date) {
		this.trans_date = trans_date;
	}

	public String getMer_amount() {
		return mer_amount;
	}

	public void setMer_amount(String mer_amount) {
		this.mer_amount = mer_amount;
	}

	public String getSub_account_id() {
		return sub_account_id;
	}

	public void setSub_account_id(String sub_account_id) {
		this.sub_account_id = sub_account_id;
	}

	public int getEci_value() {
		return eci_value;
	}

	public void setEci_value(int eci_value) {
		this.eci_value = eci_value;
	}

	public String getBilling_note() {
		return billing_note;
	}

	public void setBilling_note(String billing_note) {
		this.billing_note = billing_note;
	}

	public String getBin_country() {
		return bin_country;
	}

	public void setBin_country(String bin_country) {
		this.bin_country = bin_country;
	}

	public String getCustomer_card_id() {
		return customer_card_id;
	}

	public void setCustomer_card_id(String customer_card_id) {
		this.customer_card_id = customer_card_id;
	}

	public String getBin_supported() {
		return bin_supported;
	}

	public void setBin_supported(String bin_supported) {
		this.bin_supported = bin_supported;
	}

	public String getTrans_fee() {
		return trans_fee;
	}

	public void setTrans_fee(String trans_fee) {
		this.trans_fee = trans_fee;
	}

	public String getService_tax() {
		return service_tax;
	}

	public void setService_tax(String service_tax) {
		this.service_tax = service_tax;
	}

	public PaymentResponseBody(String order_id, String tracking_id, String bank_ref_no, String order_status,
			String failure_message, String payment_mode, String card_name, String status_code, String status_message,
			String currency, String amount, String billing_name, String billing_address, String billing_city,
			String billing_state, String billing_zip, String billing_country, String billing_tel, String billing_notes,
			String billing_email, String delivery_name, String delivery_address, String delivery_city,
			String delivery_state, String delivery_zip, String delivery_country, String delivery_tel,
			String merchant_param1, String merchant_param2, String merchant_param3, String merchant_param4,
			String merchant_param5, String vault, String offer_type, String offer_code, String discount_value) {
		super();
		this.order_id = order_id;
		this.tracking_id = tracking_id;
		this.bank_ref_no = bank_ref_no;
		this.order_status = order_status;
		this.failure_message = failure_message;
		this.payment_mode = payment_mode;
		this.card_name = card_name;
		this.status_code = status_code;
		this.status_message = status_message;
		this.currency = currency;
		this.amount = amount;
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
		this.merchant_param1 = merchant_param1;
		this.merchant_param2 = merchant_param2;
		this.merchant_param3 = merchant_param3;
		this.merchant_param4 = merchant_param4;
		this.merchant_param5 = merchant_param5;
		this.vault = vault;
		this.offer_type = offer_type;
		this.offer_code = offer_code;
		this.discount_value = discount_value;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getTracking_id() {
		return tracking_id;
	}

	public void setTracking_id(String tracking_id) {
		this.tracking_id = tracking_id;
	}

	public String getBank_ref_no() {
		return bank_ref_no;
	}

	public void setBank_ref_no(String bank_ref_no) {
		this.bank_ref_no = bank_ref_no;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getFailure_message() {
		return failure_message;
	}

	public void setFailure_message(String failure_message) {
		this.failure_message = failure_message;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public String getCard_name() {
		return card_name;
	}

	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}

	public String getStatus_code() {
		return status_code;
	}

	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}

	public String getStatus_message() {
		return status_message;
	}

	public void setStatus_message(String status_message) {
		this.status_message = status_message;
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

	public String getVault() {
		return vault;
	}

	public void setVault(String vault) {
		this.vault = vault;
	}

	public String getOffer_type() {
		return offer_type;
	}

	public void setOffer_type(String offer_type) {
		this.offer_type = offer_type;
	}

	public String getOffer_code() {
		return offer_code;
	}

	public void setOffer_code(String offer_code) {
		this.offer_code = offer_code;
	}

	public String getDiscount_value() {
		return discount_value;
	}

	public void setDiscount_value(String discount_value) {
		this.discount_value = discount_value;
	}

}
