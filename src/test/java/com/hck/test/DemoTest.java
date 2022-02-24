package com.hck.test;

import com.hck.config.FrameworkConfig;
import com.hck.factories.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * added On: 22/02/2022 - 23:48
 *
 * @author hkavuri
 * @version 1.0
 * @since 1.0
 */
public class DemoTest {

    @Test
    public void testLogin() throws InterruptedException {

        System.out.println(ConfigFactory.getConfig().browser());
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.quit();

    }
}
