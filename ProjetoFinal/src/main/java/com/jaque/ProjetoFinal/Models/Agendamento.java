package com.jaque.ProjetoFinal.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Agendamento {
	
	
	@GeneratedValue
	@Id
	private int id;
	
	
	@Column
	private String nome;
	
	
	@Column
	private String cpf;
	
	
	@Column
	private String telefone;
	
	
	@Column
	private String endereco_origem;
	
	
	@Column
	private String endereco_destino;
	
	
	@Column
	private String local_destino;
	
	
	@Column
	private String data_viagem;
	
	
	@Column
	private String acompanhante;

	public Agendamento() {
		
	}
	
	public Agendamento(String nome, String cpf, String telefone, String endereco_origem, String endereco_destino,
			String local_destino, String data_viagem, String acompanhante) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco_origem = endereco_origem;
		this.endereco_destino = endereco_destino;
		this.local_destino = local_destino;
		this.data_viagem = data_viagem;
		this.acompanhante = acompanhante;
	}
	
	
	public Agendamento(int id, String nome, String cpf, String telefone, String endereco_origem, String endereco_destino,
			String local_destino, String data_viagem, String acompanhante) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco_origem = endereco_origem;
		this.endereco_destino = endereco_destino;
		this.local_destino = local_destino;
		this.data_viagem = data_viagem;
		this.acompanhante = acompanhante;
	}




	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco_origem() {
		return endereco_origem;
	}

	public void setEndereco_origem(String endereco_origem) {
		this.endereco_origem = endereco_origem;
	}
	

	public String getLocal_destino() {
		return local_destino;
	}

	public void setLocal_destino(String local_destino) {
		this.local_destino = local_destino;
	}

	public String getEndereco_destino() {
		return endereco_destino;
	}

	public void setEndereco_destino(String endereco_destino) {
		this.endereco_destino = endereco_destino;
	}

	public String getData_viagem() {
		return data_viagem;
	}

	public void setData_viagem(String data_viagem) {
		this.data_viagem = data_viagem;
	}

	public String getAcompanhante() {
		return acompanhante;
	}

	public void setAcompanhante(String acompanhante) {
		this.acompanhante = acompanhante;
	}
	
	
	

}
