package com.cognizant.spring_learn.service;

import java.util.List;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;

@Service
public class CountryService {

	public Country getCountry(String code) {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		@SuppressWarnings("unchecked")
		List<Country> countryList = (List<Country>) context.getBean("countryList");

		return countryList.stream()
			.filter(country -> country.getCode().equalsIgnoreCase(code))
			.findFirst()
			.orElse(null);
	}
}
