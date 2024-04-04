package com.rd.tests;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ElementsPageTest extends BaseTest{

    @Test
    public void ReadClickMessage()
    {
        pageManager.elementsPage.open();
        pageManager.elementsPage.GetElementsPage();
        assertThat(pageManager.elementsPage.GetClickMessage()).isEqualTo("You have done a dynamic click");
    }
}
