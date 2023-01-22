package com.projet.yamima.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projet.yamima.model.Exemple;

@Repository
public interface ExempleDAO extends CrudRepository<Exemple, Integer> {

}
