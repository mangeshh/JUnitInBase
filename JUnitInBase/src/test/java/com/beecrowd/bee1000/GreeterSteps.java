/*
 * Copyright (C) 2021, Gherkin By Example and/or its contributors. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * 
 * This software is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this code.  If not, see <https://www.gnu.org/licenses/>.
 *	
 * Please visit Gherkin By Example at https://github.com/gherkin-by-example 
 * if you need additional information or have any questions.
 */
package com.beecrowd.bee1000;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class GreeterSteps {

	private final Greeter g = new Greeter();
	private String actual;

	@When("greeting is done")
	public void greeting_is_done() {
		actual = g.sayHello();
	}

	@Then("greeting should be {string}")
	public void greeting_should_be(String expected) {
		assertEquals(expected, actual);
	}
}


/**
const axios = require('axios');

		const options = {
		method: 'GET',
		url: 'https://indeed-indeed.p.rapidapi.com/apisearch',
		params: {
		publisher: '<REQUIRED>',
		v: '2',
		format: 'json',
		callback: '<REQUIRED>',
		q: 'java',
		l: 'austin, tx',
		sort: '<REQUIRED>',
		radius: '25',
		st: '<REQUIRED>',
		jt: '<REQUIRED>',
		start: '<REQUIRED>',
		limit: '<REQUIRED>',
		fromage: '<REQUIRED>',
		highlight: '<REQUIRED>',
		filter: '<REQUIRED>',
		latlong: '<REQUIRED>',
		co: '<REQUIRED>',
		chnl: '<REQUIRED>',
		userip: '<REQUIRED>',
		useragent: '<REQUIRED>'
		},
		headers: {
		'X-RapidAPI-Key': '431d7796camsh5cff45ce81afc5cp149aa9jsnc5ca706f85ef',
		'X-RapidAPI-Host': 'indeed-indeed.p.rapidapi.com'
		}
		};

		try {
		const response = await axios.request(options);
		console.log(response.data);
		} catch (error) {
		console.error(error);
		} */
