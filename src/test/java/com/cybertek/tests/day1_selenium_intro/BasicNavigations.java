package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1 -setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2-create instance of selenium web driver
        WebDriver driver = new ChromeDriver();

        //3 - get the page for Tesla.com
        driver.get("https://tesla.com");

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        System.out.println("Current title: " + driver.getTitle());

        //putting 3 seconds of wait
        Thread.sleep(3000);

        //going back using navigation
        driver.navigate().back();

        //going forward using navigations
        driver.navigate().forward();

        //refreshing the page using navigations
        driver.navigate().refresh();

        //going to another url using .to()method
        driver.navigate().to("https://www.google.com");


        System.out.println("Current title: " + driver.getTitle());

        //this line will basically maximize the browser
        driver.manage().window().maximize();

        //does similar thing as maximize
        driver.manage().window().fullscreen();


        driver.close();











    }
}
