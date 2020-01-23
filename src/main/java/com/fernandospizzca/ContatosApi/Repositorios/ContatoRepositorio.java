package com.fernandospizzca.ContatosApi.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernandospizzca.ContatosApi.Entidades.Contato;

@Repository
public interface ContatoRepositorio extends JpaRepository<Contato, Long>{
}
