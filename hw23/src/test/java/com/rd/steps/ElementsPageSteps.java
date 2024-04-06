package com.rd.steps;

import com.rd.common.PageManager;
import com.rd.utils.Context;
import com.rd.utils.ScenarioContext;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.text;

public class ElementsPageSteps {

    PageManager pageManager = new PageManager();
    ScenarioContext scenarioContext = new ScenarioContext();

    @Then("check dynamic Click Message {string}")
    public void check_dynamic_click_message(String message) {
        scenarioContext.setContext(Context.ID, message);
    }
    @Then("check dynamic Click Message")
    public void check_dynamic_click_message() {
        String sharedMessage=scenarioContext.getContext(Context.ID).toString();
        pageManager.elementsPage.lblDynamicClickMessage.shouldHave(text(sharedMessage));
    }

}
