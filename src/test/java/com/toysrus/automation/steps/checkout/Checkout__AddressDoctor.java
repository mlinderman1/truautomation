package com.toysrus.automation.steps.checkout;

import com.toysrus.automation.steps.common.AbstractPage_StepDefs;
import com.toysrus.automation.steps.overlays.Overlay__LightBox;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.Random;

public class Checkout__AddressDoctor extends AbstractPage_StepDefs {

    //     (ADDRESS DOCTOR TO BE DECOMMISSIONED WITH NEW CHECKOUT 2018; GOOGLE ADDRESS API TO BE USED)

    public class Selectors {
        public static final String overlay__address_doctor = ".address-doctor";
        public static final String checkbox__address_doctor__user_address = "#suggestedAddressCount-0";
        public static final String checkbox__address_doctor__suggested_address = "#suggestedAddressCount-1";
        public static final String btn__address_doctor__useAddress = "#continueWithSugestedAddr";
    }

    WebDriver driver = getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 15);
    URL siteURL;
    Random rand = new Random();
    int n;
    Overlay__LightBox lightBox = new Overlay__LightBox();
    Selectors selector = new Selectors();

    @And("^the user opts for inputted address$")
    public void theUserOptsForInputtedAddress() throws Throwable {
        try {
            WebElement addressDoctor = driver.findElement(By.cssSelector(selector.overlay__address_doctor));

            wait.until(ExpectedConditions.visibilityOf(addressDoctor));

            if (addressDoctor.isDisplayed()) {
                do {
                    WebElement addressDoctor_useButton = driver.findElement(By.cssSelector(selector.checkbox__address_doctor__user_address));
                    addressDoctor_useButton.click();
                }
                while (addressDoctor.isDisplayed());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}