import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    class Main {
        public static void main(String[] args) {

            System.setProperty("webdriver.gecko.driver","C:\\Users\\Prospero\\Desktop\\foxdriver\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();

            String baseUrl = "http://demo.guru99.com/test/newtours/";
            String expectedTitle = "Welcome: Mercury Tours";
            String actualTitle = "";

            driver.get(baseUrl);


            actualTitle = driver.getTitle();

            if (actualTitle.contentEquals(expectedTitle)){
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed");
            }

            driver.close();

        }
    }


