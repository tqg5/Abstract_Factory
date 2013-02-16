package com.factory.factory;

import com.factory.ConcreteFactories.ReactiveResin;
import com.factory.ConcreteFactories.Urethane;
import com.factory.Products.Ball;

/*
 * Factory
 */
public class Company {

	public Ball createBall(String ball)
	{
		if(ball.equals("Reactive"))
			return new ReactiveResin();
		else if(ball.equals("Urethane"))
			return new Urethane();
		else
			return null;
	}
}
