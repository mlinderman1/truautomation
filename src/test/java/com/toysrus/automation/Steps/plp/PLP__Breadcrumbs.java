package com.toysrus.automation.Steps.plp;

import com.toysrus.automation.Steps.common.AbstractPage_StepDefs;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PLP__Breadcrumbs extends AbstractPage_StepDefs {


    public class Selectors {

    }

    WebDriver driver = getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);
    Selectors selector = new Selectors();


    @Before
    public void setUp() {
        getDriver();
        driver.manage().window().maximize();
    }

    @After
    public void breakDown() {
        closeDriver();
    }




}