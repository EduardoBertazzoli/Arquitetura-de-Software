/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.reserva.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Carlo
 */
public class MainController {
    @GetMapping("/")
    public String home() {
        return "Welcome to the home page!";
    }
}
