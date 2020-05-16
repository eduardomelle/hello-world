package br.com.sgp.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World OpenShift!!!";
	}

}
