package com.atmecs.commons;


import com.atmecs.datafile.Locators;
import com.atmecs.datafile.User;

public class BaseLaunch {
    public static void launch ()
    {
        BaseCommons.launchBrowser("firefox");
        BaseCommons.navigateUrl();
        BaseCommons.windowMaximize();
        Locators.locators();
        User.userDetails();

    }
}
