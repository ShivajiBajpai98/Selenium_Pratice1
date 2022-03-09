package com.atmecs.test_results;

import com.atmecs.business_resuables.VerifyItem;
import com.atmecs.commons.BaseLaunch;
import com.atmecs.datafile.Locators;
import com.atmecs.datafile.User;
import com.atmecs.operations.Price;
import org.openqa.selenium.By;

public class TestPrice {
    public static void main(String[] args) {
          BaseLaunch.launch();
        VerifyItem.enterItemInSearchBox(By.xpath(Locators.search_TextBox_Rel_Xpath), User.item);
        // click on search button
        VerifyItem.clickSearchBox(By.xpath(Locators.search_button));
        // search item present or not
        VerifyItem.itemPresent(By.xpath(Locators.result_Found_Rel_Xpath));

        Price.priceCompare(By.xpath(Locators.getAll_price_Rel_Xpath));
    }
}
