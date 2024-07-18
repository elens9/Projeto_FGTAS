package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateUsuarioPage extends BasePage {

    public UpdateUsuarioPage(WebDriver driver){
        super(driver);
    }

    //procurando o campo nome pelo id
    @FindBy(id = "nomeUsuario")
    private WebElement editarNomeUsuario;

    //enviando o nome
    public UpdateUsuarioPage informarNomeUsuario(String nomeEditado){
        editarNomeUsuario.sendKeys(nomeEditado);
        return this;
    }

    //procurando o campo email
    @FindBy(id = "emailUsuario")
    private WebElement editarEmailUsuario;

    //enviando o email
    public UpdateUsuarioPage informarEmailUsuario(String emailEditado){
        editarEmailUsuario.sendKeys(emailEditado);
        return this;
    }

    //procurando o campo login
    @FindBy(id = "loginUsuario")
    private WebElement editarLogin;

    //enviando login
    public UpdateUsuarioPage informarLoginUsuario(String loginEditado){
        editarLogin.sendKeys(loginEditado);
        return this;
    }

    //procurando campo senha
    @FindBy(id = "senhaUsuario")
    private WebElement editarSenha;

    //enviando senha
    public UpdateUsuarioPage informarSenhaUsuario(String senhaEditada){
        editarSenha.sendKeys(senhaEditada);
        return this;
    }


    //buscando o campo telefone
    @FindBy(id = "telefoneCelular")
    private WebElement editarTelefone;

    //enviando o telefone
    public UpdateUsuarioPage informarTelefoneCelular(String telefoneCelularEditado){
        editarTelefone.sendKeys(telefoneCelularEditado);
        return this;
    }


    //buscando o botão editar
    @FindBy(id = "editar")
    private WebElement btnEditarUsuario;

    //clicando em editar usuario
    public UpdateUsuarioPage clicarEditar(){
        btnEditarUsuario.click();
        return this;
    }

    //verificando o resultado
    public String buscarEditarSucesso(){return driver.getPageSource();}



}


