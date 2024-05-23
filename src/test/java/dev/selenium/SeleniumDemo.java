package dev.selenium;

import dev.MainDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumDemo extends MainDriver {






    @Test
    public void testOpenBrowser() {
        WebDriver driver = new ChromeDriver();
        WebElement textinput = driver.findElement(By.cssSelector("my password"));
        textinput.click();

        WebElement textinput = driver.findElement(By.);
        textinput.click();
    }


}
