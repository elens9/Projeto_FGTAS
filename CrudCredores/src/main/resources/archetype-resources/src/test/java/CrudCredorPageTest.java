import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CrudCredorPageTest {

    private WebDriver driver;
    private String baseUrl;

    @BeforeClass
    public void setUp() {
        // Definir o caminho do driver do Chrome
        System.setProperty("webdriver.chrome.driver", "caminho/para/seu/chromedriver.exe");

        // Inicializar o WebDriver
        driver = new ChromeDriver();

        // URL base da aplicação
        baseUrl = "www.aplicacao-desenv.com.br";

        // Maximizar a janela do navegador
        driver.manage().window().maximize();

        // Definir um timeout para aguardar elementos carregarem
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void testAdicionarCredorComSucesso() {
        // Abrir a página de login
        driver.get(baseUrl + "/login");

        // Simula o login

        // Cria uma instância da página de CRUD de Credores
        CrudCredorPage credorPage = new CrudCredorPage(driver);

        // Preencher os campos necessários para adicionar um credor
                .informarEmailCredor("Aprove@gmail.com")
                .informarUsuarioCredor("Aprove LTDA")
                .informarSenhaCredor("12345678")
                .informarCnpjCredor("12.345.678/0001-90")
                .selecionarDiaCadastro("06")
                .selecionarMesCadastro("Junho")
                .selecionarAnoCadastro("2024")
                .informarTelefoneCelular("(51) 3456-7890")
                .selecionarCredorAtivo()
                .clicarCadastrar();

        // Verificar se o cadastro foi realizado com sucesso
        String mensagem = credorPage.buscarCadastroSucesso();
        Assert.assertTrue(mensagem.contains("Credor criado com sucesso"), "Falha ao criar o credor.");
    }