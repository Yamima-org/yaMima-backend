package com.projet.yamima.service;

import java.util.List;

import com.projet.yamima.model.Image;
import com.projet.yamima.model.Product;

public interface ProductService {

	
	public Product ajouterProduit (Product product) ; 
//	public Product modifierProuit( Integer id , Product product) ; 
	public void supprimerProduit(Product product) ;
}
