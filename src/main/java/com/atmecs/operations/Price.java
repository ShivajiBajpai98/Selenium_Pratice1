package com.atmecs.operations;

import com.atmecs.business_resuables.VerifyItem;
import com.atmecs.commons.BaseCommons;
import com.atmecs.commons.BaseLaunch;
import com.atmecs.datafile.Locators;
import com.atmecs.datafile.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Price {
    public static void priceCompare(By by) {
       /* BaseLaunch.launch();
        VerifyItem.enterItemInSearchBox(By.xpath(Locators.search_TextBox_Rel_Xpath), User.item);
        // click on search button
        VerifyItem.clickSearchBox(By.xpath(Locators.search_button));
        // search item present or not
        VerifyItem.itemPresent(By.xpath(Locators.result_Found_Rel_Xpath));*/



        List<WebElement> list = BaseCommons.webDriver.findElements(by);
        for (WebElement element : list) {
            String str = element.getText();
            //System.out.println(str);

        }

        List<String> strings = new ArrayList<String>();
        for(WebElement e : list){
            strings.add(e.getText());
        }
        System.out.println("your item prices are :\n"+strings);
        String min = Collections.min(strings);
        System.out.println("Minimum price of summer dress is: "+min);

    }

    }

