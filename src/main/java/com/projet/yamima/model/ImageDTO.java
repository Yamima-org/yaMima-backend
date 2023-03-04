package com.projet.yamima.model;

public class ImageDTO {
	
	private Integer idImage ; 
	private String url ;
	private String filename ;
	private String extensionimage ;
	public ImageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ImageDTO(Integer idImage, String url, String filename, String extensionimage) {
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
	
	
}
