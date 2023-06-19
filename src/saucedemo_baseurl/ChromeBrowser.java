package saucedemo_baseurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println("page title is " + driver.getTitle());
        System.out.println("current URL " + driver.getCurrentUrl());
        System.out.println("page source " + driver.getPageSource());
        WebElement emailfield = driver.findElement(By.id("user-name"));
        emailfield.sendKeys("prime123@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Prime123");
        driver.close();


    }
}