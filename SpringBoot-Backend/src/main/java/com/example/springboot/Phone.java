package com.example.springboot;

public class Phone {
	
	private int id;
	private String pname;
	private String color;
	private String memory;
	private int price;
	private int noofphones;
	
	public Phone(int id, String pname, String color, String memory, int price, int noofphones) {
		super();
		this.id = id;
		this.pname = pname;
		this.color = color;
		this.memory = memory;
		this.price = price;
		this.noofphones = noofphones;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNoofphones() {
		return noofphones;
	}

	public void setNoofphones(int noofphones) {
		this.noofphones = noofphones;
	}
	
}
