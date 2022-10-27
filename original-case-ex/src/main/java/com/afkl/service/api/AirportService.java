package com.afkl.service.api;


public interface AirportService {

	String findAllAirPorts();

	String findAirPortByCode(String key);

	String findFare(String origin, String destination);

	    
}
