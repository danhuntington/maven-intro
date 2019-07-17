package com.huntington.cdo.techyouth;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class IntroTest 
{
	private Intro app;

	@Before
	public void initialize()
	{
		app = new IntroImpl();
	}
	
	@Test
	public void test() throws Exception 
	{
		Assert.assertEquals("Hello World", app.hello());
	}
}
