package com.synechron.mktx.testscripts;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.synechron.mktx.pagelibrary.Signin;
import com.synechron.mktx.testbase.TestBase;

public class TC001_testLogin extends TestBase{
	Signin signin;//Reference of signin class
	
	@BeforeClass
	public void SETUP() throws IOException{
		System.out.println("init");
		init();
	}
	
	@Test
	public void testLogin(){
		System.out.println("test");
		signin = new Signin(driver);
		signin.loginToApplication();
		
	}
	
	@AfterClass
	public void quitebrowser(){
		closeBrowser();
	}
	
	
	
}
