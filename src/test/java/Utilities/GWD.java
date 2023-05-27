package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GWD {

    public static WebDriver driver;

    public static  WebDriver getDriver(){

        if (GWD.driver==null){

         GWD.driver=new ChromeDriver();

        }

        GWD.driver.manage().window().maximize();

        return GWD.driver;
    }

public static void quitDriver(){
        GWD.driver.close();
        GWD.driver=null;
}
}