package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class GoogleSeleniumTest {

    private ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\seleniumtesting\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void searchTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        Thread.sleep(1000);

        WebElement inputField1 = driver.findElement(By.className("form-control"));
        assertTrue(inputField1.isDisplayed());
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"get-input\"]/button"));

        inputField1.sendKeys("Hello World!");
        submitButton.click();
        Thread.sleep(5000);

        WebElement inputFieldA = driver.findElement(By.id("sum1"));
        WebElement inputFieldB = driver.findElement(By.id("sum2"));
        assertTrue(inputFieldA.isDisplayed());
        assertTrue(inputFieldB.isDisplayed());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(1000);

        inputFieldA.sendKeys("5");
        inputFieldB.sendKeys("10");

        WebElement submitButton2 = driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button"));
        submitButton2.click();
        Thread.sleep(2000);





//        WebElement searchField = driver.findElement(By.name("q"));
//        assertTrue(searchField.isDisplayed());
//        searchField.sendKeys("funny cat pictures");
//        Thread.sleep(5000);
//
//        WebElement submitButton = driver.findElement(By.name("btnK"));
//        submitButton.click();
//        Thread.sleep(5000);
//
//        WebElement linkToBiggerPics = driver.findElementByLinkText("Images for funny cat");
//        linkToBiggerPics.click();
//        Thread.sleep(5000);
//
//        WebElement maximizePic = driver.findElement(By.id("5wYTLfGlVUdRyM:"));
//        maximizePic.click();
//        Thread.sleep(5000);
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollBy(0,3000)");
////        Thread.sleep(5000);
//
//        WebElement Element = driver.findElement(By.id("K8WclSCOqZY_SM:"));
//        js.executeScript("arguments[0].scrollIntoView(true);", Element);
//        Element.click();
//        Thread.sleep(4000);

    }

    @Test
    public void trainTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        Thread.sleep(1000);

        WebElement cbox1 = driver.findElement(By.id("isAgeSelected"));
        cbox1.click();
        Thread.sleep(2000);

        WebElement cbox2 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input"));
        cbox2.click();

        WebElement cbox3 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input"));
        cbox3.click();

        WebElement cbox4 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input"));
        cbox4.click();

        WebElement cbox5 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input"));
        cbox5.click();

        Thread.sleep(2000);

        cbox3.click();
        cbox4.click();

        Thread.sleep(2000);

        WebElement button = driver.findElement(By.id("check1"));
        button.click();
        Thread.sleep(2000);

        button.click();
        Thread.sleep(2000);



    }
}
