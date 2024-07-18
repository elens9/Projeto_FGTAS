import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateUsuarioPage;
import pages.UpdateUsuarioPage;

import java.time.Duration;

public class UpdateUsuarioTest extends BaseTest {
    String resultadoEsperado = "Usuário editado com sucesso!";
    UpdateUsuarioPage page = new UpdateUsuarioPage(getDriver());

    @Test
    public void validarEdicao () {


        String resultadoFinal = page.informarNomeUsuario("Elen Sant'Anna Filipeto")
                .informarEmailUsuario("elensantanna1011@gmail.com")
                .informarLoginUsuario("130.223.930-15")
                .informarSenhaUsuario("12345678")
                .informarTelefoneCelular("51 99999-0000")
                .clicarEditar()
                .buscarEditarSucesso();

        //validando o cadastro esperando uma mensagem de "usuário editado com sucesso"
        //xpaths ilustrativos
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultado-editar\"]/span")));

        WebElement resultadoEncontrado = driver.findElement(By.xpath("//*[@id=\"resultado-editar\"]/span"));

        String editado = resultadoEncontrado.getText();
        Assert.assertEquals(resultadoEsperado, editado);

        //possibilidade de testar elemento por elemento
//        Assert.assertTrue(resultadoFinal.contains("Nome do Usuário: Elen Sant'Anna Filipeto"));
//        Assert.assertTrue(resultadoFinal.contains("Email: elensantana1011@gmail.com"));
//        Assert.assertTrue(resultadoFinal.contains("Login: 130.223.930-15"));
//        Assert.assertTrue(resultadoFinal.contains("Senha: 12345678"));
//        Assert.assertTrue(resultadoFinal.contains("Dia: 11"));
//        Assert.assertTrue(resultadoFinal.contains("Mês: Dezembro"));
//        Assert.assertTrue(resultadoFinal.contains("Ano: 1998"));
//        Assert.assertTrue(resultadoFinal.contains("Telefone celular: 51 99999-0000"));
//        Assert.assertTrue(resultadoFinal.contains("Usuário ativo?: Sim"));
    }



}

}
