package com.sapiensacademytest.repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class CartRepository {
	
	public CartRepository(WebDriver navegador) 
	{
		this.driver = navegador;
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver;
	
	@FindBy(id="homefeatured")
	WebElement homeFeatured;

	@FindBys({@FindBy(tagName="li")})
	List<WebElement> listaElementos;
	
	@FindBy(xpath= "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	WebElement ventanaPopUp;
	
	//By homeFeatured = By.id("homefeatured");
	//By listaElementos = By.tagName("li");
	By addToCartButton = By.linkText("Add to cart"); // NO COPIAR ESTO: esta linea se los dejo de tarea para cambiarla a anotación
	//By ventanaPopUp = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
	
	
	public WebElement homefeatureElement() {
		return homeFeatured;
	}
	
	public List<WebElement> listarElementos(WebElement contenedorProductos) {
		PageFactory.initElements(new DefaultElementLocatorFactory(contenedorProductos), this);
		return listaElementos;
	}
	
	public WebElement addToCart(WebElement productoLista) {
		return productoLista.findElement(addToCartButton);
	}
	
	public WebElement elementoVentanaPopUp() {
		return ventanaPopUp;
	}
}
