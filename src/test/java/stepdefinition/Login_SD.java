package stepdefinition;


import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import pojos.login.Login;

public class Login_SD {

    public Login login = new Login();
    private String LoginToken;

    @Dado("^que informo os dados de login \"([^\"]*)\" \"([^\"]*)\"$")
    public void enterLoginData(String email, String password) throws Throwable {
        login.setEmail(email);
        login.setPassword(password);

        Hooks.api.buildRequest(login);
    }

    @Então("^o serviço retorna o token na respota$")
    public void tokenLogin() {
        LoginToken = Hooks.api.response.then().extract().path("token").toString();

        System.out.println("Token de login criado com sucesso:" + " " + LoginToken);

    }

}
