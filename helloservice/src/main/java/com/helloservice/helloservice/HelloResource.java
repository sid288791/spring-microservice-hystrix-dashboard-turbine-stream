package com.helloservice.helloservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest/hello/server")
public class HelloResource {
	
	@Autowired
	HelloService helloService;
	
	private static final Logger LOG = LoggerFactory.getLogger(HelloResource.class.getName());
	
	@GetMapping
	public String hello() {
		LOG.info("Inside hello service");
		return helloService.hello();
	}

}
