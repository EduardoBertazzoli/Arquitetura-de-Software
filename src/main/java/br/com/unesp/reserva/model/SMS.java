/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.reserva.model;

/**
 *
 * @author Carlo
 */
public class SMS implements Notificacao {
    private String nomeOperadora;
    
    public SMS(){}

    @Override
    public void sendMessage() {
        System.out.println("Notificação SMS");
    }
    
}
