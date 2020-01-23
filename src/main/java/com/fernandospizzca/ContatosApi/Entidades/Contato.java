package com.fernandospizzca.ContatosApi.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Contato {

    @Id
    private long id;
    private String nome;
    private String telefone;
}
