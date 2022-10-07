package testingbaba_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baselibrary;

public class Textbox_page extends Baselibrary
{

	public Textbox_page() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@data-target=\"#elements\"]")
	private WebElement elements;
	@FindBy(xpath="//*[text()='text box']")
	private WebElement textbox;
	@FindBy(xpath="//*[@id=\"fullname1\"]")
	private WebElement name;
	@FindBy(xpath="//*[@id=\"fullemail1\"]")
	private WebElement email;
	@FindBy(xpath="//*[@id=\"fulladdresh1\"]")
	private WebElement currentaddress;
	@FindBy(xpath="//*[@id=\"paddresh1\"]")
	private WebElement permanentaddress;
	@FindBy(xpath="//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
	private WebElement submitbtn;
	
	public void clickonelements()
	{
		elementtobeclickable(elements, 3);
		elements.click();
	}
	public void clickontextbox()
	{
		textbox.click();
	}

	public void filldetails()
	{
		name.sendKeys(getReaddata(0, 0, 1));
		email.sendKeys(getReaddata(0, 1, 1));
		currentaddress.sendKeys(getReaddata(0, 2, 1));
		permanentaddress.sendKeys(getReaddata(0, 3, 1));
		submitbtn.click();
		//System.out.println(text);
	}
	
	
}
