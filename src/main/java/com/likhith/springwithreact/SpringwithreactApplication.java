package com.likhith.springwithreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringwithreactApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwithreactApplication.class, args);
	}

	@RestController
	@CrossOrigin("*")
	class TestControllerForAPI {
		@GetMapping("/api/test")
		public ObjectNode getMethodName() {
			return JsonNodeFactory.instance.objectNode().put("data", "test data from spring backend to react frontend");
		}
	}

}
