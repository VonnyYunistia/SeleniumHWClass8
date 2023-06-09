package HWSeleniumClass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Calendar {

    public static void main(String[] args) {


        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Set the implicit wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Navigate to the login page

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        driver.get(url);

        // Enter the username and password
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        // Click the login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        // Wait for the page to load
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // Click on the recruitment tab
        WebElement recruitmentTab = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitmentTab.click();

        // Wait for the page to load
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // Click on the calendar
        WebElement calendar = driver.findElement(By.xpath("//input[@type='text' and @id='candidateSearch_fromDate']"));
        calendar.click();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        // Select a date on the calendar
        WebElement date = driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='20']"));
        date.click();



    }
















    }











