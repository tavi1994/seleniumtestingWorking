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
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\seleniumtestingWorking\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void searchTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://34.89.0.182/");
        Thread.sleep(500);

//        WebElement inputField1 = driver.findElement(By.className("//*[@id=\"myCollection\"]/button"));
//        assertTrue(inputField1.isDisplayed());
        // inputField1.sendKeys("Hello World!");
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"myCollection\"]/button"));
        submitButton.click();
        Thread.sleep(5000);

        WebElement inputFieldLabel = driver.findElement(By.id("label"));
        WebElement inputFieldTitle = driver.findElement(By.id("title"));
        WebElement inputFieldArtist = driver.findElement(By.id("artist"));
        WebElement inputFieldYear = driver.findElement(By.id("year"));
        WebElement inputFieldValue= driver.findElement(By.id("value"));
        assertTrue(inputFieldLabel.isDisplayed());
        assertTrue(inputFieldTitle.isDisplayed());
        assertTrue(inputFieldArtist.isDisplayed());
        assertTrue(inputFieldYear.isDisplayed());
        assertTrue(inputFieldValue.isDisplayed());
        inputFieldLabel.sendKeys("BMY2020");
        inputFieldArtist.sendKeys("Bob Marley");
        inputFieldTitle.sendKeys("Exodus");
        inputFieldYear.sendKeys("2001");
        inputFieldValue.sendKeys("20");
        Thread.sleep(2000);

        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"addNewModal\"]/div/div/form/div/div[2]/button[2]"));
        addButton.click();
        Thread.sleep(2000);

        WebElement updateButton = driver.findElement(By.className("btn-primary"));
        updateButton.click();

        Thread.sleep(1000);
        WebElement updateFieldLabel = driver.findElement(By.id("label"));
        WebElement updateFieldTitle = driver.findElement(By.id("title"));
        WebElement updateFieldArtist = driver.findElement(By.id("artist"));
        WebElement updateFieldYear = driver.findElement(By.id("year"));
        WebElement updateFieldValue= driver.findElement(By.id("value"));
        assertTrue(updateFieldLabel.isDisplayed());
        assertTrue(updateFieldTitle.isDisplayed());
        assertTrue(updateFieldArtist.isDisplayed());
        assertTrue(updateFieldYear.isDisplayed());
        assertTrue(updateFieldValue.isDisplayed());

        updateFieldLabel.sendKeys("BOMA230");
        updateFieldArtist.sendKeys("Kahn");
        updateFieldTitle.sendKeys("Over Deh So");
        updateFieldYear.sendKeys("2011");
        updateFieldValue.sendKeys("26");
        Thread.sleep(3000);

        WebElement confUpdateButton = driver.findElement(By.xpath("//*[@id=\"updateModal\"]/div/div/form/div/div[2]/button[2]"));
        confUpdateButton.click();
        Thread.sleep(2000);

        WebElement removeButton = driver.findElement(By.className("btn-danger"));
        removeButton.click();
        Thread.sleep(3000);



        Thread.sleep(3000);


//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,2000)");
//        Thread.sleep(1000);
//
//        inputFieldA.sendKeys("5");
//        inputFieldB.sendKeys("10");
//
//        WebElement submitButton2 = driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button"));
//        submitButton2.click();
//        Thread.sleep(2000);





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
