package com.projet.yamima.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@Column(name = "livraison")
    private String livraison ;
	@Column(name = "lieulivraison")
	private String lieulivraison ;
	@Column(name = "montanttotal")
    private Integer montanttotal ;
	@Column(name = "nomcomplet")
    private String nomcomplet ; 
	@Column(name = "mail")
    private String mail ; 
	@Column(name = "numtel")
    private Integer numtel ; 
	@Column(name = "paiementmode")
	@Enumerated(EnumType.STRING)
    private ModePaiement paiementmode ;
	@Column(name = "tailleproduit")
	@Enumerated(EnumType.STRING)
    private SizeProduct tailleproduit ;
	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Panier(Integer idpanier, String livraison, String lieulivraison, Integer montanttotal, String nomcomplet,
			String mail, Integer numtel, ModePaiement paiementmode, SizeProduct tailleproduit) {
		super();
		this.idpanier = idpanier;
		this.livraison = livraison;
		this.lieulivraison = lieulivraison;
		this.montanttotal = montanttotal;
		this.nomcomplet = nomcomplet;
		this.mail = mail;
		this.numtel = numtel;
		this.paiementmode = paiementmode;
		this.tailleproduit = tailleproduit;
	}
	public Integer getIdpanier() {
		return idpanier;
	}
	public void setIdpanier(Integer idpanier) {
		this.idpanier = idpanier;
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
	public Integer getMontanttotal() {
		return montanttotal;
	}
	public void setMontanttotal(Integer montanttotal) {
		this.montanttotal = montanttotal;
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
	public ModePaiement getPaiementmode() {
		return paiementmode;
	}
	public void setPaiementmode(ModePaiement paiementmode) {
		this.paiementmode = paiementmode;
	}
	public SizeProduct getTailleproduit() {
		return tailleproduit;
	}
	public void setTailleproduit(SizeProduct tailleproduit) {
		this.tailleproduit = tailleproduit;
	} 
	
}
