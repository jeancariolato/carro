package com.testando.carro;

public class Freios {
    private String tipo;
    private String material;
    private double tamanho;
    private String marca;
    private double nivelDeDesgaste;

    public Freios(String tipo, String material, double tamanho, String marca, double nivelDeDesgaste) {
        this.tipo = tipo;
        this.material = material;
        this.tamanho = tamanho;
        this.marca = marca;
        this.nivelDeDesgaste = nivelDeDesgaste;
    }
    public void SubstituirFreios(String tipo, String material, double tamanho, String marca, double nivelDeDesgaste) {
        this.tipo = tipo;
        this.material = material;
        this.tamanho = tamanho;
        this.marca = marca;
        this.nivelDeDesgaste = nivelDeDesgaste;
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

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double verificarDesgaste() {
        return nivelDeDesgaste;

    }
    public void setNivelDeDesgaste(double nivelDeDesgaste) {
        this.nivelDeDesgaste = nivelDeDesgaste;
    }

    public void substituirPastilhas(){
        nivelDeDesgaste = (Math.random() * 10 ) + 1;
        if (nivelDeDesgaste>2){
            System.out.println("Pastilha em bom estado ainda.");
        }
        else {
            System.out.println("Pastilha substituida!");
        }
    }
    public void ajustarFreio(double freioAjuste){
        if(freioAjuste<=10){
            System.out.println("Foi necessario ajustar o freio.");
            System.out.println("-------------------------------");
        }
        else {
            System.out.println("Freio funcionando normalmente.");
            System.out.println("-------------------------------");
        }
    }
}
