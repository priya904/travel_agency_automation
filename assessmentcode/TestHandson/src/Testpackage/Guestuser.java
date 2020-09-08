package Testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guestuser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\GSTN_Automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement departurecity=driver.findElement(By.xpath("//*[@name='fromPort']"));
		//creating class'select'
		Select select = new Select(departurecity);
		
		select.selectByIndex(1);
	
		
		WebElement destinationcity=driver.findElement(By.xpath("//*[@name='toPort']"));
	Select select1 = new Select(destinationcity);
	select1.selectByValue("London");
	
	WebElement submit=driver.findElement(By.xpath("//*[@type='submit']"));
	
	submit.click();
	//choosing flight
	WebElement chooseflight=driver.findElement(By.xpath("//input[@type='submit'][@value='Choose This Flight'][@class='btn btn-small']"));
	chooseflight.click();
	
	//filling details:
	
	WebElement name= driver.findElement(By.id("inputName"));
	name.sendKeys("priya");
	
	WebElement address=driver.findElement(By.id("address"));
	address.sendKeys("19/7,north car street");
	
	WebElement city=driver.findElement(By.id("city"));
	city.sendKeys("chennai");
	
	WebElement state=driver.findElement(By.id("state"));
	state.sendKeys("tamilnadu");
	
	WebElement pincode=driver.findElement(By.id("zipCode"));
	pincode.sendKeys("626123");
	
	WebElement cardtype=driver.findElement(By.id("cardType"));
	Select select2= new Select(cardtype);
	select2.selectByIndex(0);
	
	WebElement cardnum=driver.findElement(By.id("creditCardNumber"));
	cardnum.sendKeys("1313124241414");
	
	WebElement month=driver.findElement(By.id("creditCardMonth"));
	month.sendKeys("11");
	
	WebElement year=driver.findElement(By.id("creditCardYear"));
	year.sendKeys("2019");
	
	WebElement nameoncard=driver.findElement(By.id("nameOnCard"));
	nameoncard.sendKeys("priya");
	
	WebElement purchasefligt=driver.findElement(By.xpath("//input[@type='submit']"));
	purchasefligt.click();
	}

}
