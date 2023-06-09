package Example_TNG;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dataProvider_own {
    public WebDriver driver;
    public WebDriverWait wait;

    @Test
    public void selectDateFromCalendar() throws Exception {
        

        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easemytrip.com/");

        
        WebElement calendar = driver.findElement(By.id("ddate"));
        calendar.click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class ='box']")));

        
        selectDateCalendar("25", "December", "2025");
    }

    public void selectDateCalendar(String calendarDay, String calendarMonth, String calendarYear) throws Exception {
  
        if (Integer.parseInt(calendarDay) > 31) {
            System.out.println("Invalid date because days of month is greater than 31");
            return;
        }

        
        if(calendarMonth.equalsIgnoreCase("February") && Integer.parseInt(calendarDay)>29) {
            System.out.println("Invalid date because Feb month days is greater than 29");
            return;
        }

        // Get the current month and year from the calendar
        String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
        System.out.println("The month and year is : " + monthYear);

        // Split the month and year strings
        String[] monthYearArray = monthYear.split(" ");
        String currentMonth = monthYearArray[0];
        String currentYear = monthYearArray[1];

        // Click the next or previous button until the desired month and year is visible
        while (!(currentMonth.equalsIgnoreCase(calendarMonth) && currentYear.equals(calendarYear))) {
            WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
            nextButton.click();

            // Wait for the calendar to load after clicking next or previous button
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class ='box']")));

            // Get the updated month and year strings
            monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
            monthYearArray = monthYear.split(" ");
            currentMonth = monthYearArray[0];
            currentYear = monthYearArray[1];
        }

        // Select the desired day from the calendar
        String dynamicXpath = "//td[@data-handler = 'selectDay']/a[text() = '" + calendarDay + "']";
        WebElement desiredDay = driver.findElement(By.xpath(dynamicXpath));
        desiredDay.click();
    }
}






