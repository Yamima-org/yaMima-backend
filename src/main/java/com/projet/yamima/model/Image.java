package com.projet.yamima.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "image_id_seq")
    @SequenceGenerator(name = "image_id_seq", sequenceName = "image_id_seq", initialValue = 1, allocationSize = 1)
	  @Column(name = "idImage")
	public Integer idImage ;
	 @Column(name = "url")
	public String url;
	 @Column(name = "filename")
	public String filename;
	 @Column(name = "idImage")
    public String extensionimage;
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(Integer idImage, String url, String filename, String extensionimage) {
		super();
		this.idImage = idImage;
		this.url = url;
		this.filename = filename;
		this.extensionimage = extensionimage;
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
	@Override
	public String toString() {
		return "Image [idImage=" + idImage + ", url=" + url + ", filename=" + filename + ", extensionimage="
				+ extensionimage + "]";
	}
}
