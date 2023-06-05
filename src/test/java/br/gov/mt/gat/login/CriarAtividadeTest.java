package br.gov.mt.gat.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes Automatizados da funcionalidade de Criar atividade")

public class CriarAtividadeTest {
    @Test
    @DisplayName("Criar atividade com dados válidos")
    public void testCriarAtividadeComDadosValidos() throws InterruptedException {

        //Vou abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        // navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        //Abrir o sistema GAT

        navegador.get("http://localhost:3000/");
        //navegador.manage().window().fullscreen();
        navegador.findElement(By.id("outlined-adornment-email")).sendKeys("admin_gat");
        navegador.findElement(By.id("outlined-adornment-password")).sendKeys("Gat2023");
        navegador.findElement(By.cssSelector("h3")).click();
        navegador.findElement(By.cssSelector(".MuiButton-contained")).click();
        JavascriptExecutor jse = (JavascriptExecutor)navegador;
        jse.executeScript("window.scrollTo(0,0)");

        Thread.sleep(5000);

        navegador.findElement(By.cssSelector("#__next > div > div:nth-child(4) > div > div > div > div.BottomNav_center_buttom__85g9S > button")).click();
        Thread.sleep(5000);

        jse.executeScript("window.scrollTo(0,0)");
        navegador.findElement(By.id("outlined-required")).click();


       // 11 | click | id=outlined-required |
        navegador.findElement(By.id("outlined-required")).click();
        // 12 | type | id=outlined-required | Luiz
        navegador.findElement(By.id("outlined-required")).sendKeys("Luiz");
        // 13 | type | name=atividade_titulo | Teste Automatizado
        navegador.findElement(By.name("atividade_titulo")).sendKeys("Teste Automatizado");
        // 14 | click | id=outlined-multiline-static |
        navegador.findElement(By.id("outlined-multiline-static")).click();
        // 15 | type | id=outlined-multiline-static | Realizando teste Automatizado
        navegador.findElement(By.id("outlined-multiline-static")).sendKeys("Realizando teste Automatizado");
        jse.executeScript("window.scrollTo(2000,2000)");
        Thread.sleep(5000);
        navegador.findElement(By.cssSelector("div.MuiStack-root:nth-child(4) > div:nth-child(1) > div")).click();
        navegador.findElement(By.cssSelector(".MuiMenuItem-root:nth-child(2)")).click();

        navegador.findElement(By.cssSelector(".MuiIconButton-edgeEnd")).click();
        navegador.findElement(By.cssSelector("div.MuiDayCalendar-weekContainer:nth-child(4) > button:nth-child(4)")).click();

        navegador.findElement(By.cssSelector("div.MuiStack-root:nth-child(5) > div:nth-child(1) > div")).click();
        navegador.findElement(By.cssSelector(".MuiMenuItem-root:nth-child(2)")).click();

        navegador.findElement(By.id("botao-confirmar")).click();

    }

}
