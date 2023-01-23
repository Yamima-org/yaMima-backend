package com.projet.yamima.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

public class Product {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_seq")
    @SequenceGenerator(name = "product_id_seq", sequenceName = "product_id_seq", initialValue = 1, allocationSize = 1)
	  @Column(name = "idproduct")
	public Integer idProduct ; 
	@ManyToOne
	@JoinColumn(name = "url",insertable = false, updatable = false)
	public Image images ; 
	@Column(name = "namepoduct")
	public String  nameProduct ; 
	@Column(name = "ingredients")
	public String ingredients ; 
	@Column(name = "price")
	public Integer price ; 
	@Column(name = "description")
	public String description ; 
	@Column(name = "statut")
	public Status statut  ; 
	@Column(name = "sizeprodcut")
	public SizeImage  sizeProduct  ;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer idProduct, Image images, String nameProduct, String ingredients, Integer price,
			String description, Status statut, SizeImage sizeProduct) {
		super();
		this.idProduct = idProduct;
		this.images = images;
		this.nameProduct = nameProduct;
		this.ingredients = ingredients;
		this.price = price;
		this.description = description;
		this.statut = statut;
		this.sizeProduct = sizeProduct;
	}
	public Integer getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}
	public Image getImages() {
		return images;
	}
	public void setImages(Image images) {
		this.images = images;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Status getStatut() {
		return statut;
	}
	public void setStatut(Status statut) {
		this.statut = statut;
	}
	public SizeImage getSizeProduct() {
		return sizeProduct;
	}
	public void setSizeProduct(SizeImage sizeProduct) {
		this.sizeProduct = sizeProduct;
	}
	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", images=" + images + ", nameProduct=" + nameProduct
				+ ", ingredients=" + ingredients + ", price=" + price + ", description=" + description + ", statut="
				+ statut + ", sizeProduct=" + sizeProduct + "]";
	} 
	
	
	
	
}
