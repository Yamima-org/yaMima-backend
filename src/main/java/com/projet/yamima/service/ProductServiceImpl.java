package com.projet.yamima.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.yamima.dao.ProductDAO;
import com.projet.yamima.model.Image;
import com.projet.yamima.model.Product;

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
//			image.getProduct().setNameProduct(saveProduct.getNameProduct());
//			image.getProduct().setIngredients(saveProduct.getIngredients());
//			image.getProduct().setPrice(saveProduct.getPrice());
//			image.getProduct().setSizeProduct(saveProduct.getSizeProduct());
//			image.getProduct().setStatut(saveProduct.getStatut());
//			image.getProduct().setDescription(saveProduct.getDescription());
			
//			ArrayList<Image> imageFinal = new ArrayList();
//			imageFinal.add(image);
			productDAO.save(image);
			
		}
		return saveProduct;
	}




//	@Override
//	public Product modifierProuit(Integer id , Product product) {
//		Product exectingProduct = productDAO.findById(id).get();
//		exectingProduct.setDescription(product.getDescription());
//		exectingProduct.setImages(product.getImages());
//		exectingProduct.setIngredients(product.getIngredients());
//		exectingProduct.setNameProduct(product.getNameProduct());
//		exectingProduct.setPrice(product.getPrice());
//		exectingProduct.setSizeProduct(product.getSizeProduct());
//		exectingProduct.setStatut(product.getStatut());
//		return null;
//	}
//
//	
//
	@Override
	public void  supprimerProduit(Product product) {
		// TODO Auto-generated method stub
		 productDAO.delete(product);;
	}

}
