package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
	@Autowired
	TestRepo tp;
	@PostMapping(value = "/test")
	public ResponseEntity<?> test(@RequestBody Model model){


		tp.save(model);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
		
	}
	@GetMapping(value = "/test")
	public ResponseEntity<?> test(){

		List<Model>list=tp.findAll();
		return new ResponseEntity<>(list,HttpStatus.ACCEPTED);

	}

}
