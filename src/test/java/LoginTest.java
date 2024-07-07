import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class LoginTest extends BaseTest {
    String resultadoEsperado = "Bem vindo!";

    @Test
    public void validarLogin(){
        LoginPage page = new LoginPage(getDriver());

        String resultadoFinal = page.informarLogin("130.223.930-15")
                .informarSenha("12345678")
                .clicarEntrar()
                .buscarCadastroSucesso();

        //verificando o login aguardando a mensagem de "bem vindo" aparecer
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]/span")));

        WebElement resultadoEncontrado = driver.findElement(By.xpath("//*[@id=\"login\"]/span"));
        String resultadoLoginSucesso = resultadoEncontrado.getText();

        Assert.assertEquals(resultadoEsperado, resultadoLoginSucesso);
    }


}
