/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.reserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unesp.reserva.model.Area;

/**
 *
 * @author Carlo
 */
public interface AreaRepository extends JpaRepository<Area, Integer>{
    
}
