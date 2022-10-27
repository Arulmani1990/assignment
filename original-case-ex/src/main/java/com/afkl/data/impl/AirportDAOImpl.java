package com.afkl.data.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.afkl.data.AirportDAO;
import com.afkl.model.Location;


@Repository
public class AirportDAOImpl implements AirportDAO{
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public String getAllAirPorts() {
		String url = "http://localhost:8080/airports/";
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, createHeaders(), String.class);
		return response.getBody();
	}
	
	public HttpEntity<String> createHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + "dXNlcjpzZWNyZXQxMjM=");
		HttpEntity<String> request = new HttpEntity<String>(headers);
		return request;
	}

	@Override
	public String findAirPortByCode(String key) {
		String url = "http://localhost:8080/airports/" + key;
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, createHeaders(), String.class);		
		return response.getBody();
	}

	@Override
	public String findFare(String origin, String destination) {
		String url = "http://localhost:8080/fares/"+ origin + "/" +destination;
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, createHeaders(), String.class);
		return response.getBody();
	}
}
