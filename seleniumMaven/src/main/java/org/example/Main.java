package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        //1. Open Chrome Driver
        WebDriver driver = new ChromeDriver();
        //2. Run Google Server
        driver.get("https://www.google.com");
        //Close google chrome
        driver.close();

        //1. Open firefox Driver
        WebDriver driver1 = new FirefoxDriver();
        //2. Run firefox Server
        driver1.get("https://www.firefox.com");
        //Close firefox
        driver1.close();
    }
}