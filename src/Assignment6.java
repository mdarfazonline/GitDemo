import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//label[@for='bmw']/input")).click();
		String option1 = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		
		WebElement we = driver.findElement(By.id("dropdown-class-example"));
		
		Select dropdown = new Select(we);
		
		dropdown.selectByVisibleText(option1);
		//Assert a = new Assert();
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(option1);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		driver.close();
		
	}

}
