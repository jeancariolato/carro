
package com.testando.carro;

public class Motor {

    private double temperatura;

    public Motor(Double potencia) {
        this.temperatura = potencia;
    }

// MÉTODO DE RETORNAR TEMPERATURA
    public double getTemperatura(){
        return temperatura;
    }
// MÉTODO DE LIGAR MOTOR
    public void ligarMotor(){
        System.out.println("O MOTOR ESTÁ LIGADO!");
        System.out.println("-----------------------");
    }
    public void desligarMotor(){
        System.out.println("O MOTOR ESTÁ DESLIGADO!");
        System.out.println("-----------------------");
    }
}
