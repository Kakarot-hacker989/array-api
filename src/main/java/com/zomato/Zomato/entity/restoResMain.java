package com.zomato.Zomato.entity;

import java.util.Arrays;

public class restoResMain {
	resta[] data;
	String message;
	boolean result;
	
	public restoResMain() {
		super();
	}

	public restoResMain(resta[] data, String message, boolean result) {
		super();
		this.data = data;
		this.message = message;
		this.result = result;
	}

	public resta[] getData() {
		return data;
	}

	public void setData(resta[] data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "restoResMain [data=" + Arrays.toString(data) + ", message=" + message + ", result=" + result + "]";
	}

	
	

	
}
