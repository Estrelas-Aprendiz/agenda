package com.estrelas.agenda.controller;

import com.estrelas.agenda.model.ContatoModel;
import com.estrelas.agenda.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/contatos")
public class ContatoController {

    //POST - CADASTRO DE DADO
    //GET - RECUPERAÇÃO DE DADO
    //PUT - ALTERAÇÃO DE DADO EXISTENTE
    //DELETE - DELEÇÃO DE DADO EXISTENTE

    @Autowired
    ContatoService contatoService;

    @PostMapping
    public ContatoModel cadastrarContato(@RequestBody ContatoModel contatoModel){
        return contatoService.cadastrar(contatoModel);
    }

    @GetMapping
    public List<ContatoModel> buscaContatos(){
        return contatoService.buscaContatos();
    }

}
