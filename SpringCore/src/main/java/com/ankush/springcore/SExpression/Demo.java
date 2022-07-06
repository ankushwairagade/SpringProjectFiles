package com.ankush.springcore.SExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{21+11}")
	private int x;
	@Value("#{32-2}")
	private int y;

	@Value("#{T(java.lang.Math).sqrt(100)}")
	private int z;
	@Value("#{T(java.lang.Math).PI}")
	private double PI;
	
	@Value("#{new java.lang.String('Ankush Wairagade')}")
	private String name;
	
	@Value("#{9>3}")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	
	


	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	
	
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", PI=" + PI + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
