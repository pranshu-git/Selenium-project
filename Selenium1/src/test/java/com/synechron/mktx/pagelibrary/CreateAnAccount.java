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
	By mrRadionButton =  By.xpath("//*[@id='id_gender1']") ;
	By mrsRadioButton =  By.xpath("//*[@id='id_gender2']") ;
	By craeteAnAccoutn =  By.xpath("//*[@id='noSlide']/h1");
	By yourPersonalInfo =  By.xpath("//*[@id='account-creation_form']/div[1]/h3");
	By firstName =  By.xpath("//*[@id='customer_firstname']");
	By lastname =  By.xpath("//*[@id='customer_lastname']");
	By emailAddress =  By.xpath("//*[@id='email']");
	By password = By.xpath("//*[@id='passwd']");
	By days =  By.xpath("//*[@id='days']");
	By months =  By.xpath("//*[@id='months']");
	By year = By.xpath("//*[@id='years']");
	By signUpForOurNewsletter =  By.xpath("//*[@id='newsletter']");
	By receiveSpecialOffer =  By.xpath("//*[@id='optin']");
	By yourAddress =  By.xpath("//*[@id='account-creation_form']/div[2]/h3");
	
	By yourAddressFirstName =  By.id("firstname");
	By yourAddressLasstName =  By.id("lastname");
	By yourAddressCompany =  By.id("firstname");
	By yourAddressPrimary =  By.id("address1");
	By yourAddressSecondry =  By.id("address2");
	By yourAddressCity =  By.id("city");
	By yourAddressPostalCode =  By.id("postcode");
	By yourAddressStateDropDown = By.xpath("//*[@id='id_state']");
	By yourAddressCountryName = By.xpath("//*[@id='id_country']");
	By yourAddressPhoneNumber = By.xpath("//*[@id='phone_mobile']");
	By yourAddressAlias = By.xpath("//*[@id='alias']");

	public void selectMrRadioButton(){
		log.info("Selecting Mr radio button");
		driver.findElement(mrRadionButton).click();
		
	}
	
	public boolean VerifyCreateAnAccountLabel(){
		log.info("verifying Create An account label display on UI");
		try{
			driver.findElement(craeteAnAccoutn).isDisplayed();
			return true;
		}
		catch(Exception e){
			return false;
		}
		
	}
	public void firstName(String firstName){
		log.info("Entering first Name");
		driver.findElement(this.firstName).sendKeys(firstName);
	}
	
	public void selectDaysInDropDown(String day){
		log.info("clicking on day from dropdown");
		driver.findElement(days).click();
		String day1 = "/*[@id='days']/option[";
		String day2 = "]";
		log.info("Selecting day from dropdown");
		driver.findElement(By.xpath(day1+day+day2)).click();
	}

	public void selectMonthinDropdown(String Month){
		log.info("clicking on month drop down");
		driver.findElement(months).click();
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