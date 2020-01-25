package com.fernandospizzca.ContatosApi.Entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CONTATOS")
@Data
public class Contato {

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "NOME", nullable = true, length = 40)
    private String nome;

    @Column(name = "TELEFONE", nullable = true, length = 12)
    private String telefone;


   /*public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    */
    protected Contato(){

    }

    public Long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
