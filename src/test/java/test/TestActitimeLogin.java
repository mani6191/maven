package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMActitimeLogin;

public class TestActitimeLogin extends BaseTest
{
	@Test
	public void TestLogin() throws IOException 
	{
		 POMActitimeLogin log=new POMActitimeLogin(driver);
		 log.LoginMethod();
	}
	
}
