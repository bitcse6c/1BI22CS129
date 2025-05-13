package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main(String[] args) 
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://bitwebserver.bittechlearn.online:8084/Students/StudentLogin.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("txtStudentId")).sendKeys("1BI22CS129");
     // driver.findElement(By.id("txtPassword")).sendKeys("");
        driver.findElement(By.id("btnLogin")).click();
    }
}

