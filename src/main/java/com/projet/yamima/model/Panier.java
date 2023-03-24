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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "panier")
public class Panier {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "panier_id_seq")
	@SequenceGenerator(name = "panier_id_seq", sequenceName = "panier_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "idpanier")
    private Integer idpanier ;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "panier" , fetch = FetchType.LAZY)
    private List<Commande> listCommande ; 
	@Column(name = "livraison")
    private String livraison ;
	@Column(name = "lieulivraison")
	private String lieulivraison ;
    @Column(name = "nomcomplet")
    private String nomcomplet ; 
	@Column(name = "mail")
    private String mail ; 
	@Column(name = "numtel")
    private Integer numtel ;
	@Column(name = "modepaiement")
	 @Enumerated(EnumType.STRING)
    private ModePaiement modepaiement ; 
	@Column(name = "montanttotal")
   private Integer montanttotal ;
	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Panier(Integer idpanier, List<Commande> listCommande, String livraison, String lieulivraison,
			String nomcomplet, String mail, Integer numtel, ModePaiement modepaiement, Integer montanttotal) {
		super();
		this.idpanier = idpanier;
		this.listCommande = listCommande;
		this.livraison = livraison;
		this.lieulivraison = lieulivraison;
		this.nomcomplet = nomcomplet;
		this.mail = mail;
		this.numtel = numtel;
		this.modepaiement = modepaiement;
		this.montanttotal = montanttotal;
	}
	public Integer getIdpanier() {
		return idpanier;
	}
	public void setIdpanier(Integer idpanier) {
		this.idpanier = idpanier;
	}
	public List<Commande> getListCommande() {
		return listCommande;
	}
	public void setListCommande(List<Commande> listCommande) {
		this.listCommande = listCommande;
	}
	public String getLivraison() {
		return livraison;
	}
	public void setLivraison(String livraison) {
		this.livraison = livraison;
	}
	public String getLieulivraison() {
		return lieulivraison;
	}
	public void setLieulivraison(String lieulivraison) {
		this.lieulivraison = lieulivraison;
	}
	public String getNomcomplet() {
		return nomcomplet;
	}
	public void setNomcomplet(String nomcomplet) {
		this.nomcomplet = nomcomplet;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Integer getNumtel() {
		return numtel;
	}
	public void setNumtel(Integer numtel) {
		this.numtel = numtel;
	}
	public ModePaiement getModepaiement() {
		return modepaiement;
	}
	public void setModepaiement(ModePaiement modepaiement) {
		this.modepaiement = modepaiement;
	}
	public Integer getMontanttotal() {
		return montanttotal;
	}
	public void setMontanttotal(Integer montanttotal) {
		this.montanttotal = montanttotal;
	} 
	
	
}
