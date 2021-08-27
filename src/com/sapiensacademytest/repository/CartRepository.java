package com.sapiensacademytest.repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartRepository {
	
	public CartRepository(WebDriver navegador) 
	{
		this.driver = navegador;
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver;
	
	@FindBy(id="homefeatured")
	WebElement homeFeatured;
	
	//By homeFeatured = By.id("homefeatured");
	By listaElementos = By.tagName("li");
	By addToCartButton = By.linkText("Add to cart");
	By ventanaPopUp = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
	
	
	public WebElement homefeatureElement() {
		return homeFeatured;
	}
	
	public List<WebElement> listarElementos(WebElement contenedorProductos) {
		return contenedorProductos.findElements(listaElementos);
	}
	
	public WebElement addToCart(WebElement productoLista) {
		return productoLista.findElement(addToCartButton);
	}
	
	public By elementoVentanaPopUp() {
		return ventanaPopUp;
	}
}
