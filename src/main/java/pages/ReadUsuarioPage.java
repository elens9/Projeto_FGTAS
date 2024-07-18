package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReadUsuarioPage extends BasePage {
    public ReadUsuarioPage(WebDriver driver) {
        super(driver);
    }

    //listando usuarios com n nome
    @FindBy(id = "nomeUsuario")
    private WebElement txtNomeUsuario;

    //inserindo o nome quee vai filtar
    public ReadUsuarioPage filtrarNome(String nome){
        txtNomeUsuario.sendKeys(nome);
        return this;
    }

    //buscando o botao que lista todos os usuarios
    @FindBy(id = "listar-usuarios")
    private WebElement btnListarUsuarios;

    //clicando no botao que vai mostrar a lista
    public ReadUsuarioPage listarUsuarios(){
        btnListarUsuarios.click();
        return this;
    }

    //verificando alteração na página
    public String buscarListagemSucesso(){
        return driver.getPageSource();
    }
}
