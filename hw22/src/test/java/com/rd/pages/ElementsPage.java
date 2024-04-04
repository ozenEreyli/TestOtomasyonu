package com.rd.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage extends BasePage{

    public ElementsPage(String pageUrl)
    {
        super(pageUrl);
    }

    public SelenideElement btnButtons = $("li[id=\"item-4\"]");
    public SelenideElement btnClickMe = $(".col-md-6 div:nth-of-type(3) > .btn");
    public SelenideElement lblClickMessage = $("p[id=\"dynamicClickMessage\"]");
    public void GetElementsPage()
    {
        btnButtons.click();
        btnClickMe.click();
    }
    public String GetClickMessage()
    {
        return lblClickMessage.getText();
    }

}
