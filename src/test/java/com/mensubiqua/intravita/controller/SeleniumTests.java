package com.mensubiqua.intravita.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTests {
    private static WebDriver driver = null;
    public static void main(String[] args) {
    	String root = "https://localhost:8443/intravita";

        if(System.getProperty("os.name").equals("Linux"))
            System.setProperty("webdriver.gecko.driver", "lib/geckodriver");
        else
            System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");

        driver = new FirefoxDriver();

        LoginWebTests.run(root);
        HomeWebTests.run(root);

        driver.quit();

    }

    public static WebDriver getDriver()
    {
        return SeleniumTests.driver;
    }

}