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

    public void ajustarAltura(double altura, Freios freios){
        this.altura = altura;
        if (altura < 10) {
            double novoDesgaste = freios.verificarDesgaste() + 5.0; // Simula um aumento no desgaste
            freios.setNivelDeDesgaste(novoDesgaste);
        }
    }

    public String verificarEstado(){
        String estadoString = "Altura da suspensão: " + altura + ", Rigidez da suspensão: " + rigidez ;
        return estadoString;
    }

    public void substituir(String tipo, String material, double altura, int rigidez, String marca) {
        this.tipo = tipo;
        this.material = material;
        this.altura = altura;
        this.rigidez = rigidez;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getRigidez() {
        return rigidez;
    }

    public void setRigidez(int rigidez) {
        this.rigidez = rigidez;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
