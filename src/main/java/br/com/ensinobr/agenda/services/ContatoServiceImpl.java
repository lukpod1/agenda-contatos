/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ensinobr.agenda.services;

import br.com.ensinobr.agenda.entities.Categoria;
import br.com.ensinobr.agenda.entities.Contato;
import br.com.ensinobr.agenda.repositories.ContatoRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author lukas
 */
@Service
public class ContatoServiceImpl implements ContatoService {

    private ContatoRepository contatoRepository;

    public ContatoServiceImpl(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    @Override
    public void salvar(Contato contato) {

        this.contatoRepository.save(contato);
    }

    @Override
    public Contato buscarPorId(Long id) {
        Optional<Contato> o = this.contatoRepository.findById(id);

        return o.get();
    }

    @Override
    public List<Contato> listarTodas() {
        List<Contato> contatos = new ArrayList<>();

        Iterator<Contato> iterator = this.contatoRepository.findAll().iterator();

        while (iterator.hasNext()) {

            contatos.add(iterator.next());
        }

        return contatos;
    }

    @Override
    public void removerPorId(Long id) {

        this.contatoRepository.deleteById(id);
    }

}
