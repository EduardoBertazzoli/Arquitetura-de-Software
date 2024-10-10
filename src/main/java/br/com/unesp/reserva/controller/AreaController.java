/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.reserva.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.unesp.reserva.model.Area;
import br.com.unesp.reserva.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Carlo
 */
@RestController
@RequestMapping("/area")
public class AreaController {
    
    @Autowired
    private AreaRepository repository;

    @GetMapping
    public List<Area> listar() {
        return repository.findAll();
    }
}
