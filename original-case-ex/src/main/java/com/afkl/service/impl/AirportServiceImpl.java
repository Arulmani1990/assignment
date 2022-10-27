package com.afkl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afkl.data.AirportDAO;
import com.afkl.service.api.AirportService;


@Service
public class AirportServiceImpl implements AirportService{

	@Autowired
	AirportDAO airportDao;
	
	@Override
    public String findAllAirPorts() {
         return airportDao.getAllAirPorts();
    }

	@Override
	public String findAirPortByCode(String key) {
		return airportDao.findAirPortByCode(key);
	}

	@Override
	public String findFare(String origin, String destination) {
		return airportDao.findFare(origin, destination);
	}
}
