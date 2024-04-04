package com.rd.tests;

import org.testng.annotations.Test;

public class WebTablesPageTest extends BaseTest{

    @Test
    public void AddEditFromTest()
    {
        pageManager.webTablesPage.open();
        pageManager.webTablesPage.AddEditForm();
    }
}
