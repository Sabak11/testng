package Example;

import Runner.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Listing extends ChromeRunner {

    @Test(enabled = true)
    public void ListingPage(){

        SoftAssert soft = new SoftAssert();

        $(byText("რეგისტრაცია")).click();
        soft.assertEquals("სწრაფი რეგისტრაცია", $(".registration-titles").getText());

        $("#firstName").setValue("Giga");
        soft.assertEquals("Dato", $("#firstName").getValue());

        $("#lastName").setValue("makaradze");
        sleep(3000);

        soft.assertAll();




    }

}
