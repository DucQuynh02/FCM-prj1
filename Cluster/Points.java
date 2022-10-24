package Cluster;

import java.util.Arrays;

public class Points {
	private double m = 2;
	private String properties[];
	//Trường 0 là Id
	//Trường cuối là Nhãn
	
	
	public Points(String[] properties) {
		super();
		this.properties = properties;
	}
	
	
	
	@Override
	public String toString() {
		return "Points [properties=" + Arrays.toString(properties) + "]";
	}



	public double getM() {
		return m;
	}
	public void setM(double m) {
		this.m = m;
	}
	public String[] getProperties() {
		return properties;
	}
	public void setProperties(String[] properties) {
		this.properties = properties;
	}
	
	
	
	
	
	
}



