package com.fernandospizzca.ContatosApi.Repositorios;

import com.fernandospizzca.ContatosApi.Entidades.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepositorio extends JpaRepository<Contato, Long> {

}
