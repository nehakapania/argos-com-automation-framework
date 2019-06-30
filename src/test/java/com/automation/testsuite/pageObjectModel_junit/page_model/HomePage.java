package com.automation.testsuite.pageObjectModel_junit.page_model;

import com.automation.testsuite.pageObjectModel_junit.Hooks;
import org.openqa.selenium.By;

public class HomePage extends Hooks
{

    public void doSearch(String item)
    {
        driver.findElement(By.id("searchTerm")).sendKeys(item);
        driver.findElement(By.className("_2mKaC")).click();
    }



}
