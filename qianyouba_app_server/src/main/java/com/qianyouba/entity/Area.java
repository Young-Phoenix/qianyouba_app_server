package com.qianyouba.entity;

public class Area {
	private int id;
	private int areaID;// 县区代码
	private String area;// 县区名称
	private City father;// 地址代码

	public Area() {
	}

	public Area(int id, int areaID, String area, City father) {
		super();
		this.id = id;
		this.areaID = areaID;
		this.area = area;
		this.father = father;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAreaID() {
		return areaID;
	}

	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public City getFather() {
		return father;
	}

	public void setFather(City father) {
		this.father = father;
	}

}
