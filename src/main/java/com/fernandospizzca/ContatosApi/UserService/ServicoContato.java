package com.fernandospizzca.ContatosApi.UserService;

import com.fernandospizzca.ContatosApi.Entidades.Contato;
import com.fernandospizzca.ContatosApi.Repositorios.ContatoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoContato {
    @Autowired
    ContatoRepositorio userDao;

    public List<Contato> getAllContatos() {
        return this.userDao.findAll();
    }

    public Contato addContato(Contato user) {
        return this.userDao.save(user);
    }

    public Optional<Contato> getContatoById(long id) {
        return this.userDao.findById(id);
    }

    public Contato updateContato(Contato user) {
        return this.userDao.save(user);
    }

    public void deleteContatoById(long id) {
        this.userDao.deleteById(id);
    }

    public void deleteAllContatos() {
        this.userDao.deleteAll();
    }
}
