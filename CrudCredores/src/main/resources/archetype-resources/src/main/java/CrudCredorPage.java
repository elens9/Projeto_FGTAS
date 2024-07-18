package archetype

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CrudCredorPage extends BasePage {

    public CrudCredorPagePage(WebDriver driver){super(driver);}

    //procurando o campo nome pelo id
    @FindBy(id = "nomeCredor")
    private WebElement txtNomeCredor;

    //enviando o nome
    public CrudCredorPagePage informarUsuarioCredor(String nome){
        txtNomeUsuario.sendKeys(nome);
        return this;
    }

    //procurando o campo email
    @FindBy(id = "emailCredor")
        private WebElement txtEmailCredor;

    //enviando o email
    public CrudCredorPagePage informarEmailCredor(String email){
        txtEmailUsuario.sendKeys(email);
        return this;
    }

    //procurando o campo login
    @FindBy(id = "loginCredor")
    private WebElement txtLoginUsuario;

    //enviando login
    public CrudCredorPagePage informarUsuarioCredor(String login){
        txtLoginUsuario.sendKeys(login);
        return this;
    }

    //procurando campo senha
    @FindBy(id = "senhaCredor")
    private WebElement txtSenhaCredor;

    //enviando senha
    public CrudCredorPagePage informarSenhaCredor(String senha){
        txtSenhaUsuario.sendKeys(senha);
        return this;
    }

    //buscando o dia do cadastro
    @FindBy(id = "dia")
    private WebElement selDia;

    //enviando o dia do cadastro
    public CrudCredorPage selecionarDiaCadastro(String diaCadastro){
        Select selectDia = new Select(selDia);
        selectDia.selectByVisibleText(diaCadastro);
        return this;
    }

    //buscando o mes do cadastro
    @FindBy(id = "mes")
    private WebElement selMes;

    //enviando o mes
    public CrudCredorPage selecionarMesCadastro(String mesCadastro){
        Select selectMes = new Select(selMes);
        selectMes.selectByVisibleText(mesCadastro);
        return this;
    }

    //buscando o ano do cadastro
    @FindBy(id = "ano")
    private WebElement selAno;

    //enviando o ano
    public CrudCredorPage selecionarAnoCadastro(String anoCadastro){
        Select selectAno = new Select(selAno);
        selectAno.selectByVisibleText(anoCadastro);
        return this;
    }
    // Procurando o campo CNPJ
    @FindBy(id = "cnpjCredor")
    private WebElement txtCnpjCredor;

    // Enviando o CNPJ
    public CrudCredorPage informarCnpjCredor(String cnpj){
        txtCnpjCredor.sendKeys(cnpj);
        return this;
    }

    //buscando o campo telefone
    @FindBy(id = "telefoneCelular")
    private WebElement txtTelefoneCelular;

    //enviando o telefone
    public CrudCredorPagePage informarTelefoneCelular(String telefoneCelular){
        txtTelefoneCelular.sendKeys(telefoneCelular);
        return this;
    }

    //buscando os campos de Credor ativo e inativo
    @FindBy(id = "ativo")
    private WebElement rdCredorAtivo;

    @FindBy(id = "inativo")
    private WebElement getRdCredorInativo;

    //selecionando Credor ativo
    public CrudCredorPage selecionarCredorAtivo(){
        rdCredorAtivo.click();
        return this;
    }

    //buscando o botão cadastrar
    @FindBy(id = "cadastrar")
    private WebElement btnCadastrar;

    //clicando em cadastrar Credor
    public CrudCredorPage clicarCadastrar(){
        btnCadastrar.click();
        return this;
    }

    //verificando o resultado
    public String buscarCadastroSucesso(){return driver.getPageSource();}





}