package com.projet.yamima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projet.yamima.model.Image;
import com.projet.yamima.model.Product;
import com.projet.yamima.model.ProductDTO;
import com.projet.yamima.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	public ProductService productService;

	@RequestMapping(value = "/ajouterProduct", method = RequestMethod.POST)
	public Product ajouterProduct(@RequestBody Product product) {

		return (Product) productService.ajouterProduit(product);
	}

	@RequestMapping(value = "/getProduct", method = RequestMethod.GET)
     public List<ProductDTO> getProduct() {
		List<ProductDTO> listProduct = productService.findAll() ;
		return listProduct ;
	}

	@RequestMapping(value = "/supprimerProduct", method = RequestMethod.POST)

	public void supprimerProduct(@RequestBody Product product) {
		productService.supprimerProduit(product);
	}

}
