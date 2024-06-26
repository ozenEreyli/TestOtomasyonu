package com.rd.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.rd.utils.PropertyManager;

public class BasePage {

    protected String pageUrl;
    PropertyManager propertyManager = new PropertyManager();

    public BasePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void open() {
        String url = propertyManager.getProperty("APP_URL") ;
        Selenide.open(url);
    }

    public String getUrl() throws InterruptedException {
        //Thread.sleep(2000);
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }

}
