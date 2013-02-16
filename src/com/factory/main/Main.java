package com.factory.main;

import com.factory.Products.Ball;
import com.factory.factory.Company;

public class Main {

	public static void main(String[] args) {
		
		//Instantiate instance of factory
		Company company = new Company();
		
		//get abstract product instances
		Ball firstBall = company.createBall("ReactiveResin");
		
		Ball secondBall = company.createBall("Urethane");
		
		System.out.println(firstBall);
		System.out.println(secondBall);

	}

}
