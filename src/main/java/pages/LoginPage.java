package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);}

    //buscando o campo login
    @FindBy(id = "loginUsuario")
    private WebElement txtLoginUsuario;

    //enviando o login
    public LoginPage informarLogin(String login){
        txtLoginUsuario.sendKeys(login);
        return this;
    }

    //buscando o campo senha
    @FindBy(id = "senhaUsuario")
    private WebElement txtSenhaUsuario;

    //enviando a senha
    public LoginPage informarSenha(String senha){
        txtSenhaUsuario.sendKeys(senha);
        return this;
    }

    //buscando o botao entrar
    @FindBy(id = "entrar")
    private WebElement btnEntrar;

    //clicando no botao entrar
    public LoginPage clicarEntrar(){
        btnEntrar.click();
        return this;
    }
    //verificando o resultado
    public String buscarCadastroSucesso(){return driver.getPageSource();}
}
