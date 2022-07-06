package com.ankush.springcore.lifecycle;
// TODO Auto-generated method stub


// TODO Auto-generated method stub




public class Samosa {
	double price;

	@Override
	public String toString() {
		return "samosa [price=" + price + "]";
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}
	
	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	void init()
	{
		System.out.println("inside init method");
	}
	
	void destroy()
	{
		System.out.println("inside destory method");
	}
	
}
