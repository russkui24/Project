import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver", "C:\\tools\\operadriver\\operadriver.exe");
        OperaOptions options = new OperaOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--start-maximized");
        WebDriver driver = new OperaDriver(options);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();




        driver.get("https://95.213.144.152/crm-new-design/login");
        driver.findElement(By.xpath("//*[@name = 'login']")).sendKeys("Admin");
        driver.findElement(By.xpath("//button[normalize-space()='Enter']")).click();
        driver.findElement(By.xpath("//span[text() ='Работа с клиентом']")).click();// Ссылка на категорию Работа с клиентом
        driver.findElement(By.xpath("//input[@ id = 'childnamefilter_field']")).click();
        driver.findElement(By.xpath("//input[@ id = 'childnamefilter_field']")).sendKeys("маленький Властелинов");
        driver.findElement(By.xpath("/html/body/ul/li/a")).click(); // Из выпадающего списка выводится "Маленький властелинов" и кликаем по нему
        driver.findElement(By.xpath("//button[@ class = 'action-button']")).click();
        driver.findElement(By.xpath("//a[@ class = 'close']")).click();
        //driver.findElement(By.xpath("//*[@id=\"client.htm\"]/div[2]/a")).click(); Добавил для галочки
        //driver.findElement(By.xpath("//*[@id=\"childnamefilter_field\"]")).click();// Поле ввода Клиента
        //driver.findElement(By.xpath("//*[@id=\"childnamefilter_field\"]")).sendKeys("маленький Властелинов");




    }
}
