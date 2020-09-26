package com.example.springboot;

import java.util.List;

public interface IPhoneServices {

	List<Phone> findAll();

	String find(String color, String memory);

}
