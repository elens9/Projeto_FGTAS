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
        System.setProperty("webdriver.chrome.driver", "caminho/para/seu/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "www.aplicacao-desenv.com.b";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void testAdicionarCredorComCamposEmBranco() {
        driver.get(baseUrl + "/login");

        CrudCredorPage credorPage = new CrudCredorPage(driver);

        credorPage.informarNomeCredor("fulanodetal")
                .informarEmailCredor("fulanodetal@gmail.com")
                .selecionarCredorAtivo()
                .clicarCadastrar();

        String mensagemErro = credorPage.buscarMensagemErro();
        Assert.assertTrue(mensagemErro.contains("Todos os campos devem ser preenchidos"), "Mensagem de erro esperada não encontrada.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
