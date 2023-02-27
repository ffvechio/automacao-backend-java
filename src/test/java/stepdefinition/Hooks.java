package stepdefinition;

import commons.APIMethods;
import io.cucumber.java.Before;

public class Hooks {
    public static APIMethods api;

    @Before("@backend")
    public void beforeBackEndTest() {
        if (Hooks.api == null)
            Hooks.api = new APIMethods();
    }

}
