package com.jaque.FrontendFinal.FrontEnd.Controllers;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaque.FrontendFinal.FrontEnd.Model.Agendamento;
import com.jaque.FrontendFinal.FrontEnd.Service.AgendamentoService;


@Controller
public class AgendamentoController {
	
	private AgendamentoService agendamentoService;
	
	public AgendamentoController(AgendamentoService agendamentoService) {
		super();
		this.agendamentoService = agendamentoService;
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("listar-agendamentos")
	private String listarAgendamentos(Model model) {
		Agendamento[] agendamentos = agendamentoService.getAgendamentos();
		model.addAttribute("agendamentos", agendamentos);
		return "listar-agendamentos";
	}
	
	@GetMapping("/realizar-agendamento")
	private String realizarAgendamento(Model model) {
		return "realizar-agendamento";
	}
	
	@PostMapping(value="salvar")
	public String salvar(@RequestParam("nome") String nome, @RequestParam("cpf") String cpf, @RequestParam("telefone") String telefone, @RequestParam("endereco_origem") String endereco_origem, @RequestParam("endereco_destino") String endereco_destino, @RequestParam("local_destino") String local_destino, @RequestParam("data_viagem") String data_viagem, @RequestParam("acompanhante") String acompanhante, Model model) {
		Agendamento agendamento = new Agendamento (nome, cpf, telefone, endereco_origem, endereco_destino, local_destino, data_viagem, acompanhante);
		agendamentoService.salvar(agendamento);
		Agendamento[] agendamentos = agendamentoService.getAgendamentos();
		model.addAttribute("agendamentos", agendamentos);
		return "listar-agendamentos";
	}
	
	@PostMapping(value="deletar")
	public String delete(@RequestParam("id") int id, Model model) {
		agendamentoService.deleteById(id);
		Agendamento[] agendamentos = agendamentoService.getAgendamentos();
        model.addAttribute("agendamentos", agendamentos);
		return "listar-agendamentos";
	}


	@PostMapping(value ="atualizar")
    public String update(@RequestParam("id") int id, Model model) {
        Agendamento agendamento = agendamentoService.getById(id);
        model.addAttribute("agendamento", agendamento);
        return "realizar-agendamento";
    }
	
	@PostMapping("listar-pordata")
	private String listarAgendamentos(@RequestParam("data_viagem") String data_viagem,Model model) {
		agendamentoService.findAllData(data_viagem);
		Agendamento[] agendamentos = agendamentoService.getAgendamentos();
		model.addAttribute("agendamentos", agendamentos);
		return "";
	}

}
