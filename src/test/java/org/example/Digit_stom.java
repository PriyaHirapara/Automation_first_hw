package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Digit_stom {
        static WebDriver driver;

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\soft\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://demo.nopcommerce.com/");
            driver.findElement(By.xpath("//a[text () =\"Computers \"] ")).click();
            driver.findElement(By.xpath("//a[text() =\" Desktops \"]")).click();
            driver.findElement(By.xpath("//a[text()=\"Digital Storm VANQUISH 3 Custom Performance PC\"]")).click();
            driver.findElement((By.xpath("//input[@value=\"Email a friend\"]"))).click();
            driver.findElement(By.xpath("//input[@name=\"send-email\"]")).click();
            String pageText=driver.findElement(By.xpath("//span[text() =\"Enter friend's email\"]")).getText();
            System.out.println(pageText);
            String pageText1=driver.findElement(By.xpath("//span[@id =\"YourEmailAddress-error\"]")).getText();
            System.out.println(pageText1);



}}
