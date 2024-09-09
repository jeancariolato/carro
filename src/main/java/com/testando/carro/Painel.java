package com.testando.carro;

public class Painel {

    //EXIBINDO INFORMAÇÕES DA TEMPERATURA DO MOTOR E NIVEL DE COMBUSTIVEL
    public void exibirStatus(Motor motor, SistemaCombustivel sistemaCombustivel) {

        System.out.println("INFORMAÇÕES DO PAINEL:");
        System.out.println("Temperatura do Motor: " + motor.getTemperatura());
        System.out.println("Nível de Combustivel: " + sistemaCombustivel.getNivelCombustivel());
        System.out.println("---------------------------------------------------");
    }
}
