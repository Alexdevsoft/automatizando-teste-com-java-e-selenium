import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        // Configura o driver do Chrome
        System.setProperty("webdriver.chrome.driver", "automacao-java-selenium/drivers/chrome");
        WebDriver driver = new ChromeDriver();

        // Navega até a página de login local
        driver.get("/web/index.html");

        // Localiza os elementos da página de login
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        // Insere os dados de login
        username.sendKeys("usuario_teste");
        password.sendKeys("senha_teste");

        // Clica no botão de login
        loginButton.click();

        // Verifica se o login foi bem-sucedido
        String expectedUrl = "/web/index.html"; // Ajuste conforme necessário
        if (driver.getCurrentUrl().equals(expectedUrl)) {
            System.out.println("Teste de login bem-sucedido!");
        } else {
            System.out.println("Teste de login falhou.");
        }

        // Fecha o navegador
        driver.quit();
    }
}
