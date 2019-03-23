package com.company.steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    @Given("I navigate to google")
    public void iNavigateToGoogle() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        driver.quit();
    }
}
