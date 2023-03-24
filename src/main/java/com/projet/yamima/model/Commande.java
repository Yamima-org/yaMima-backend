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
@Entity
@Table(name = "commande")
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "commande_id_seq")
    @SequenceGenerator(name = "commande_id_seq", sequenceName = "commande_id_seq", initialValue = 1, allocationSize = 1)
	  @Column(name = "idcommande")
	  private Integer idcommande ; 
	  @Column(name = "prixproduit")
     private Integer prixproduit ; 
	  @Column(name = "quantite")
      private Integer quantite ; 
	  @Column(name = "tailleproduit")
	 @Enumerated(EnumType.STRING)
      private SizeProduct tailleproduit ; 
	   @Column(name = "nomproduit")
      private String nomproduit ; 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="idpanier" , referencedColumnName = "idpanier")
     private Panier panier ;
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(Integer idcommande, Integer prixproduit, Integer quantite, SizeProduct tailleproduit,
			String nomproduit, Panier panier) {
		super();
		this.idcommande = idcommande;
		this.prixproduit = prixproduit;
		this.quantite = quantite;
		this.tailleproduit = tailleproduit;
		this.nomproduit = nomproduit;
		this.panier = panier;
	}
	public Integer getIdcommande() {
		return idcommande;
	}
	public void setIdcommande(Integer idcommande) {
		this.idcommande = idcommande;
	}
	public Integer getPrixproduit() {
		return prixproduit;
	}
	public void setPrixproduit(Integer prixproduit) {
		this.prixproduit = prixproduit;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public SizeProduct getTailleproduit() {
		return tailleproduit;
	}
	public void setTailleproduit(SizeProduct tailleproduit) {
		this.tailleproduit = tailleproduit;
	}
	public String getNomproduit() {
		return nomproduit;
	}
	public void setNomproduit(String nomproduit) {
		this.nomproduit = nomproduit;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	
	 
}
