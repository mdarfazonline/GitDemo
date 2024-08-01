import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day= "15";
		String month="6";
		String year="2027";
		String[] expectedlist = {day, month, year};
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		
		driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
		
		List<WebElement> dates= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		String actualdate="";
		for(int i = 0; i<dates.size();i++)
		{
			dates.get(i).getAttribute("value");
			//actualdate=actualdate + date.getAttribute("value");

			
		}
		
	}

}
