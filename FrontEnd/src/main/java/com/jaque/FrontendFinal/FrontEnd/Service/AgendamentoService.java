package com.jaque.FrontendFinal.FrontEnd.Service;

import java.util.NoSuchElementException;

import org.springframework.http.HttpEntity;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jaque.FrontendFinal.FrontEnd.Model.Agendamento;



@Service
public class AgendamentoService {
	
	static final String URL_API_AGENDAMENTOS = "http://localhost:8080/agendamentos";
	
	RestTemplate restTemplate = new RestTemplate();
	
	public Agendamento[] getAgendamentos() {
		Agendamento[] agendamentoResultado = restTemplate.getForObject(URL_API_AGENDAMENTOS, Agendamento[].class);
		System.out.println(agendamentoResultado);
		return agendamentoResultado;
	}
	
	public Agendamento getById(int id) {
		Agendamento agendamento = new Agendamento();
		try {
			agendamento = restTemplate.getForObject(URL_API_AGENDAMENTOS + "/" + id, Agendamento.class);
		}catch(NoSuchElementException nsee) {
			return agendamento;
		}
		return agendamento;		
	}
	
	public void salvar(Agendamento agendamento) {
		HttpEntity<Agendamento> requestBody = new HttpEntity<Agendamento>(agendamento);
		agendamento = restTemplate.postForObject(URL_API_AGENDAMENTOS, requestBody, Agendamento.class);
	}
	
	public Agendamento[] deleteById(int id) {
		restTemplate.delete(URL_API_AGENDAMENTOS + "/" + id);
	    return getAgendamentos(); 
	}
	
	//teste de buscar pela data
	public Agendamento findAllData(String data_viagem) {
		Agendamento agendamento = new Agendamento();
		try {
			agendamento = restTemplate.getForObject(URL_API_AGENDAMENTOS + "/" + data_viagem, Agendamento.class);
		}catch(NoSuchElementException nsee) {
			return agendamento;
		}
		return agendamento;		
	}

}
