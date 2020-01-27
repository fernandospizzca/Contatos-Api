package com.fernandospizzca.ContatosApi.Controladores;

import com.fernandospizzca.ContatosApi.Entidades.Contato;
import com.fernandospizzca.ContatosApi.Repositorios.ContatoRepositorio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/contatos")
public class ContatoController {

    private ContatoRepositorio repositorio;

    ContatoController(ContatoRepositorio contatoRepositorio){
        this.repositorio=contatoRepositorio;
    }

    @GetMapping
    public List findAll(){
        return repositorio.findAll();
    }

    @PostMapping
    public Contato create(@RequestBody Contato contato) {
        return repositorio.save(contato);
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity findById(@PathVariable long id){
        return repositorio.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity update(@PathVariable("id") long id, @RequestBody Contato contato){
        return repositorio.findById(id).map(record -> {
                    record.setNome(contato.getNome());
                    record.setTelefone(contato.getTelefone());
                    Contato updated = repositorio.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<?> delete(@PathVariable long id) {
        return repositorio.findById(id)
                .map(record -> {
                    repositorio.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}

    /*@PostMapping(consumes = "application/json")
    public ResponseEntity<?> adicionaContato(@RequestBody Contato contato){
        Contato contatoSalvo = contatoRepo.save(contato);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().replacePath("/contatos").path("/{ID}").
                buildAndExpand(contatoSalvo.getId()).toUri();

         return ResponseEntity.created(uri).build();





    @GetMapping
    public ResponseEntity<List<Contato>> listaContatos(){
         return ResponseEntity.ok().body(contatoRepo.findAll());
    }

    @GetMapping("/{ID}")
    public ResponseEntity<Contato> buscaPorId(@PathVariable Long id){
        return ResponseEntity.ok().body(contatoRepo.findById(id).get());
    }

     */





