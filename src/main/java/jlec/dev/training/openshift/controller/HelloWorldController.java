package jlec.dev.training.openshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public String welcome() {
		return "Hello world I'm Deploying on Openshift!";
	}
}
