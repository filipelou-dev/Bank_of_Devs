package Treinamento.ProjetoFinal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="mtb310_transaction")
public class Transacao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_transacao")
	private int id_transacao;
	
	@Column(name="data_hora")
	private String data_hora;
	
	@Column(name="dispositivo")
	private int dispositivo;
	
	@Column(name="valor_solic")
	private float valor_solic;
	
	@Column(name="valor_aut")
	private float valor_aut;
	
	@Column(name="status")
	private int status;
	
	@Column(name="ag_financeiro")
	private int ag_financeiro;
	
	@JsonIgnoreProperties("depto")
	@OneToMany(mappedBy = "depto", cascade = CascadeType.ALL)
	private List<Parceiro> listaParceiros;
	
	public int getId_transacao() {
		return id_transacao;
	}

	public void setId_transacao(int id_transacao) {
		this.id_transacao = id_transacao;
	}

	public String getData_hora() {
		return data_hora;
	}

	public void setData_hora(String data_hora) {
		this.data_hora = data_hora;
	}

	public int getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(int dispositivo) {
		this.dispositivo = dispositivo;
	}

	public float getValor_solic() {
		return valor_solic;
	}

	public void setValor_solic(float valor_solic) {
		this.valor_solic = valor_solic;
	}

	public float getValor_aut() {
		return valor_aut;
	}

	public void setValor_aut(float valor_aut) {
		this.valor_aut = valor_aut;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getAg_financeiro() {
		return ag_financeiro;
	}

	public void setAg_financeiro(int ag_financeiro) {
		this.ag_financeiro = ag_financeiro;
	}
	
	public List<Parceiro> getListaParceiros() {
		return listaParceiros;
	}
	public void setListaParceiros(List<Parceiro> listaParceiros) {
		this.listaParceiros = listaParceiros;
	}
}
