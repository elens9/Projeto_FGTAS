import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateUsuarioPage;

import java.time.Duration;

public class CreateUsuarioTest extends BaseTest {
    String resultadoEsperado = "Usuário cadastrado com sucesso!";
    CreateUsuarioPage page = new CreateUsuarioPage(getDriver());

    @Test
    public void validarCadastro () {


        String resultadoFinal = page.informarNomeUsuario("Elen Sant'Anna Filipeto")
                .informarEmailUsuario("elensantanna1011@gmail.com")
                .informarLoginUsuario("130.223.930-15")
                .informarSenhaUsuario("12345678")
                .selecionarDiaCadastro("11")
                .selecionarMesCadastro("Dezembro")
                .selecionarAnoCadastro("1998")
                .informarTelefoneCelular("51 99999-0000")
                .selecionarUsuarioAtivo()
                .clicarCadastrar()
                .buscarCadastroSucesso();

        //validando o cadastro esperando uma mensagem de "usuário cadastrado com sucesso"
        //xpaths ilustrativos
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"resultado\"]/span")));

        WebElement resultadoEncontrado = driver.findElement(By.xpath("//*[@id=\"resultado\"]/span"));

        String cadastroComSucesso = resultadoEncontrado.getText();
        Assert.assertEquals(resultadoEsperado, cadastroComSucesso);

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
