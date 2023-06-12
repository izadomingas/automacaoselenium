package br.gov.mt.gat.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

@DisplayName("Testes Automatizados da funcionalidade de Fazer Login")

public class LoginTest {
        @Test
        @DisplayName("Fazer Login com dados válidos")
        public void testLoginComDadosValidos() throws InterruptedException {
            //Vou abrir o Chrome
            WebDriverManager.chromedriver().setup();
            WebDriver navegador = new ChromeDriver();
            // navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));


            //Take the screenshot
            File screenshot = ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);

            //Copy the file to a location and use try catch block to handle exception
            try {
                FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            //Abrir o sistema GAT
            navegador.get("https://gat.loglabprojetos.com.br/");
            //navegador.manage().window().fullscreen();

            navegador.findElement(By.id("outlined-adornment-email")).sendKeys("admin_gat");
            navegador.findElement(By.id("outlined-adornment-password")).sendKeys("Gat2023");
            navegador.findElement(By.cssSelector("h3")).click();
            navegador.findElement(By.cssSelector("#__next > div > div > div > div > button")).click();
            JavascriptExecutor jse = (JavascriptExecutor)navegador;
             jse.executeScript("window.scrollTo(0,0)");
            ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);

            Thread.sleep(5000);
            navegador.quit();

           // navegador.findElement(By.cssSelector(".MuiAvatar-img")).click();
            //Assertions.assertEquals("Olá", saudacao);


        }
}
