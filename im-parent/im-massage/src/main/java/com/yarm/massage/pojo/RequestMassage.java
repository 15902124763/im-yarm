package com.yarm.massage.pojo;

import java.util.List;

public class RequestMassage {

	private List<String> receiverList;
	
	private String massage;

	public List<String> getReceiverList() {
		return receiverList;
	}

	public void setReceiverList(List<String> receiverList) {
		this.receiverList = receiverList;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}
}
