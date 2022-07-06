package com.ankush.springcore.lifecycle;



public class Jalebi {
	private double price;

	@Override
	public String toString() {
		return "Jalebi [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Jalebi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jalebi(double price) {
		super();
		this.price = price;
	}
	

	
}
