package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {

	public WebDriver driver;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToChild() {
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> I1 = windowHandles.iterator();
		String parentWindow = I1.next();
		String childWindow = I1.next();
		driver.switchTo().window(childWindow);

	}

}
