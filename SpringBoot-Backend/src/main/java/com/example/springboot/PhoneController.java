package com.example.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {
	
	@Autowired
	private IPhoneServices phoneService;
	
	@GetMapping(value="/phone")
	public List<Phone> getPhone(){
		List<Phone> phones=phoneService.findAll();
		return phones;
	}
	
	@RequestMapping(path="/message", produces=MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String processForm(@RequestParam(required = false) String color, @RequestParam(required = false) String memory) {
        return String.format("Price of %s iPhone with %s memory is %susd!",color, memory, phoneService.find(color, memory));
    }
}
