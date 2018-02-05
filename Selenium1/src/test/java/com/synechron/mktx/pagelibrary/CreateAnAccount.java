package com.synechron.mktx.pagelibrary;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAnAccount {
	
	WebDriver driver;
	static Logger log = Logger.getLogger(Signin.class.getName());
	
	public By createAnAccountErrorMsg = By.xpath("//*[@id='create_account_error']/ol/li");
	WebElement mrRadionButton =  driver.findElement(By.xpath("//*[@id='id_gender1']")) ;
	WebElement mrsRadioButton =  driver.findElement(By.xpath("//*[@id='id_gender2']")) ;
	WebElement craeteAnAccoutn =  driver.findElement(By.xpath("//*[@id='noSlide']/h1"));
	WebElement yourPersonalInfo =  driver.findElement(By.xpath("//*[@id='account-creation_form']/div[1]/h3"));
	WebElement firstName =  driver.findElement(By.xpath("//*[@id='customer_firstname']"));
	WebElement lastname =  driver.findElement(By.xpath("//*[@id='customer_lastname']"));
	WebElement emailAddress =  driver.findElement(By.xpath("//*[@id='email']"));
	WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
	WebElement days =  driver.findElement(By.xpath("//*[@id='days']"));
	WebElement months =  driver.findElement(By.xpath("//*[@id='months']"));
	WebElement year = driver.findElement(By.xpath("//*[@id='years']"));
	WebElement signUpForOurNewsletter =  driver.findElement(By.xpath("//*[@id='newsletter']"));
	WebElement receiveSpecialOffer =  driver.findElement(By.xpath("//*[@id='optin']"));
	WebElement yourAddress =  driver.findElement(By.xpath("//*[@id='account-creation_form']/div[2]/h3"));
	
	WebElement yourAddressFirstName =  driver.findElement(By.id("firstname"));
	WebElement yourAddressLasstName =  driver.findElement(By.id("lastname"));
	WebElement yourAddressCompany =  driver.findElement(By.id("firstname"));
	WebElement yourAddressPrimary =  driver.findElement(By.id("address1"));
	WebElement yourAddressSecondry =  driver.findElement(By.id("address2"));
	WebElement yourAddressCity =  driver.findElement(By.id("city"));
	WebElement yourAddressPostalCode =  driver.findElement(By.id("postcode"));
	WebElement yourAddressStateDropDown = driver.findElement(By.xpath("//*[@id='id_state']"));
	WebElement yourAddressCountryName = driver.findElement(By.xpath("//*[@id='id_country']"));
	WebElement yourAddressPhoneNumber = driver.findElement(By.xpath("//*[@id='phone_mobile']"));
	WebElement yourAddressAlias = driver.findElement(By.xpath("//*[@id='alias']"));

	public void selectMrRadioButton(){
		log.info("Selecting Mr radio button");
		mrRadionButton.click();
		
	}
	
	public boolean VerifyCreateAnAccountLabel(){
		log.info("verifying Create An account label display on UI");
		try{
			craeteAnAccoutn.isDisplayed();
			return true;
		}
		catch(Exception e){
			return false;
		}
		
	}
	public void firstName(String firstName){
		log.info("Entering first Name");
		this.firstName.sendKeys(firstName);
	}
	
	public void selectDaysInDropDown(String day){
		log.info("clicking on day from dropdown");
		days.click();
		String day1 = "/*[@id='days']/option[";
		String day2 = "]";
		log.info("Selecting day from dropdown");
		driver.findElement(By.xpath(day1+day+day2)).click();
	}

	public void selectMonthinDropdown(String Month){
		log.info("clicking on month drop down");
		months.click();
		List<WebElement> monthsData = driver.findElements(By.xpath("//*[@id='months']/option"));
		for(WebElement mon : monthsData){
			//System.out.println(mon.getText());
			if(mon.getText().contains(Month)){
				log.info("selecting month in month drop down");
				mon.click();
			}
	}
}
}