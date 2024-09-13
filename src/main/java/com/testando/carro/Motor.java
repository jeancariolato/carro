
package com.testando.carro;

public class Motor {

    //ATRIBUTOS
    private String tipo;
    private double potencia;
    private double cilindrada;
    private String marca;
    private boolean estado;


    //GETTERS AND SETTERS
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public boolean isEstado() {
        return estado;
    }

  
    
    //CONSTRUTOR
    public Motor(String tipo, double potencia, double cilindrada, String marca, boolean estado) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.marca = marca;
        this.estado = estado;
    }

    // MÉTODO DE RETORNAR POTENCIA
    public double getPotencia(){
        return potencia;
    }
    

    // MÉTODO DE LIGAR MOTOR
    public void ligarMotor(SistemaCombustivel sistemacombustivel){
        if(sistemacombustivel.verificarNivel()>0){
            estado = true;
            System.out.println("O MOTOR ESTÁ LIGADO!");
            System.out.println("-----------------------");
        }
        else{
            System.out.println("Não foi possivel ligar o motor, não há combustivel.");
        }
    }
    public void desligarMotor(){
        estado = false;
        System.out.println("O MOTOR ESTÁ DESLIGADO!");
        System.out.println("-----------------------");
    }
}
