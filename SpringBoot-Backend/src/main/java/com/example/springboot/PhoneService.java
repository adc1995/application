package com.example.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PhoneService implements IPhoneServices{

	private static ArrayList<Phone> phones = new ArrayList<Phone>();
	static {
		phones.add(new Phone(1, "iPhone11","red", "64GB", 1200, 34));
		phones.add(new Phone(2, "iPhone11","black", "64GB", 1210, 30));
		phones.add(new Phone(3, "iPhone11","red", "124GB", 1300, 23));
		phones.add(new Phone(4, "iPhone11","black", "124GB", 1330, 20));
	}
	
	@Override
	public List<Phone> findAll() {
		// TODO Auto-generated method stub
		return phones;
	}

	@Override
	public String find(String color, String memory) {
		// TODO Auto-generated method stub
		for(Phone p: phones) {
			if(p.getColor().equals(color)) {
				if(p.getMemory().equals(memory)) {
					return String.valueOf(p.getPrice());
				}
			}
		}
		return "NA";
	}
	
}
