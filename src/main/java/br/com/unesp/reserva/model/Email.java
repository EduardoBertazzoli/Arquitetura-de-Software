/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.reserva.model;

/**
 *
 * @author Carlo
 */
public class Email implements Notificacao {

    private String nomeProvedor;
    
    public Email(){}
    
    @Override
    public void sendMessage() {
        System.out.println("Notificação Email");
    }
    
}
