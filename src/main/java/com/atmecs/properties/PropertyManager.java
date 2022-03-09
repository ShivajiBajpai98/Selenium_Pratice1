package com.atmecs.properties;



import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    private static PropertyManager instance;
    private static final Object lock = new Object();
    //private static String propertyFilePath=System.getProperty("user.dir") + "\\configuration.properties";
    private static String app_url;
    private static String page_Present_Rel_Xpath;
    private static String search_TextBox_Rel_Xpath;
    private static String search_button;
    private static String result_Found_Rel_Xpath;
    private static String all_price_Rel_Xpath;
    //user
    private static String item;





    //Create a Singleton instance. We need only one instance of Property Manager.
    public static PropertyManager getInstance() {
        if (instance == null) {
            synchronized (lock) {
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }

    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();

        //Read configuration.properties file
        try {
            //prop.load(new FileInputStream(propertyFilePath));
            prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }


        //Get properties from configuration.properties
        app_url = prop.getProperty("app_url");
        page_Present_Rel_Xpath=prop.getProperty("page_Present_Rel_Xpath");
        search_TextBox_Rel_Xpath=prop.getProperty("search_TextBox_Rel_Xpath");
        search_button=prop.getProperty("search_button");
        result_Found_Rel_Xpath=prop.getProperty("result_Found_Rel_Xpath");
        all_price_Rel_Xpath=prop.getProperty("all_price_Rel_Xpath");
        //user
        item=prop.getProperty("item");




    }

    public String getAppManageURL() {return app_url;}
    public String getPage_Present_Rel_Xpath(){return page_Present_Rel_Xpath;}
    public String getSearch_TextBox_Rel_Xpath(){return search_TextBox_Rel_Xpath;}
    public String getSearch_button(){return search_button;}
    public String getResult_Found_Rel_Xpath(){return result_Found_Rel_Xpath;}
    public String getAll_price_Rel_Xpath(){return all_price_Rel_Xpath;}
    //user
    public String getItem(){return item;}

}