package com.projet.yamima.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_seq")
	@SequenceGenerator(name = "product_id_seq", sequenceName = "product_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "idproduct")
	private Integer idProduct;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "product" , fetch = FetchType.LAZY)
	private List<Image> images;

	@Column(name = "ingredients")
	private String ingredients;
	@Column(name = "price")
	private Integer price;
	@Column(name = "description")
	private String description;
	@Column(name = "statut")
	private Boolean statut;
	@Column(name = "sizeproduct")
	@Enumerated(EnumType.STRING)
	private SizeProduct sizeproduct;
	@Column(name = "nameproduct")
	private String nameproduct;

	private String category;
	private Integer rating;

	@ManyToOne
	@JoinColumn(name = "idimage",referencedColumnName = "idimage")
	private Image mainImage;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer idProduct, List<Image> images, String ingredients, Integer price, String description,
			Boolean statut, SizeProduct sizeproduct, String nameproduct) {
		super();
		this.idProduct = idProduct;
		this.images = images;
		this.ingredients = ingredients;
		this.price = price;
		this.description = description;
		this.statut = statut;
		this.sizeproduct = sizeproduct;
		this.nameproduct = nameproduct;
	}
	public Integer getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}
	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
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

	public String getNameproduct() {
		return nameproduct;
	}

	public void setNameproduct(String nameproduct) {
		this.nameproduct = nameproduct;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Image getMainImage() {
		return mainImage;
	}

	public void setMainImage(Image mainImage) {
		this.mainImage = mainImage;
	}

}
