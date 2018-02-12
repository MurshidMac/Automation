package com.daemon.wordpress;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;

@Config(
        browser = Browser.CHROME,
        url="https://daemonxz.wordpress.com/"
)

public class TestDeamon extends Locomotive {
    //first Test
    @Test
    public void aboutTest(){
        // Here goes the id and the invoking
        click("menu-item-142").click(By.xpath("You can also use different locators "));
    }
}
