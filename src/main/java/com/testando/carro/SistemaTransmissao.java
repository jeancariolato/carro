package com.testando.carro;

public class SistemaTransmissao {
    private String tipo;
    private int numeroMarchas;
    private String material;

    private String marca;

    private Boolean estado;

    public SistemaTransmissao(String tipo, int numeroMarchas, String material, String marca, Boolean estado) {
        this.tipo = tipo;
        this.numeroMarchas = numeroMarchas;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public void trocarMarcha(int marcha, Motor motor, SistemaDirecao sistemaDirecao){

        if(motor.verificarEstado() == true){
            if (sistemaDirecao.getAng() < 0) {
                setTipo(null);
            } else {
                System.out.println("A marcha atual do carro é " + marcha);
            }
        }
        else{
            System.out.println("O carro não está ligado.");
        }
    }

    public void verificarEstado(){
        if(estado == true){
            System.out.println("O sistema de transmissão está funcionando");
        }
        else{
            System.out.println("O sistema de transmissão não está funcionando");
        }
    }

    public void substituirComponente(String tipo, int numeroMarchas, String material, String marca, Boolean estado) {
        this.tipo = tipo;
        this.numeroMarchas = numeroMarchas;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
