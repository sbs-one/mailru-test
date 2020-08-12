package yandexImages;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;

public class YandexImages {

    @Before
    public void setConfig() {
        //Configuration.holdBrowserOpen = true;

    }


    @Test
    public void checkCrane() {
        open("https://yandex.ru/");

        $(byCssSelector("[data-id='images']")).click();
        switchTo().window(1);
        $(byCssSelector(".icon_type_cbir")).click();
        $(byCssSelector(".input_type_cbir")).click();
        actions().sendKeys("https://upload.wikimedia.org/wikipedia/commons/7/7f/Autojerab-AD30.jpg").perform();
        $(By.xpath("//button[@name='cbir-submit']")).click();
        $(By.cssSelector(".CbirTags")).$(byText("автокраны")).shouldBe(visible);



    }
}
