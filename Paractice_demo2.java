package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paractice_demo2 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		WebElement newTab=driver.findElement(By.xpath("//button[text()='New Tab']"));
		WebElement newWindow=driver.findElement(By.xpath("//button[text()='New Window']"));
		WebElement newWindowmessage=driver.findElement(By.xpath("//button[text()='New Window Message']"));
		
		newTab.click();
		newWindow.click();
		newWindowmessage.click();
		
		Set<String> set=driver.getWindowHandles();
		ArrayList<String> list=new ArrayList<String>(set);
		System.out.println(list);
		
		
		driver.switchTo().window(list.get(3));
		String windowName=driver.getWindowHandle();
		System.out.println(windowName);
		Thread.sleep(5000);
		String data=driver.findElement(By.xpath("//body")).getText();;
		System.out.println(data);
		driver.close();
		
		Thread.sleep(5000);
		String data1=driver.switchTo().window(list.get(2)).findElement(By.xpath("//*[text()='This is a sample page']")).getText();
		System.out.println(data1);
		driver.close();
		
		Thread.sleep(5000);
		driver.switchTo().window(list.get(1));
//		Thread.sleep(5000);
//		String data2=driver.findElement(By.xpath("//body")).getText();
//		System.out.println(data2);
		driver.close();
		driver.switchTo().window(list.get(0));
		
		System.out.println("End");
	}
}


