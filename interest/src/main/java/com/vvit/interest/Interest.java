package com.vvit.interest;

public class Interest {
	public double SimpleIntrest(double principle_amount,double year,double rate_of_intrest)
	{
	double PI=(principle_amount*year*rate_of_intrest)/100.0;
	return PI;
	}
	public double CompoundIntrest(double principle_amount,double year,double rate_of_intrest)
	{
	double CI=principle_amount * Math.pow(1.0 + rate_of_intrest / 100.0 ,year) - principle_amount;
	return CI;
	}

}
