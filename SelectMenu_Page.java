package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class SelectMenu_Page extends Baselibrary
{

	public SelectMenu_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@data-target=\"#widget\"]")
	private WebElement widgets;
	@FindBy(xpath="//*[text()='select menu']")
	private WebElement selectmenu;
	@FindBy(xpath="//*[@id=\"tab_24\"]/form/div/div[1]/select")
	private WebElement selectvalue;
	
	public void clickonwidgets()
	{
		widgets.click();	
	}
	public void clickonselectmenu()
	{
		selectmenu.click();
	}
	public void selectvalue()
	{
		dropdownbyvalue(selectvalue, "Group 2, Option 2");
	}
	
}
