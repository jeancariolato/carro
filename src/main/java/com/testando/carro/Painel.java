package com.testando.carro;

public class Painel {

   
    public void exibirStatus(Motor motor, SistemaCombustivel sistemaCombustivel, Luzes luzes, Portas portas, Suspensao suspensao, Banco banco, SistemaEletrico sistemaeletrico) {
        if(sistemaeletrico.getEstado()==true){
            System.out.println("INFORMAÇÕES DO PAINEL:");
            System.out.println("Potência do Motor: " + motor.getPotencia() +"\n------------------------");
            portas.verificarEstado();
            suspensao.verificarEstado();
            banco.verificarEstado();
            System.out.println("Nível de Combustivel: " + sistemaCombustivel.verificarNivel() + "L\n------------------------");
        }
        else {
            System.out.println("Não foi possivel ligar o painel, há um problema no sistema elétrico.");
        }


    }
}
