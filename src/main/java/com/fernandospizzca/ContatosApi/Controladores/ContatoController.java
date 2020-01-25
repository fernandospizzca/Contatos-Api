package com.fernandospizzca.ContatosApi.Controladores;

import com.fernandospizzca.ContatosApi.Entidades.Contato;
import com.fernandospizzca.ContatosApi.UserService.ServicoContato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/contatos")
public class ContatoController {

    @Autowired
    ServicoContato contatoRepo;

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public List<Contato> getAllContatos(){
        return this.contatoRepo.getAllContatos();
    }

    @RequestMapping(value = "/addcontato", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

    public Contato addContato (@RequestBody Contato user) {
        return this.contatoRepo.addContato(user);
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





