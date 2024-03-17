import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTestForm {
    @Test
    void AutoInputForm () {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Egor");
    }
}
