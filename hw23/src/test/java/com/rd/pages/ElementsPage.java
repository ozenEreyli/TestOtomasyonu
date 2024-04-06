package com.rd.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage extends BasePage{

    public SelenideElement btnButtons=$(".show li:nth-of-type(5) > .text");
    public SelenideElement btnClickMe=$(".col-md-6 div:nth-of-type(3) > .btn");
    public SelenideElement lblDynamicClickMessage=$("#dynamicClickMessage");

    public ElementsPage(String pageUrl) {
        super(pageUrl);
    }

}

