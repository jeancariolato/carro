package com.testando.carro;

public class Painel {

    //EXIBINDO INFORMAÇÕES DA TEMPERATURA DO MOTOR E NIVEL DE COMBUSTIVEL
<<<<<<< HEAD
    public void exibirStatus(Motor motor, SistemaCombustivel sistemaCombustivel, Portas portas, Luzes luzes, SistemaDirecao sistemaDirecao, SistemaEletrico sistemaEletrico, Pneus pneus, Freios freios) {
=======
    public void exibirStatus(Motor motor, SistemaCombustivel sistemaCombustivel, Portas portas) {
>>>>>>> 2ee4492b089bd60748dc54f79d34103a3288932f

        System.out.println("INFORMAÇÕES DO PAINEL:");
        System.out.println("Temperatura do Motor: " + motor.getTemperatura() +
                "Cº\n------------------------");
        portas.verificarEstado();
        System.out.println("Nível de Combustivel: " + sistemaCombustivel.verificarNivel() +
                "L\n------------------------");

    }
}
