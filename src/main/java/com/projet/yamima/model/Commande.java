package com.projet.yamima.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "commande")
@Data
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "commande_id_seq")
	@SequenceGenerator(name = "commande_id_seq", sequenceName = "commande_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "idcommande")
	private Integer idcommande;
	@Column(name = "prixproduit")
	private Integer prixproduit;
	@Column(name = "quantite")
	private Integer quantite;
	@Column(name = "tailleproduit")
	@Enumerated(EnumType.STRING)
	private SizeProduct tailleproduit;
	@Column(name = "nomproduit")
	private String nomproduit;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpanier")
	private Panier panier;

}
