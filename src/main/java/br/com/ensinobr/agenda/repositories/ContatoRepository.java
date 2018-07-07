/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ensinobr.agenda.repositories;

import br.com.ensinobr.agenda.entities.Contato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lukas
 */
@Repository
public interface ContatoRepository extends CrudRepository<Contato, Long>{
    
}
