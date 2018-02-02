package com.dto;

public class TestResult<T> {

	int code;
	String msg;
	public T data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "TestResult [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
}
