package com.synechron.mktx.pagelibrary;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin {
	
	WebDriver driver; //WebDriver is a interface(we can create refrence of the interface) //firefox, chrome etc are class(we can create object of the class)
	static Logger log = Logger.getLogger(Signin.class.getName());
	//first code
	//WebElement abc = driver.findElement(By.xpath("//*[@id='days']"));
	
	By signIn = By.xpath("//a[contains(text(),'Sign in')]");
	By createAccEmailAdd = By.xpath("//input[@type='text'][@name='email_create']");
	By alreadyEmail = By.xpath("//*[@id='email']");
	By alreadyPass = By.xpath("//*[@id='passwd']");
	By submitButton = By.xpath("//*[@id='SubmitLogin']");
	
	//Constructor of the class
	public Signin (WebDriver driver){
		this.driver= driver;//when class variable and local variable are same we can use this keyword "this" will refer class variable 
		//this is not available for static members
	}
	/**
	 * this method will click on sign in link
	 */
	public void clickonSignIn(){
		log.info("Clicking on Sign In link");
		driver.findElement(signIn).click();
	}
	
	/**
	 * This will help in Entering new email address 
	 * @param emailAddress
	 */
	public void EntercreateAccEmailAdd(String emailAddress){
		log.info("Entering Email to create an account");
		driver.findElement(createAccEmailAdd).sendKeys(emailAddress);
	}
	public void EnteralreadyRegEmail(String emailAddress){
		log.info("Entering Already Reg Email");
		driver.findElement(alreadyEmail).sendKeys(emailAddress);
	}
	public void EnteralreadyRegPass(String password){
		log.info("Entering Already Reg password");
		driver.findElement(alreadyPass).sendKeys(password);
	}
	public void clickonSubmit(){
		log.info("Clicking on Submit button");
		driver.findElement(submitButton).click();
	}
}
