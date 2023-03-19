package com.projet.yamima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.yamima.model.Panier;
import com.projet.yamima.service.PanierService;

@RestController
public class PanierController {

	@Autowired
	 private PanierService panierService  ; 
	
	
	@RequestMapping(value = "/sauvegarderPanier", method = RequestMethod.POST)
	public Panier sauvegarderPanier(@RequestBody Panier panier) {
	    return panierService.sauvegarderPanier(panier);
	}
	
	
}
