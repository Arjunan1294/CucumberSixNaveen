package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	//Locator
	//constructor
	//Page actions
	
	private WebDriver driver;
	
	private By accountsections = By.cssSelector("div#center_column span");
	
	
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}
	
	public int getAccountSectionCount() {
		return driver.findElements(accountsections).size();
	}
	
	public List<String> getAccountSectionList() {
		List<String> accountList = new ArrayList<>();
		List<WebElement> getAccountSectionList = driver.findElements(accountsections);
		for(WebElement e : getAccountSectionList) {
			String text = e.getText();
			System.out.println(text);
			accountList.add(text);
		}
		return accountList;
		
	}
}


