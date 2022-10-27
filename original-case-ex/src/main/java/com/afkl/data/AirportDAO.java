package com.afkl.data;

import java.util.List;

import com.afkl.model.Location;

public interface AirportDAO {

	String getAllAirPorts();

	String findAirPortByCode(String key);

	String findFare(String origin, String destination);

}
