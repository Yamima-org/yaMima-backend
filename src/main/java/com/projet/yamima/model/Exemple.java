package com.projet.yamima.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "exemple")
public class Exemple {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exemple_id_seq")
    @SequenceGenerator(name = "exemple_id_seq", sequenceName = "exemple_id_seq", initialValue = 1, allocationSize = 1)
	  @Column(name = "id")
      private Integer id;
      @Column (name= "nom")
      private String nom ; 
      @Column (name ="prenom")
      private String prenom ;
	public Exemple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exemple(Integer id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Exemple [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
