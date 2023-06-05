package br.gov.mt.gat.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

@DisplayName("Testes Automatizados da funcionalidade de Fazer Login")

public class LoginTest {
        @Test
        @DisplayName("Fazer Login com dados válidos")
        public void testLoginComDadosValidos() throws InterruptedException {
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
            navegador.findElement(By.cssSelector("#__next > div > div > div > div > button")).click();
            JavascriptExecutor jse = (JavascriptExecutor)navegador;
             jse.executeScript("window.scrollTo(0,0)");


            Thread.sleep(5000);
            navegador.quit();

           // navegador.findElement(By.cssSelector(".MuiAvatar-img")).click();
            //Assertions.assertEquals("Olá", saudacao);


        }
}
