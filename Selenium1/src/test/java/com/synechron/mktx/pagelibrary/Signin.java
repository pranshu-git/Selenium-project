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
	
	By signIn = By.xpath("//a[contains(text(),'Sign in')]");//By is a class and xpath is a method  
	By createAccEmailAdd = By.xpath("//input[@type='text'][@name='email_create']"); //By.xpath return instance of by class By
	By alreadyEmail = By.xpath("//*[@id='email']");
	By alreadyPass = By.xpath("//*[@id='passwd']");
	By submitButton = By.xpath("//*[@id='SubmitLogin']");
	By createAnAccount = By.xpath("//*[@id='SubmitCreate']");
	By signOut = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");
	
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
	public void clickOnCreateAnAccoun(){
		log.info("Clicking on create an account");
		driver.findElement(createAnAccount).click();
	}
	/**
	 * This method is used for login application
	 */
	public void loginToApplication(){
		clickonSignIn();
		//signin.EntercreateAccEmailAdd("123@sd.com");//pranks@gmail.co  //12345
		EnteralreadyRegEmail("pranks@gmail.co");
		EnteralreadyRegPass("12345");
		clickonSubmit();
	}
	public void enterDataToCreateAnAccount(String emailAddress){
		clickonSignIn();
		EntercreateAccEmailAdd(emailAddress);
		clickOnCreateAnAccoun();
	}
}
