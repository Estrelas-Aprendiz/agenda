package com.estrelas.agenda.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "TB_CONTATOS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContatoModel {

    //Atributos da minha classe
    //Colunas da minha tabela

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String email;

}
