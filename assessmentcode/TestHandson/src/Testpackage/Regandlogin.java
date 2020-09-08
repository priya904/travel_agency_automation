package Testpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regandlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Automation\\GSTN_Automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		
		
		driver.manage().window().maximize();
		WebElement homelink=driver.findElement(By.xpath("/html/body/div[1]/div/div/a[3]"));
		homelink.click();
	
	//Register tc's for new user:
		
		WebElement register=driver.findElement(By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[2]/a"));
         register.click();
         
         WebElement name= driver.findElement(By.id("name"));
         name.sendKeys("priya");
	
         WebElement company= driver.findElement(By.id("company"));
         company.sendKeys("infy");

         WebElement emailid=driver.findElement(By.id("email"));
         emailid.sendKeys("jeganathan.priya@gmail.com");
         
         WebElement pass=driver.findElement(By.id("password"));
         pass.sendKeys("jesus@123");
         
        WebElement confirmpass= driver.findElement(By.id("password-confirm"));
        confirmpass.sendKeys("jesus@123");
        
        WebElement submit=driver.findElement(By.xpath("//*[@type='submit']"));
        submit.click();
       // driver.quit();
        
        
       // Login
        
        WebElement loginlink=driver.findElement(By.xpath("//a[contains(@href,'login')]"));
        loginlink.click();
        
        WebElement emailadd=driver.findElement(By.id("email"));
        emailadd.sendKeys("jeganathan.priya@gmail.com");
        
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("jesus@123");
        
        WebElement login=driver.findElement(By.xpath("//*[@type='submit']"));
        login.click();
        
        driver.close();
        
    
              
       
	}

}
