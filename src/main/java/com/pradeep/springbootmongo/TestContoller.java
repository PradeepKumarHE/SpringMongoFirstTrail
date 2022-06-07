package com.pradeep.springbootmongo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pradeep.springbootmongo.domain.ShopstandardInputJSON;

@RestController
@RequestMapping("/api/test")
public class TestContoller {

	@PostMapping
	public String test(@RequestBody ShopstandardInputJSON shop) throws JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		String s=mapper.writeValueAsString(shop);
		System.out.println(">>>>>> "+s);
		
		return "Added book with id : ";
	}
}
