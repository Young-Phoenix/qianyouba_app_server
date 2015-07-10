package com.qianyouba.entity;

public class Province {
	private int id;
	private int provinceID;// 省份代码
	private String province;// 省份名称
	private String type;// 省份类别

	public Province() {
	}

	public Province(int id, int provinceID, String province, String type) {
		super();
		this.id = id;
		this.provinceID = provinceID;
		this.province = province;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
