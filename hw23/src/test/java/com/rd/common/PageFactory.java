package com.rd.common;

import com.rd.pages.ElementsPage;
import com.rd.pages.WebTablesPage;

public class PageFactory {

    public static ElementsPage buildElementsPage() {
        return new ElementsPage("/buttons");
    }

    public static WebTablesPage buildWebtablesPage() {
        return new WebTablesPage("/webtables");
    }

}
