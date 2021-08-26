package com.sapiensacademytest.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartRepository {
	
	public CartRepository(WebDriver navegador) 
	{
		this.driver = navegador;
	}
	
	WebDriver driver;
	
	By homeFeatured = By.id("homefeatured");
	By ListaElementos = By.tagName("li");
	By addToCartButton = By.linkText("Add to cart");
	
	public WebElement homefeatureElement() {
		return driver.findElement(homeFeatured);
	}

}
