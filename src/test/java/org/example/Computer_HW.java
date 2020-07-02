package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Computer_HW {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\soft\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[text () =\"Computers \"] ")).click();
        driver.findElement(By.xpath("//a[text() =\" Desktops \"]")).click();
        String pagetext= driver.findElement(By.xpath("//a[text()=\"Build your own computer\"]")).getText();
        System.out.println(pagetext);
        //String pagetext= driver.findElement(By.xpath("//div[@class=\"page-body\"]/div[1]/div[1]/div[1]/div[1]")).getText();
       // System.out.print(pagetext);





}}
