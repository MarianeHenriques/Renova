package Login;


import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exemplo {
    WebDriver navegador;


    @Before
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Just\\AppData\\Local\\Temp\\Rar$EXa12072.11793\\chromedriver.exe");
        navegador = new ChromeDriver();


    }


    public void realiza_login(){
        navegador.manage().window().maximize();
        navegador.get("http://w4b-hml.squadra.com.br/Renova/sites/operacional");
        navegador.findElement(By.name("Login")).sendKeys("gabriel.leal@justdigital.com.br");
        navegador.findElement(By.id("Password")).sendKeys("@Adm2022");
        navegador.findElement(By.cssSelector("button.btn.btn-submit.btn-block.text-uppercase.mb-2.shadow-sm.font-defaut")).click();
        navegador.get("https://w4b-hml.squadra.com.br/Renova/sites/operacional/ProcessList");

    }


}
