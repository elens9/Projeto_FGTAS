import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ReadUsuarioPage;

import java.time.Duration;

public class ReadUsuarioTest extends BaseTest {
    ReadUsuarioPage page = new ReadUsuarioPage(getDriver());
    String resultadoEsperado = "Listagem de usuário realizada com sucesso!";

    @Test
    public void validarListagem(){

        String resultado = page.filtrarNome("João Santos")
                .listarUsuarios()
                .buscarListagemSucesso();


        //verificando se é exibida a mensagem de usuarios listados com sucesso
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultado-listagem\"]/span")));

        WebElement resultadoEncontrado = driver.findElement(By.xpath("//*[@id=\"resultado-listagem\"]/span"));

        String listado = resultadoEncontrado.getText();
        Assert.assertEquals(resultadoEsperado, listado);

        //verificando de outra forma
        Assert.assertTrue(resultado.contains(("Nome do usuário: João Santos")));
    }



}
