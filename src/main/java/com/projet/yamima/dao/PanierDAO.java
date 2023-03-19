package com.projet.yamima.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.projet.yamima.model.Panier;
@Repository
public interface PanierDAO extends CrudRepository<Panier, ID>{

}
