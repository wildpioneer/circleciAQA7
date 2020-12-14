package org.techmeskills.aqa7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest1 {
    WebDriver driver;

    @Test
    public void openChromePage() {
        System.out.println("Selenium test has been started!");
        WebDriver driver = new BrowserService("chrome").getDriver();
        driver.get("http://google.com");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();
    }

    @Test
    public void openFirefoxPage() {
        System.out.println("Selenium test has been started!");
        WebDriver driver = new BrowserService("firefox").getDriver();
        driver.get("http://google.com");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();
    }
}
