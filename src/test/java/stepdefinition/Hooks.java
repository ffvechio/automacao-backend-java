package stepdefinition;

import commons.APIMethods;
import cucumber.api.Scenario;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {
    public static APIMethods api;

    @Before("@backend")
    public void beforeBackEndTest() {
        if (Hooks.api == null)
            Hooks.api = new APIMethods();
    }

}
