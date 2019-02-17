package com.example.foodster;

import java.util.Date;

public class Food
{
    public String name;
    public Date expirationDate;
    public int numDaysToExpiration;

    public Food(String name, Date expirationDate)
    {
    	this.name = name;
    	this.expirationDate = expirationDate;
    	this.numDaysToExpiration = getNumDaysToExpiration();
    }

    public int getNumDaysToExpiration()
    {
    	numDaysToExpiration = 0;

    	Date today = new Date();

    	numDaysToExpiration += (expirationDate.getYear()-today.getYear())*365;
    	numDaysToExpiration += (expirationDate.getMonth()-today.getMonth())*30;
    	numDaysToExpiration += (expirationDate.getDay()-today.getDay());

    	return numDaysToExpiration;
    }
}
