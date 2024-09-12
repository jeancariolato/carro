package com.testando.carro;

public class Suspensao {
    private String tipo;
    private String material;
    private double altura;
    private int rigidez;
    private String marca;

    public Suspensao(String tipo, String material, double altura, int rigidez, String marca) {
        this.tipo = tipo;
        this.material = material;
        this.altura = altura;
        this.rigidez = rigidez;
        this.marca = marca;
    }

    public void ajustarAltura(double altura){
        this.altura = altura;
    }

    public void verificarEstado(){
        System.out.println("Altura: " + altura + ", Rigidez: " + rigidez);
    }

    public void substituir(){
        System.out.println("Suspensão substituida.");
    }
}
