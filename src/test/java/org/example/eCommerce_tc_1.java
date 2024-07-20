package org.example;

import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class eCommerce_tc_1 extends BaseTest{
    @Test
    public void FillForm() throws InterruptedException {
        //driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Daniel");
        driver.hideKeyboard();
        driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();

        driver.findElement(AppiumBy.id("android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Argentina']")).click();

        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        Thread.sleep(2000);

        String toast = driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getAttribute("name");
        Assert.assertEquals(toast, "Please enter your name");


    }
}
