package br.com.editoraglobo.examples;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

    private WebDriver driver;
    
    private WebElement searchBox;
    private WebElement searchResults;
    
    @BeforeEach
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }
    
    @Test
    public void search() {
        driver.get("https://www.google.com.br");

        searchBox = driver.findElement(By.cssSelector("[name='q']"));
        searchBox.sendKeys("Editora Globo");
        searchBox.submit();

        searchResults = driver.findElement(By.cssSelector("#search"));
        
        assertTrue(searchResults.isDisplayed());
        assertThat(driver.getTitle()).startsWith("Editora Globo");
    }

}
