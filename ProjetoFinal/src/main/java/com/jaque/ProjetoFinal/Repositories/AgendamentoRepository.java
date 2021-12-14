package com.jaque.ProjetoFinal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;


import com.jaque.ProjetoFinal.Models.Agendamento;


@Repository
public interface AgendamentoRepository extends JpaRepository <Agendamento, Integer>{
	
}