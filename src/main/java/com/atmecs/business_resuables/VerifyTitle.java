package com.atmecs.business_resuables;


import com.atmecs.commons.BaseCommons;

public class VerifyTitle {
    // check page title is equals expected title or not
    public static boolean verifyPageTitle( String expectedTitle)
    {
       String actualTitle= BaseCommons.webDriver.getTitle();
       //System.out.println(actualTitle);

        if (actualTitle.equals(expectedTitle))
        {
            System.out.println("Expected Title is same as actual title"+" "+actualTitle+" "+true);
        }
        else
            System.out.println("Expected title is not matched:"+actualTitle+" "+false);
        return false;

    }
}