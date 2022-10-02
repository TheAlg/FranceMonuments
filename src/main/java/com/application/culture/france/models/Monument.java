package com.application.culture.france.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity @Table(name = "monument")
@Data @Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Monument {
	
	@Id
	@Column(name = "geohash")
	private String code;
	
	@Column(name = "typeM")
	private String type;
	
	@Column(name = "proprietaire")
	private String proprietaire;
	
	@Column(name = "longitude")
	private float longitude;
	
	@Column(name = "latitude")
	private float latitude;
	
	@Column(name = "codeinsee")
	private int codeInsee;


	
}
