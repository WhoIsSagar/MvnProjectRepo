package Like4Like;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Insta_like {

	public WebDriver driver;
	
	@Test (priority =1 )
	public void InstaLike() throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//input [@name = 'username']")).sendKeys("giddarhbaha12");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//input [@name = 'password']")).sendKeys("Brampton1@");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//div [@class = 'x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
		TimeUnit.SECONDS.sleep(5);

		
		driver.get("https://www.like4like.org/login/");
		driver.findElement(By.xpath("//input [@id ='username']")).sendKeys("sagarhanjhra@gmail.com");
		driver.findElement(By.xpath("//input [@id ='password']")).sendKeys("Brampton1@");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//span [@class ='button medium orange cursor']")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.get("https://www.like4like.org/user/earn-instagram-follow.php");
		TimeUnit.SECONDS.sleep(1);
		String parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		Set<String> windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		
		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		driver.get("https://instagram.com/accounts/logout");
		
		
		driver.get("https://www.instagram.com/");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//input [@name = 'username']")).sendKeys("tarsem_kular123");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//input [@name = 'password']")).sendKeys("Brampton1@");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//div [@class = 'x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
		TimeUnit.SECONDS.sleep(5);

		

		driver.get("https://www.like4like.org/user/earn-instagram-follow.php");
		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		
		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		driver.get("https://instagram.com/accounts/logout");
		

		driver.get("https://www.instagram.com/");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//input [@name = 'username']")).sendKeys("harmandeep_1998");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//input [@name = 'password']")).sendKeys("Brampton1@");
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//div [@class = 'x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
		TimeUnit.SECONDS.sleep(5);

		
		driver.get("https://www.like4like.org/user/earn-instagram-follow.php");
		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		
		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		

		TimeUnit.SECONDS.sleep(1);
		parentHandle = driver.getWindowHandle(); 
		
		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		
		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
		driver.switchTo().window(parentHandle);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//a [@class = 'cursor pulse-checkBox']/img")).click();
		TimeUnit.SECONDS.sleep(2);
		
		parentHandle= driver.getWindowHandle();

		driver.findElement(By.xpath("//a[starts-with(@class, 'cursor earn_pages_button profile_view_img_')]")).click();
		

		TimeUnit.SECONDS.sleep(5);
		windowHandels = driver.getWindowHandles();
		
		
		for (String handle:windowHandels) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				TimeUnit.SECONDS.sleep(2);
				driver.findElement(By.xpath("//div [@ class = '_aacl _aaco _aacw _aad6 _aade']")).click();
				TimeUnit.SECONDS.sleep(1);
				driver.close();
				
			}
		}
	}
	
}
