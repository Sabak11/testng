package Runner;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Configuration;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.sleep;

public class ChromeRunner {

    @BeforeTest
    public void openbrowser(){
        Selenide.open("https://ee.ge");
        sleep(5000);
        Configuration.browserSize = "1920x1080";
    }

}
