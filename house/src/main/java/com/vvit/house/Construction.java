package com.vvit.house;

public class Construction {
	public int constructionPrice(String material,int area,String standard)
	{
	if(standard.equals("Automated") && material.equals("high standard"))
	{

	return area*2500;
	}
	else if(material.equals("high standard"))
	{
	return area*1800;
	}
	else if(material.equals("above standard"))
	{
	return area*1500;
	}
	else if(material.equals("standard"))
	{
	return area*1200;
	}
	else
	{
	return 0;
	}
	}

	}



