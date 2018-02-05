package com.synechron.mktx.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static Properties Repository = new Properties();
	public File f;
	public FileInputStream FI;
	public static WebDriver driver;
	
	public void init() throws IOException {
		loadPropertiesFile();
		selectBrowser(Repository.getProperty("browser"));
		driver.get(Repository.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	 public void loadPropertiesFile() throws IOException {
			f = new File(System.getProperty("user.dir") + "//src//test//java//com//companyname//projectname//config//config.properties");
			FI = new FileInputStream(f);
			Repository.load(FI);

			// f = new
			// File(System.getProperty("user.dir")+"\\src\\com\\actiTime\\pageLocators\\loginpage.properties");
			// FI = new FileInputStream(f);
			// Repository.load(FI);
		}

	 public WebDriver selectBrowser(String browser){
				if(browser.equalsIgnoreCase("firefox")){
					//https://github.com/mozilla/geckodriver/releases
					System.out.println(System.getProperty("user.dir"));
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					return driver;
				}
				else if(browser.equalsIgnoreCase("chrome")){
					//https://chromedriver.storage.googleapis.com/index.html
					//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
					System.setProperty("webdriver.chrome.driver", "C:/Users/Pranshu/workspace/Selenium1/drivers/chromedriver.exe");
					//System.out.println(driver);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					return driver;
				}
				return null;
			}
	}
