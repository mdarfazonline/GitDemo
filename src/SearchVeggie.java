	import java.util.List;
	import java.util.stream.Collectors;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.Assert;

public class SearchVeggie {

	public static void main(String[] args) {
		
				WebDriver driver=new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
				
				driver.findElement(By.xpath("//tr/th[1]")).click();
				
				driver.findElement(By.id("search-field")).sendKeys("Ch");
				
				List<WebElement> elementList=driver.findElements(By.xpath("//tr/td[1]"));
				
				List<WebElement> veggieList=elementList.stream().filter(s->s.getText().contains("Ch")).collect(Collectors.toList());
				
				Assert.assertTrue(elementList.size()==veggieList.size());
				
				System.out.println("Mission Completed");
				
	}

}
