package GenericUtils;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtils {
	WebDriver driver;

	public WebDriverUtils(WebDriver driver) {
		this.driver = driver;

	}

	public void switchToWindowBasedOnTitle(String title) {
		Set<String> allwindowIds = driver.getWindowHandles();
		for (String windowId : allwindowIds) {
			driver.switchTo().window(windowId);
			if (driver.getTitle().equals(title)) {
				break;
			}
		}
	}

	public void switchToWindowBasedOnUrl(String url) {
		Set<String> allwindowIds = driver.getWindowHandles();
		for (String windowId : allwindowIds) {
			driver.switchTo().window(windowId);
			if (driver.getCurrentUrl().equals(url)) {
				break;
			}
		}
	}

	public void SwitchToAlertandClickOnOk() {
		driver.switchTo().alert().accept();
	}

	public void SwitchToAlertandClickOnCancle() {
		driver.switchTo().alert().dismiss();
	}

	public String getAlertText() {
		return driver.switchTo().alert().getText();
	}
	
	public void passValueForAlertTextBox(String data) {
		driver.switchTo().alert().sendKeys(data);
	}
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		
	}
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
}
