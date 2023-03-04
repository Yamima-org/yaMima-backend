package com.projet.yamima.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.projet.yamima.model.Image;
import com.projet.yamima.model.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product , ID>{

	void save(Image image);

	








}
