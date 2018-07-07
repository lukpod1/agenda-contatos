/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ensinobr.agenda.services;

import br.com.ensinobr.agenda.entities.Contato;
import java.util.List;

/**
 *
 * @author lukas
 */
public interface ContatoService {
    
    public void salvar(Contato contato);
    public Contato buscarPorId(Long id);
    public List<Contato> listarTodas();
    public void removerPorId(Long id);
}
