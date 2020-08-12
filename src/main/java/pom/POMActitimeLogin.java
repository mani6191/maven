package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class POMActitimeLogin implements AutoConstant
{
	@FindBy(xpath="//input[@id=\"username\"]")
	private WebElement useranmeTextField;
	@FindBy(xpath="//input[@type=\"password\" and @placeholder=\"Password\" ]")
	private WebElement PasswordTextField;
	@FindBy(xpath="(//div[contains(text(),\"Login \")])[1]")
	private WebElement loginButton;
	
	public POMActitimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void LoginMethod() throws IOException 
	{
		useranmeTextField.sendKeys(ExcelLibrary.getCellValue(exelPath, sheetName, 1, 0));
		PasswordTextField.sendKeys(ExcelLibrary.getCellValue(exelPath, sheetName, 1, 1));
		loginButton.click();
	}
}
