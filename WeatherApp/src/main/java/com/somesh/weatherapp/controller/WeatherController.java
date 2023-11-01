package com.somesh.weatherapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {
	private static final Logger LOG = LoggerFactory.getLogger(WeatherController.class);

	private RestTemplate restTemplate = new RestTemplate();

	@Value("${api.key}")
	private String apiKey;

	@Value("${api.url}")
	private String apiUrl;

	//Get weather info based on lat and lon
	@GetMapping("/latlog")
	public ResponseEntity<Object> getWeatherLatLog(@RequestParam String lat , @RequestParam String lon){
		LOG.info("WeatherController : getWeatherLatLog() Start");
		String url = apiUrl+"lat="+lat+"&lon="+lon+"&appid="+apiKey;
		ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
		LOG.info("WeatherController : getWeatherLatLog() End");
		return response;
	}

	//Get weather info based on city
	@GetMapping("/cityCode")
	public ResponseEntity<Object> getWeatherCity(@RequestParam String city){
		LOG.info("WeatherController : getWeatherCity() Start");
		String url = apiUrl+"q="+city+"&appid="+apiKey;
		ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
		LOG.info("WeatherController : getWeatherCity() End");
		return response;
	}

	//Get weather info based on city id
	@GetMapping("/cityid")
	public ResponseEntity<Object> getWeatherCityId(@RequestParam String cityid){
		LOG.info("WeatherController : getWeatherCity() Start");
		String url = apiUrl+"id="+cityid+"&appid="+apiKey;
		ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
		LOG.info("WeatherController : getWeatherCity() End");
		return response;
	}

	//Get weather info based on city,state	
	@GetMapping("/cityStateCode")
	public ResponseEntity<Object> getWeatherCityState(@RequestParam String city,@RequestParam String state){
		LOG.info("WeatherController : getWeatherCityState() Start");
		String url = apiUrl+"q="+city+","+state+"&appid="+apiKey;
		ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
		LOG.info("WeatherController : getWeatherCityState() End");
		return response;
	}

	//Get weather info based on city,state,countrycode	
	@GetMapping("/cityStateCountryCode")
	public ResponseEntity<Object> getWeatherCityStateCountry(@RequestParam String city,@RequestParam String state,@RequestParam String countrycode){
		LOG.info("WeatherController : getWeatherCityStateCountry() Start");
		String url = apiUrl+"q="+city+","+state+","+countrycode+"&appid="+apiKey;
		ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
		LOG.info("WeatherController : getWeatherCityStateCountry() End");
		return response;
	}

	//Get weather info based on zip,countrycode	
	@GetMapping("/getWeatherZipCountry")
	public ResponseEntity<Object> getWeatherZipCountry(@RequestParam String zip,@RequestParam String countrycode){
		LOG.info("WeatherController : getWeatherCityStateCountry() Start");
		String url = apiUrl+"zip="+zip+","+countrycode+"&appid="+apiKey;
		ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
		LOG.info("WeatherController : getWeatherCityStateCountry() End");
		return response;
	}
}
