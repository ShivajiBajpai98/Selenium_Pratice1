package com.atmecs.test_results;

import com.atmecs.business_resuables.VerifyTitle;
import com.atmecs.commons.BaseLaunch;
import com.atmecs.function_resuable.UserAction;

public class TestVerifyTitle {
    public static void main(String[] args) {

        // launch browser and website
        BaseLaunch.launch();
        //check expected title is equal actual title
        String expectedTitle= UserAction.getTitle();
        System.out.println("Expected Title"+" : "+expectedTitle);
        VerifyTitle.verifyPageTitle(expectedTitle);
    }
}
