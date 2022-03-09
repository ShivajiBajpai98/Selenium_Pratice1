package com.atmecs.datafile;


import com.atmecs.properties.PropertyManager;

public class Locators {
    public static String page_Present_Rel_Xpath;
    public static String search_TextBox_Rel_Xpath;
    public static String search_button;
    public static String result_Found_Rel_Xpath;
    public static String getAll_price_Rel_Xpath;




    public static void locators() {
        page_Present_Rel_Xpath = PropertyManager.getInstance().getPage_Present_Rel_Xpath();
        search_TextBox_Rel_Xpath=PropertyManager.getInstance().getSearch_TextBox_Rel_Xpath();
        search_button=PropertyManager.getInstance().getSearch_button();
        result_Found_Rel_Xpath=PropertyManager.getInstance().getResult_Found_Rel_Xpath();
        getAll_price_Rel_Xpath=PropertyManager.getInstance().getAll_price_Rel_Xpath();



      }


}


