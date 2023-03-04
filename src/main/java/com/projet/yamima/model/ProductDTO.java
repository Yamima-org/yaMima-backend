package com.projet.yamima.model;

import java.util.List;

public class ProductDTO {

	private Integer idProduct;
	private String nameproduct;
	private String ingredients;
	private Integer  price;
	private String description;
	private Boolean statut;
	private SizeProduct  sizeproduct;
    private List<ImageDTO> listImage;
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(Integer idProduct, String nameproduct, String ingredients, Integer price, String description,
			Boolean statut, SizeProduct sizeproduct, List<ImageDTO> listImage) {
		super();
		this.idProduct = idProduct;
		this.nameproduct = nameproduct;
		this.ingredients = ingredients;
		this.price = price;
		this.description = description;
		this.statut = statut;
		this.sizeproduct = sizeproduct;
		this.listImage = listImage;
	}
	public Integer getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}
	public String getNameproduct() {
		return nameproduct;
	}
	public void setNameproduct(String nameproduct) {
		this.nameproduct = nameproduct;
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
	public Boolean getStatut() {
		return statut;
	}
	public void setStatut(Boolean statut) {
		this.statut = statut;
	}
	public SizeProduct getSizeproduct() {
		return sizeproduct;
	}
	public void setSizeproduct(SizeProduct sizeproduct) {
		this.sizeproduct = sizeproduct;
	}
	public List<ImageDTO> getListImage() {
		return listImage;
	}
	public void setListImage(List<ImageDTO> listImage) {
		this.listImage = listImage;
	}
	
}
