package com.projet.yamima.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.yamima.dao.ProductDAO;
import com.projet.yamima.model.Image;
import com.projet.yamima.model.ImageDTO;
import com.projet.yamima.model.Product;
import com.projet.yamima.model.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductDAO productDAO;

	@Override
	public Product ajouterProduit(Product product) {
		// TODO Auto-generated method stub

		Product saveProduct = productDAO.save(product);
		List<Image> saveImage = saveProduct.getImages();
		for (Image image : saveImage) {
			image.setProduct(new Product());
//			image.setProduct(saveProduct);
			image.getProduct().setIdProduct(saveProduct.getIdProduct());

			productDAO.save(image);

		}
		return saveProduct;
	}

	@Override
	public void supprimerProduit(Product product) {
		// TODO Auto-generated method stub
		productDAO.delete(product);
		;
	}

	@Override
	public List<ProductDTO> findAll() {
		List<Product> listProduct = (List<Product>) productDAO.findAll();
		List<ProductDTO> productDTO = new ArrayList<ProductDTO>();
		List<ImageDTO> listImageDto = new ArrayList<ImageDTO>();

		for (Product prod : listProduct) {
			ProductDTO prodDto = new ProductDTO() ; 
			prodDto.setIdProduct(prod.getIdProduct());
			prodDto.setDescription(prod.getDescription());
			prodDto.setIngredients(prod.getIngredients());
			prodDto.setNameproduct(prod.getNameproduct());
			prodDto.setPrice(prod.getPrice());
			prodDto.setSizeproduct(prod.getSizeproduct());
			prodDto.setStatut(prod.getStatut());
			List<Image> listImage = prod.getImages();
			for(Image img : listImage) {
			ImageDTO imgDTO = new ImageDTO();
			imgDTO.setExtensionimage(img.getExtensionimage());
			imgDTO.setFilename(img.getFilename());
			imgDTO.setIdImage(img.getIdImage());
			imgDTO.setUrl(img.getUrl());
			listImageDto.add(imgDTO);
			
			}
			prodDto.setListImage(listImageDto);
			productDTO.add(prodDto)	;
		}
		return productDTO;
	}

}
