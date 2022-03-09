package com.atmecs.datafile;


import com.atmecs.properties.PropertyManager;

public class User {
    public static String item;



    public static void userDetails()
    {
        item= PropertyManager.getInstance().getItem();



    }
}
