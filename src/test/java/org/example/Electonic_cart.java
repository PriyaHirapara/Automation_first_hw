package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Electonic_cart {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\soft\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[text() =\"Electronics \"]")).click();
        driver.findElement(By.xpath(" //a[text()= \" Cell phones \"]")).click();
        driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//span[@title=\"Close\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//a[@class=\"ico-cart\"]")).click();
        String pagetext= driver.findElement(By.linkText("HTC One M8 Android L 5.0 Lollipop")).getText();
         System.out.println(pagetext);
       String pagetext1= driver.findElement(By.linkText("HTC One Mini Blue")).getText();
        System.out.println(pagetext1);






    }}




