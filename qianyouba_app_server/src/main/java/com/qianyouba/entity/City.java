package com.qianyouba.entity;

public class City {
	private int id;
	private int cityID;// 地市代码
	private String city;// 地市名称
	private Province father;// 省份代码
	public City(){}
	public City(int id, int cityID, String city, Province father) {
		super();
		this.id = id;
		this.cityID = cityID;
		this.city = city;
		this.father = father;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCityID() {
		return cityID;
	}
	public void setCityID(int cityID) {
		this.cityID = cityID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Province getFather() {
		return father;
	}
	public void setFather(Province father) {
		this.father = father;
	}
	
}
