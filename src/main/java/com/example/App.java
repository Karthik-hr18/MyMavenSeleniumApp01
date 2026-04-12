```java
package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) {

        // Setup Chrome in headless mode (important for Jenkins)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // modern headless
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options); // ✅ pass options

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Optional: wait and print title
        System.out.println("Title: " + driver.getTitle());

        driver.quit(); // ✅ very important
    }
}
```
