package com.huntington.cdo.techyouth;

public class ApplicationRunner
{

	public static void main(String[] args) 
	{
		Intro app = new IntroImpl();
		System.out.println(app.hello());
	}

}
