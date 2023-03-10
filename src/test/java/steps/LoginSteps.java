package steps;

import io.cucumber.java.pt.Quando;
import org.junit.Test;
import page.LoginPage;
public class LoginSteps {
    @Test
    @Quando("fizer login usando {string} com {string} validos")
    public void fizer_login_usando_com_validos(String usuario, String senha) {
        LoginPage loginPage = new LoginPage();
        loginPage.LoginClickMenu();
        loginPage.LoginInpUsuario(usuario);
        loginPage.LoginInpSenha(senha);
    }
}
