/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.reserva.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

/**
 *
 * @author Carlo
 */
@Entity
@Table(name="reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="id_area")
    private int idArea;
    @Column(name="id_morador")
    private int idMorador;
    private boolean ativa;
    @Column(name="data_inicio")
    private Date dataInicio;
    @Column(name="data_fim")
    private Date dataFim;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusReserva status;
   // private Notificacao notificador;

    public Reserva(){}
}

