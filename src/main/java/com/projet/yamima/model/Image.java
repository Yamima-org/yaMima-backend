package com.projet.yamima.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table (name = "image")
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "image_id_seq")
    @SequenceGenerator(name = "image_id_seq", sequenceName = "image_id_seq", initialValue = 1, allocationSize = 1)
	  @Column(name = "idimage")
	private Integer idImage ;
	 @Column(name = "url")
	 private String url;
	 @Column(name = "filename")
	 private String filename;
	 @Column(name = "extensionimage")
	 private String extensionimage;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="idproduct" , referencedColumnName = "idproduct")
	 private Product product ;
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(Integer idImage, String url, String filename, String extensionimage, Product product) {
		super();
		this.idImage = idImage;
		this.url = url;
		this.filename = filename;
		this.extensionimage = extensionimage;
		this.product = product;
	}
	public Integer getIdImage() {
		return idImage;
	}
	public void setIdImage(Integer idImage) {
		this.idImage = idImage;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getExtensionimage() {
		return extensionimage;
	}
	public void setExtensionimage(String extensionimage) {
		this.extensionimage = extensionimage;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Image [idImage=" + idImage + ", url=" + url + ", filename=" + filename + ", extensionimage="
				+ extensionimage + ", product=" + product + "]";
	} 
	
}
