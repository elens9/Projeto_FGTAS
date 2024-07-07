package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class CrudUsuarioPage extends BasePage {

    public CrudUsuarioPage(WebDriver driver){super(driver);}

    //procurando o campo nome pelo id
    @FindBy(id = "nomeUsuario")
    private WebElement txtNomeUsuario;

    //enviando o nome
    public CrudUsuarioPage informarNomeUsuario(String nome){
        txtNomeUsuario.sendKeys(nome);
        return this;
    }

    //procurando o campo email
    @FindBy(id = "emailUsuario")
        private WebElement txtEmailUsuario;

    //enviando o email
    public CrudUsuarioPage informarEmailUsuario(String email){
        txtEmailUsuario.sendKeys(email);
        return this;
    }

    //procurando o campo login
    @FindBy(id = "loginUsuario")
    private WebElement txtLoginUsuario;

    //enviando login
    public CrudUsuarioPage informarLoginUsuario(String login){
        txtLoginUsuario.sendKeys(login);
        return this;
    }

    //procurando campo senha
    @FindBy(id = "senhaUsuario")
    private WebElement txtSenhaUsuario;

    //enviando senha
    public CrudUsuarioPage informarSenhaUsuario(String senha){
        txtSenhaUsuario.sendKeys(senha);
        return this;
    }

    //buscando o dia do cadastro
    @FindBy(id = "dia")
    private WebElement selDia;

    //enviando o dia do cadastro
    public CrudUsuarioPage selecionarDiaCadastro(String diaCadastro){
        Select selectDia = new Select(selDia);
        selectDia.selectByVisibleText(diaCadastro);
        return this;
    }

    //buscando o mes do cadastro
    @FindBy(id = "mes")
    private WebElement selMes;

    //enviando o mes
    public CrudUsuarioPage selecionarMesCadastro(String mesCadastro){
        Select selectMes = new Select(selMes);
        selectMes.selectByVisibleText(mesCadastro);
        return this;
    }

    //buscando o ano do cadastro
    @FindBy(id = "ano")
    private WebElement selAno;

    //enviando o ano
    public CrudUsuarioPage selecionarAnoCadastro(String anoCadastro){
        Select selectAno = new Select(selAno);
        selectAno.selectByVisibleText(anoCadastro);
        return this;
    }

    //buscando o campo telefone
    @FindBy(id = "telefoneCelular")
    private WebElement txtTelefoneCelular;

    //enviando o telefone
    public CrudUsuarioPage informarTelefoneCelular(String telefoneCelular){
        txtTelefoneCelular.sendKeys(telefoneCelular);
        return this;
    }

    //buscando os campos de usuário ativo e inativo
    @FindBy(id = "ativo")
    private WebElement rdUsuarioAtivo;

    @FindBy(id = "inativo")
    private WebElement rdUsuarioInativo;

    //selecionandoo usuário ativo
    public CrudUsuarioPage selecionarUsuarioAtivo(){
        rdUsuarioAtivo.click();
        return this;
    }

    //buscando o botão cadastrar
    @FindBy(id = "cadastrar")
    private WebElement btnCadastrar;

    //clicando em cadastrar usuário
    public CrudUsuarioPage clicarCadastrar(){
        btnCadastrar.click();
        return this;
    }

    //verificando o resultado
    public String buscarCadastroSucesso(){return driver.getPageSource();}


}

