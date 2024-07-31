package Element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
@FindBy(partialLinkText = "REGISTER")
public WebElement registerLink;

@FindBy(partialLinkText = "LOG IN")
public WebElement loginLink;

@FindBy(partialLinkText = "SHOPPING CART")
public WebElement ShoppingcartLink;

@FindBy(partialLinkText = "WISHLIST")
public WebElement WishlistLink;

@FindBy(partialLinkText = "BOOKS")
public WebElement BooksLink;

@FindBy(partialLinkText = "COMPUTERS")
public WebElement ComputersLink;

@FindBy(partialLinkText = "ELECTRONICS")
public WebElement ElectronicsLink;

@FindBy(partialLinkText = "APPAREL & SHOES")
public WebElement ApparelAndShoesLink;

@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
public WebElement DigitaldownloadsLink;

@FindBy(partialLinkText = "JEWELRY")
public WebElement JewelryLink;

@FindBy(partialLinkText = "GIFT CARDS")
public WebElement GiftCardsLink;

@FindBy(id = "small-searchterms")
public WebElement searchBox;

@FindBy(xpath = "//input[@value='Search']")
public WebElement searchButton;

public BasePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getRegisterLink() {
	return registerLink;
}

public WebElement getLoginLink() {
	return loginLink;
}

public WebElement getShoppingcartLink() {
	return ShoppingcartLink;
}

public WebElement getWishlistLink() {
	return WishlistLink;
}

public WebElement getBooksLink() {
	return BooksLink;
}

public WebElement getComputersLink() {
	return ComputersLink;
}

public WebElement getElectronicsLink() {
	return ElectronicsLink;
}

public WebElement getApparelAndShoesLink() {
	return ApparelAndShoesLink;
}

public WebElement getDigitaldownloadsLink() {
	return DigitaldownloadsLink;
}

public WebElement getJewelryLink() {
	return JewelryLink;
}

public WebElement getGiftCardsLink() {
	return GiftCardsLink;
}

public WebElement getSearchBox() {
	return searchBox;
}

public WebElement getSearchButton() {
	return searchButton;
}










}
