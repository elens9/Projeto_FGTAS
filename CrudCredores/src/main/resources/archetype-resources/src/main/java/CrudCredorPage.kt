package archetype;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CrudCredorPage extends BasePage {

    public CrudCredorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "nomeCredor")
    private WebElement txtNomeCredor;

    public CrudCredorPage informarNomeCredor(String nome) {
        txtNomeCredor.sendKeys(nome);
        return this;
    }

    @FindBy(id = "emailCredor")
    private WebElement txtEmailCredor;

    public CrudCredorPage informarEmailCredor(String email) {
        txtEmailCredor.sendKeys(email);
        return this;
    }

    @FindBy(id = "loginCredor")
    private WebElement txtLoginCredor;

    public CrudCredorPage informarLoginCredor(String login) {
        txtLoginCredor.sendKeys(login);
        return this;
    }

    @FindBy(id = "senhaCredor")
    private WebElement txtSenhaCredor;

    public CrudCredorPage informarSenhaCredor(String senha) {
        txtSenhaCredor.sendKeys(senha);
        return this;
    }

    @FindBy(id = "cnpjCredor")
    private WebElement txtCnpjCredor;

    public CrudCredorPage informarCnpjCredor(String cnpj) {
        txtCnpjCredor.sendKeys(cnpj);
        return this;
    }

    @FindBy(id = "telefoneCredor")
    private WebElement txtTelefoneCredor;

    public CrudCredorPage informarTelefoneCredor(String telefone) {
        txtTelefoneCredor.sendKeys(telefone);
        return this;
    }

    @FindBy(id = "ativo")
    private WebElement rdCredorAtivo;

    public CrudCredorPage selecionarCredorAtivo() {
        rdCredorAtivo.click();
        return this;
    }

    @FindBy(id = "inativo")
    private WebElement rdCredorInativo;

    public CrudCredorPage selecionarCredorInativo() {
        rdCredorInativo.click();
        return this;
    }

    @FindBy(id = "btnCadastrar")
    private WebElement btnCadastrar;

    public CrudCredorPage clicarCadastrar() {
        btnCadastrar.click();
        return this;
    }

    public String buscarMensagemErro() {
        return driver.findElement(By.id("mensagemErro")).getText();
    }
}
