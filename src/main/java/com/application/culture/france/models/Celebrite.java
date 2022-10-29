package com.application.culture.france.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.JoinColumn;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Table(name = "Celebrite")
@Data @Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Celebrite {
	
	@Id
	@Column(name = "numCelebrite")
	private int id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "nationalite")
	private String nationalite;
	
	@Column(name = "epoque")
	private String epoque;
	
	@ManyToMany
    @JsonBackReference
	@JoinTable( name = "AssocieA",
			    joinColumns = @JoinColumn( name = "numCelebrite" ),
			    inverseJoinColumns = @JoinColumn( name = "codeM" ) )
	private List<Monument> listMonument; 


}
