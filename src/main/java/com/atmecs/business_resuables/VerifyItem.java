package com.atmecs.business_resuables;

import com.atmecs.commons.BaseCommons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class VerifyItem {

    // Entering the item in search box
    public static void enterItemInSearchBox(By by, String item)
    {
        WebElement searches = BaseCommons.webDriver.findElement(by);
        searches.sendKeys(item);

    }

    // click on search button
    public static void clickSearchBox(By by)
    {
        BaseCommons.webDriver.findElement(by).click();
        BaseCommons.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }



    // checking the search item is present or not
        public static int itemPresent(By by)
        {
            String str = BaseCommons.webDriver.findElement(By.xpath("//span[@class='heading-counter']")).getText();
            System.out.println(str);
            str = str.replaceAll("[^\\d]", " ");

            // Remove extra spaces from the beginning
            // and the ending of the string
            str = str.trim();

            // Replace all the consecutive white
            // spaces with a single space
            str = str.replaceAll(" +", " ");
            int item_Numbers= Integer.parseInt(str);
            //System.out.println(item_Numbers);

            if (item_Numbers>0)
            {
                System.out.println("Your Item is present");
            }
            else
            {
                System.out.println("Your Item is not present");
            }
            return item_Numbers;
        }
}
