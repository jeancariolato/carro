package com.testando.carro;

public class Painel {

   
    public void exibirStatus(Motor motor, SistemaCombustivel sistemaCombustivel, Luzes luzes, Portas portas) {

        System.out.println("INFORMAÇÕES DO PAINEL:");
        System.out.println("Potência do Motor: " + motor.getPotencia() +"\n------------------------");
        portas.verificarEstado();
        System.out.println("Nível de Combustivel: " + sistemaCombustivel.verificarNivel() + "L\n------------------------");

    }
}
