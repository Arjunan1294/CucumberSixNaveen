package com.pages;

import com.qa.util.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginPage {

	private WebDriver driver;
	Properties prop;
	ConfigReader cf;
	
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin11");
	private By forgotPasswordLink = By.linkText("Forgot your password?11");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		cf = new ConfigReader();
		prop = cf.init_prop();
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPasswordLinkExist() {
		return driver.findElement(forgotPasswordLink).isDisplayed();
	}
	
	public void enterUserName(String userName) {
		driver.findElement(emailId).sendKeys(prop.getProperty("username"));
	}
	
	public void enterPassword(String pwd) throws InterruptedException {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}
	

}
