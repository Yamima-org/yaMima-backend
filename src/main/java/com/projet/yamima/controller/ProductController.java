package com.projet.yamima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.yamima.model.Image;
import com.projet.yamima.model.Product;
import com.projet.yamima.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	public ProductService productService;

	@RequestMapping(value = "/ajouterProduct", method = RequestMethod.POST)
	public Product ajouterProduct(@RequestBody Product product) {

		return (Product) productService.ajouterProduit(product);
	}

	

//	@RequestMapping(value = "/modfierProduct", method = RequestMethod.POST)
//
//	public Product modifierProduct(@PathVariable Integer id ,@RequestBody Product product) {
//		return (Product) productService.modifierProuit(id , product);
//	}
//
	@RequestMapping(value = "/supprimerProduct", method = RequestMethod.POST)

	public void supprimerProduct(@RequestBody Product product) {
		  productService.supprimerProduit(product);
	}

}
