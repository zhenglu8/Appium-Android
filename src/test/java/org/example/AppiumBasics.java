package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class AppiumBasics extends BaseTest{

    @Test
    public void WifiSettingsName() throws MalformedURLException, URISyntaxException {

        // Confirguation or BeforeClass()
        // ConfigureAppium();

        // Automation
        // Xpath, id, classname
        // Android only: accessibilityId, androidUIAutomator
        // Xpath: //tagName[@attribute='value'] or //tagName
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();

        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");

        // set wifi name
        driver.findElement(By.id("android:id/edit")).sendKeys("DanielWifi");
        // classname here for OK button is not unique
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();


        // Finish or AfterClass()
        // tearDown();
    }
}
