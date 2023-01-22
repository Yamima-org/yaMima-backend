package com.projet.yamima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.yamima.model.Exemple;
import com.projet.yamima.service.ExempleService;

@RestController
public class ExempleController {

	@Autowired
	private ExempleService exempleService ; 
	
	@RequestMapping(value = "/saveExemple", method = RequestMethod.POST)
   public Exemple saveExemple (@RequestBody Exemple exemple ) {
		return  (Exemple) exempleService.saveExemple(exemple);
	}
}
