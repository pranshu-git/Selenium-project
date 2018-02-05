package com.synechron.mktx.testscripts;

import java.io.IOException;

import org.junit.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.synechron.mktx.pagelibrary.Signin;
import com.synechron.mktx.testbase.TestBase;

public class TC001_testLogin extends TestBase{
	Signin signin;//Reference of signin class
	
	@BeforeClass
	public void SETUP() throws IOException{
		init();
	}
	
	@Test
	public void testLogin(){
		signin = new Signin(driver);
		signin.clickonSignIn();
	}
	
	@AfterTest
	public void quitebrowser(){
		
	}
	
	
	
}
