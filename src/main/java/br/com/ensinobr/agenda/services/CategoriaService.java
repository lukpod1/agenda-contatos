/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ensinobr.agenda.services;

import br.com.ensinobr.agenda.entities.Categoria;
import java.util.List;

/**
 *
 * @author lukas
 */
public interface CategoriaService {
    
    public void salvar(Categoria categoria);
    public Categoria buscarPorId(Long id);
    public List<Categoria> listarTodas();
    public void removerPorId(Long id);
}
