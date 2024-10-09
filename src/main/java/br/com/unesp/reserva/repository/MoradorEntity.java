/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.reserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unesp.reserva.model.Morador;

/**
 *
 * @author Carlo
 */
public interface MoradorEntity extends JpaRepository<Morador, Integer>{
    
}
