package com.atmecs.test_results;

import com.atmecs.function_resuable.UserAction;
import com.atmecs.commons.BaseLaunch;
import com.atmecs.datafile.Locators;
import org.openqa.selenium.By;

public class TestUIElements {
    public static void main(String[] args) {
        // launch browser and website
        BaseLaunch.launch();


        // check page present or not
        boolean page_Present_Rel_Xpath=  UserAction.isElementPresent( By.xpath(Locators.page_Present_Rel_Xpath));
        System.out.println("Page is present"+" : "+page_Present_Rel_Xpath);




        // check search text box present or not
        boolean searchTextBox= UserAction.searchTextBox(By.xpath(Locators.search_TextBox_Rel_Xpath));
        System.out.println("Search_TextBox_Present"+" : "+searchTextBox);


        // check search button present or not
        boolean searchButton= UserAction.searchTextBox(By.xpath(Locators.search_TextBox_Rel_Xpath));
        System.out.println("searchButton_Present"+" : "+searchTextBox);


    }
}
