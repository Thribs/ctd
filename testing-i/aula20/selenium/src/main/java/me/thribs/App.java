package me.thribs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com");

        WebElement userField = driver.findElement(By.id("user-name"));
        userField.sendKeys("standard_user");
    }
}
