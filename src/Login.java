import java.time.Duration;
import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement we=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dd=new Select(we);
		dd.selectByIndex(0);
		driver.findElement(By.cssSelector("input[id='terms']")).click();
		
		driver.findElement(By.cssSelector("input[id='signInBtn']")).click();
		
		System.out.println("These are the updates for Dev branch");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++)

		{

			products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();}
		
		
	}


