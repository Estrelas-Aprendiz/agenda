package com.estrelas.agenda.service;

import com.estrelas.agenda.model.ContatoModel;
import com.estrelas.agenda.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    ContatoRepository contatoRepository;

    //método responsavel por cadastrar contatos no banco
    public ContatoModel cadastrar(ContatoModel contatoModel){
        return contatoRepository.save(contatoModel);
    }

    //método responsavel por trazer como resposta todos os contatos no banco
    public List<ContatoModel> buscaContatos(){
        return contatoRepository.findAll();
    }

}
