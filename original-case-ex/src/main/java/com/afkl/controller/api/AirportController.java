package com.afkl.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.afkl.exception.AiportException;
import com.afkl.exception.ResourceNotFoundException;
import com.afkl.service.api.AirportService;

import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/airports")
public class AirportController {

	@Autowired
	private AirportService airportService;
	
    @Autowired
	RestTemplate restTemplate;
    
    
  
    @GetMapping(value = "/list")
    public String findAllAirPorts(){
        return airportService.findAllAirPorts();

    }
    
    
	@GetMapping(value = "/code/{key}")
	public ResponseEntity<String>  getAirportByCode(@PathVariable("key") final String key){		
    	 String str = airportService.findAirPortByCode(key);    	
    	 if(str == null) {
    		  throw new ResourceNotFoundException("Origin not forund");
    	 }
    	 return ResponseEntity.ok(str);
		
	}
    
    
	@GetMapping(value = "/fares/{origin}/{destination}")
	public String findFareDetauils(@PathVariable("origin") final String origin, @PathVariable("destination") final String destination) throws AiportException{		
		return airportService.findFare(origin,destination);	
		
	}
}
