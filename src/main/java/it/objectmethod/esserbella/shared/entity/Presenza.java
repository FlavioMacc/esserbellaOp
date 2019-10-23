package it.objectmethod.esserbella.shared.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "presenze")
public class Presenza implements Serializable{
	
	@Id
	@Column(name = "id_presenza")
	private Long idPresenza;

	@Column(name = "data_inizio")
	private String dataInizio;
	
	@Column(name = "data_fine")
	private String dataFine;
	
	@Column(name = "id_operatore")
	private String idOperatore;
	


}
