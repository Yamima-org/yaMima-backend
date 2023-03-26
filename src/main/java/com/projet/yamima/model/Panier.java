package com.projet.yamima.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "panier")
@Data
public class Panier {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "panier_id_seq")
	@SequenceGenerator(name = "panier_id_seq", sequenceName = "panier_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "idpanier")
	private Integer idpanier;
	
	@Column(name = "livraison")
	private String livraison;
	@Column(name = "lieulivraison")
	private String lieulivraison;
	@Column(name = "nomcomplet")
	private String nomcomplet;
	@Column(name = "mail")
	private String mail;
	@Column(name = "numtel")
	private Integer numtel;
	@Column(name = "modepaiement")
	@Enumerated(EnumType.STRING)
	private ModePaiement modepaiement;
	@Column(name = "montanttotal")
	private Integer montanttotal;

	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "idpanier")
	private List<Commande> listCommande;


}
