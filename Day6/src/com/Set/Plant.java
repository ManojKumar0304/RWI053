package com.Set;

public class Plant
{
	int Plantid;
	String Plantname;
	Double plantPrice;
	
	public Plant(int plantid, String plantname, Double plantPrice) {
		super();
		Plantid = plantid;
		Plantname = plantname;
		this.plantPrice = plantPrice;
	}

	@Override
	public String toString() {
		return "Plant [Plantid=" + Plantid + ", Plantname=" + Plantname + ", plantPrice=" + plantPrice + "]";
	}

	public int getPlantid() {
		return Plantid;
	}

	public void setPlantid(int plantid) {
		Plantid = plantid;
	}

	public String getPlantname() {
		return Plantname;
	}

	public void setPlantname(String plantname) {
		Plantname = plantname;
	}

	public Double getPlantPrice() {
		return plantPrice;
	}

	public void setPlantPrice(Double plantPrice) {
		this.plantPrice = plantPrice;
	}
	
	
	
	
	

}
