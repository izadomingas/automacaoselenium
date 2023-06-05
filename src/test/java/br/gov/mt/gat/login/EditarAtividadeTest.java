package br.gov.mt.gat.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditarAtividadeTest {

    @Test
    @DisplayName("Editar atividade com dados válidos")
    public void testEditarAtividadeComDadosValidos() throws InterruptedException {

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
        JavascriptExecutor jse = (JavascriptExecutor) navegador;
        jse.executeScript("window.scrollTo(2000,2000)");

        Thread.sleep(5000);

        navegador.findElement(By.cssSelector(".MuiButton-contained")).click();
        jse.executeScript("window.scrollTo(2000,2000)");
       // navegador.findElement(By.cssSelector("#__next > div > div:nth-child(3) > div > a:nth-child(3) > div > button > div")).click();
        navegador.findElement(By.cssSelector(".Card_link__sCJOu:nth-child(3) .Card_qtd___WQhP")).click();
        navegador.findElement(By.cssSelector("body > next-route-announcer")).click();
       // navegador.

        //navegador.findElement(By.cssSelector(".MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation1.MuiPaper-root.MuiMenu-paper.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation8.MuiPopover-paper.css-1poimk-MuiPaper-root-MuiMenu-paper-MuiPaper-root-MuiPopover-paper > ul > li:nth-child(2)")).click();
        Thread.sleep(5000);
        //navegador.findElement(By.cssSelector(".MuiPaper-root-MuiPopover-paper > ul > li:nth-child(2)")).click();
        jse.executeScript("window.scrollTo(2000,2000)");

        navegador.findElement(By.cssSelector(".MuiInputBase-multiline")).click();
      //  navegador.findElement(By.id("outlined-multiline-static")).sendKeys("fdafa aaa");
      //  navegador.findElement(By.id("botao-confirmar")).click();
      //  jse.executeScript("window.scrollTo(0,0)");



    }
}
