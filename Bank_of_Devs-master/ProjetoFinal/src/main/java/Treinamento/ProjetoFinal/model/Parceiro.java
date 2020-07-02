package Treinamento.ProjetoFinal.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="mtb310_ag_financeiro")
public class Parceiro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_agente")
	private int id_agente;
	@Column(name="nome_agente", length=100, nullable=false)
	private String nome_agente;
	@Column(name="volume_transacional")
	private float volume_transacional;
	
	@JsonIgnoreProperties("listaAgentes")
	@ManyToOne
	private Transacao depto;
	
	
	public Transacao getDepto() {
		return depto;
	}
	public void setDepto(Transacao depto) {
		this.depto = depto;
	}
	public int getId_agente() {
		return id_agente;
	}
	public void setId_agente(int id_agente) {
		this.id_agente = id_agente;
	}
	public String getNome_agente() {
		return nome_agente;
	}
	public void setNome_agente(String nome_agente) {
		this.nome_agente = nome_agente;
	}
	public float getVolume_transacional() {
		return volume_transacional;
	}
	public void setVolume_transacional(float volume_transacional) {
		this.volume_transacional = volume_transacional;
	}
	

}
