/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.reserva.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Carlo
 */
@Entity
@Table(name = "area")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;
    private String descricao;
    @Column(name = "tamanho_metro_quadrado")
    private int tamanhoMetroQuadrado;
    private boolean utilizavel;
    
    public Area(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTamanhoMetroQuadrado() {
        return tamanhoMetroQuadrado;
    }

    public void setTamanhoMetroQuadrado(int tamanhoMetroQuadrado) {
        this.tamanhoMetroQuadrado = tamanhoMetroQuadrado;
    }

    public boolean isUtilizavel() {
        return utilizavel;
    }

    public void setUtilizavel(boolean utilizavel) {
        this.utilizavel = utilizavel;
    }
    
}
