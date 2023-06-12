package br.gov.mt.gat.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IteragirAtividadeTest {

    @Test
    @DisplayName("Iteragir atividade com dados válidos")
    public void testIteragirAtividadeComDadosValidos() throws InterruptedException {

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

        navegador.findElement(By.cssSelector(".Card_link__sCJOu:nth-child(3) .Card_qtd___WQhP")).click();
       // navegador.findElement(By.cssSelector(".CardTarefa_box__8W7vJ:nth-child(3) #long-button > .MuiSvgIcon-root")).click();
        //navegador.findElement(By.cssSelector(".MuiMenuItem-root:nth-child(1)")).click();


       /* {
            WebElement element = driver.findElement(By.id("demo-simple-select"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }*/
        /*{
            WebElement element = driver.findElement(By.cssSelector(".MuiBackdrop-invisible"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }*/
        navegador.findElement(By.cssSelector("body")).click();
        navegador.findElement(By.cssSelector(".Mui-selected")).click();


        jse.executeScript("window.scrollTo(2000,2000)");

        navegador.findElement(By.id("outlined-multiline-static")).click();
        navegador.findElement(By.id("outlined-multiline-static")).sendKeys("testando 123");
        navegador.findElement(By.cssSelector(".CardTarefa_confirmar__aaZ0E")).click();
        jse.executeScript("window.scrollTo(0,97.5999984741211)");
    }
    }
