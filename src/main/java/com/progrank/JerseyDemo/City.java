package com.progrank.JerseyDemo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class City {
	private int cityId;
	private String cityName;
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public City() {System.out.println("calling");}
	public City(int cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}
	
	
}
