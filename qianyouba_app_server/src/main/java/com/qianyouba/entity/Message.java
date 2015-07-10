package com.qianyouba.entity;

public class Message<T> {
	private int resultCode;// 返回码
	private T data;// 数据

	public Message() {
	}

	public Message(int resultCode, T data) {
		super();
		this.resultCode = resultCode;
		this.data = data;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
