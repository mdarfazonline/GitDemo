import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> elementList=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalList=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> prices;
		
		do {
			
			List<WebElement> elementList1=driver.findElements(By.xpath("//tr/td[1]"));
			prices= elementList1.stream().filter(s->s.getText().startsWith("S"))
				.map(s->getVeggiePrice(s)).collect(Collectors.toList());
		
			prices.forEach(a->System.out.println(a));
			
			if(prices.size()<1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		
		}while(prices.size()<1);
		
		System.out.println("Mission Completed");
		
		driver.quit();
		
	}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		System.out.println("These are the updates");
		return price;
		
	}

}
