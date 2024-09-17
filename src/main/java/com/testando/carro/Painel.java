package com.testando.carro;

public class Painel {

   
    public void exibirStatus(Motor motor, SistemaCombustivel sistemaCombustivel, Luzes luzes, Portas portas, Suspensao suspensao, Banco banco, SistemaEletrico sistemaeletrico) {
        if(sistemaeletrico.getEstado()==true){
            System.out.println("INFORMAÇÕES DO PAINEL:" + "\nPotência do Motor: " +
                    motor.getPotencia() + "CV" + "\n" +
                    portas.verificarEstado() + "\n" +
            suspensao.verificarEstado() + "\n" +
            banco.verificarEstado() + "\n" +
            "Nível de Combustivel: " + sistemaCombustivel.verificarNivel() + "L");
        }
        else {
            System.out.println("Não foi possivel ligar o painel, há um problema no sistema elétrico.");
        }


    }
}
