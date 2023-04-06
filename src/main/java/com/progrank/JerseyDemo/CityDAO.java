package com.progrank.JerseyDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CityDAO {
	List<City> cities;
	public CityDAO() {
		cities = new ArrayList<>(); 
		City city1 = new City(101,"Banglore");
		City city2 = new City(102,"Mumbai");
		City city3 = new City(103,"Pune");
	
		cities.addAll(Arrays.asList(city1,city2,city3));
	}
	
	public List<City> getAllCity(){
		return cities;
	}
	public City getAllCityById(int cityId){
		City cc = null;
		for(City c: cities) {
			if(cityId == c.getCityId()) {
			 cc = c;
			}
		}
		return cc;
	}
	public List<City> createCity(City city){
		cities.add(city);
		return cities;
		
	}
	
	public List<City> removeCity(int id) {
		City cr = null;
		
		for(int i=0;i<cities.size();i++) {
			if(cities.get(i).getCityId() == id) {
			 cities.remove(cities.get(i));
			}
		}
		return cities;
	}
	
	public List<City> updateCity(int id,String cityName) {
		cities.stream().filter(x->x.getCityId()==id)
		.collect(Collectors.toList()).get(0).setCityName(cityName);
		return cities;
	}
}
