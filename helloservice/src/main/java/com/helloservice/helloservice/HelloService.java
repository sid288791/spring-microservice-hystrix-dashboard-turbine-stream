package com.helloservice.helloservice;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
	
	@HystrixCommand(fallbackMethod = "serviceFallback")
	public String hello() {
		throw new RuntimeException("Simulating downstream system failure");
		//return "hello server i am testing";
	}
	 
	 public String serviceFallback() {
		 return "hello service has failed";
	 }

}
