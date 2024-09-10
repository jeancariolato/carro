/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testando.carro;

/**
 *
 * @author Abner
 */
public class Banco {
    private int quantidade;
    private String material;

    private String cor;
    private String tipo;
    private String estado;

    public Banco(int quantidade, String material, String cor, String tipo, String estado) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String ajustarEncosto(String posicao) {
        String position = posicao;
        return  position;
    }

    public double ajustarAltura(double novaAltura){
        double newHeight = novaAltura;
        return newHeight;
    }

    public void verificarEstado(){

    }

}
