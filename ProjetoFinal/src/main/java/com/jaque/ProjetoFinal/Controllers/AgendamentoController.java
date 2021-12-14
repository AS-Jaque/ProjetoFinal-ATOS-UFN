package com.jaque.ProjetoFinal.Controllers;

import java.util.ArrayList;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaque.ProjetoFinal.Models.Agendamento;
import com.jaque.ProjetoFinal.Repositories.AgendamentoRepository;



@RestController
@RequestMapping(path="/agendamentos")
public class AgendamentoController {
	
	private AgendamentoRepository agendamentoRepository;
	
	public AgendamentoController(AgendamentoRepository agendamentoRepository) {
		super();
		this.agendamentoRepository = agendamentoRepository;
	}
	
	
	@PostMapping
	public ResponseEntity<Agendamento> cadastrar(@RequestBody Agendamento agendamento){
		agendamentoRepository.save(agendamento);
		return new ResponseEntity<>(agendamento, HttpStatus.OK);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Agendamento>> listar(){
		List<Agendamento> agendamentos = new ArrayList<>();
		agendamentos = agendamentoRepository.findAll();
		return new ResponseEntity<>(agendamentos, HttpStatus.OK);
	}
	
	
	@GetMapping(path="/{id}")
	public ResponseEntity<Optional<Agendamento>> listarPeloId(@PathVariable Integer id){
		Optional<Agendamento> agendamento;
		try {
			agendamento = agendamentoRepository.findById(id);
			return new ResponseEntity<Optional<Agendamento>>(agendamento, HttpStatus.OK);
		}catch (NoSuchElementException nsee) {
			return new ResponseEntity<Optional<Agendamento>>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<Optional<Agendamento>> deletarPeloId(@PathVariable Integer id){
		try {
			agendamentoRepository.deleteById(id);
			return new ResponseEntity<Optional<Agendamento>>(HttpStatus.OK);
		}catch (NoSuchElementException nsee) {
			return new ResponseEntity<Optional<Agendamento>>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Agendamento> atualizar(@PathVariable Integer id, @RequestBody Agendamento upAgendamento){
			Agendamento a = agendamentoRepository.getOne(id);
			a.setNome(upAgendamento.getNome());
			a.setCpf(upAgendamento.getCpf());
			a.setTelefone(upAgendamento.getTelefone());
			a.setEndereco_origem(upAgendamento.getEndereco_origem());
			a.setEndereco_destino(upAgendamento.getEndereco_destino());
			a.setLocal_destino(upAgendamento.getLocal_destino());
			a.setData_viagem(upAgendamento.getData_viagem());
			a.setAcompanhante(upAgendamento.getAcompanhante());
			agendamentoRepository.save(a);
			return new ResponseEntity<Agendamento>(HttpStatus.OK);
			
		
	}
}
