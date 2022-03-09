package com.atmecs.function_resuable;



import com.atmecs.commons.BaseCommons;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class UserAction {


    // check page is present or not return and returns true or false
    public  static boolean isElementPresent(By by) {
        try {
            // String by1=PropertyManager.getInstance().getIsElementPresent_Xpath();
            BaseCommons.webDriver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {

            System.out.println("Locator(web element) is not present");
            return false;
        }
    }

    //  return website page title
    public static String getTitle() {
        return BaseCommons.webDriver.getTitle();
    }

    // check search_box present or not

    public static boolean searchTextBox(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println(" Search box locator(web element) is not present");
                return false;
            }
        } else
            System.out.println(" Search box locator(web element) is not present");
        return false;
    }

    // search button present or not
    public static boolean searchButton(By by) {

        if (isElementPresent(by)) {
            try {
                BaseCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println(" Search button (web element) is not present");
                return false;
            }
        } else
            System.out.println(" Search  button(web element) is not present");
        return false;
    }
}