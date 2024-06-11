package com.Arraylist;

public class SmartPhone 
{
	
	String Brand;
	String Model;
    Double Price;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "SmartPhone [Brand=" + Brand + ", Model=" + Model + ", Price=" + Price + "]";
	}
	public SmartPhone(String brand, String model, Double price) {
		super();
		Brand = brand;
		Model = model;
		Price = price;
	}
	
 
    
    

}
