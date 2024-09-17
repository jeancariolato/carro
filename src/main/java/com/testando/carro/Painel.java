package com.testando.carro;

public class Painel {
    String info = "vazio";
    String tipo;
    String display;
    Boolean controle;
    String marca;
    Boolean estado;
   
    public void atualizarInformacoes(Motor motor, SistemaCombustivel sistemaCombustivel, Luzes luzes, Portas portas, Suspensao suspensao, Banco banco, SistemaEletrico sistemaeletrico) {
        if (sistemaeletrico.getEstado()) {
            info = "INFORMAÇÕES DO PAINEL:" + "\nPotência do Motor: " +
                    motor.getPotencia() + "CV" + "\n" +
                    portas.verificarEstado() + "\n" +
                    suspensao.verificarEstado() + "\n" +
                    banco.verificarEstado() + "\n" +
                    "Nível de Combustivel: " + sistemaCombustivel.verificarNivel() + "L";
        } else {
            System.out.println("Não foi possivel ligar o painel, há um problema no sistema elétrico.");
        }
    }
        public void desligarDisplay(){
            estado = false;
        }
        public void ligarDisplay(){
            estado = true;
            System.out.println(info);
        }
    }
