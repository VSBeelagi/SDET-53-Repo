package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {

	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement OrgLookUpImg;
	
	
	public OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getOrgLookUpImg() {
		return OrgLookUpImg;
	}
	
	//business logic
	public void clickOnOrgLookUpImg()
	{
		OrgLookUpImg.click();
	}
	
	
	
	
	
}
