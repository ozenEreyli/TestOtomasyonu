package com.rd.common;

import com.rd.drivers.DriverFactory;
import com.rd.pages.ElementsPage;
import com.rd.pages.WebTablesPage;

public class PageManager {
    public ElementsPage elementsPage;
    public WebTablesPage webTablesPage;
    public PageManager()
    {
        DriverFactory.initDriver();
        elementsPage = PageFactory.buildElementsPage();
        webTablesPage = PageFactory.buildWebtablesPage();
    }

}
