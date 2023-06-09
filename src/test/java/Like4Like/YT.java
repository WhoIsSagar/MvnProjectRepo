package Like4Like;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;




public class YT {
	
	public WebDriver driver;
	
	
	@Test(priority = 1 )
	public void ytLike() {
	
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/shirt/men-shirt/formal-shirt/pr?sid=clo,ash,axc,mmk,bk1&otracker=categorytree&otracker=nmenu_sub_Men_0_Formal%20Shirts");

		// Find all the links on the page
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Print the href attribute of each link
		for (int i = 0; i < links.size(); i++) {
		    WebElement link = links.get(i);
		    System.out.println(link.getAttribute("href"));
		}

		// Find all the shirts on the page
		List<WebElement> shirts = driver.findElements(By.xpath("//div[@class='_2kHMtA']"));

		// Print the name, price, and discount of each shirt
		for (int i = 0; i < shirts.size(); i++) {
		    WebElement shirt = shirts.get(i);
		    WebElement nameElement = shirt.findElement(By.xpath(".//a[@class='_2mylT6']"));
		    String name = nameElement.getText();
		    WebElement priceElement = shirt.findElement(By.xpath(".//div[@class='_30jeq3']"));
		    String price = priceElement.getText();
		    WebElement discountElement = shirt.findElement(By.xpath(".//div[@class='_3Ay6Sb']"));
		    String discount = discountElement.getText();
		    System.out.println("Brand: " + name + " | Price: " + price + " | Discount: " + discount);
		}
		
	}   
	
	
}

