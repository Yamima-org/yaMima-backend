package com.projet.yamima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.yamima.dao.PanierDAO;
import com.projet.yamima.model.Panier;
@Service

public class PanierServiceImp implements PanierService{

	
	@Autowired
	private PanierDAO panierDAO  ; 
	
	
	@Override
	public Panier sauvegarderPanier(Panier panier) {
Panier panierr=   panierDAO.save(panier);
             return panierr ;
	}

}
