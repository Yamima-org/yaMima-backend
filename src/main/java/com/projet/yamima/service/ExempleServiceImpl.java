package com.projet.yamima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.yamima.dao.ExempleDAO;
import com.projet.yamima.model.Exemple;

@Service
public class ExempleServiceImpl implements ExempleService {

	@Autowired
	private ExempleDAO exempleDAO;   

	@Override
	public Exemple saveExemple(Exemple exemple) {
		return (Exemple) exempleDAO.save(exemple);
	}

}
