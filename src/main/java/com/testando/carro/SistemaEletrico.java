
package com.testando.carro;

public class SistemaEletrico {
    private Double voltagem;
    private Double capacidade;
    private String tipoDeBateria;

    private Boolean estado;

    private String marca;

    public SistemaEletrico(Double voltagem, Double capacidade, String tipoDeBateria, Boolean estado, String marca) {
        this.voltagem = voltagem;
        this.capacidade = capacidade;
        this.tipoDeBateria = tipoDeBateria;
        this.estado = estado;
        this.marca = marca;
    }

    public void verificarBateria() {
        voltagem = (Math.random() * 12 ) + 1;
        if(voltagem >= 12){
            System.out.println("A bateria está em bom estado.");
        }
        else {
            System.out.println("A bateria está com um baixo valor de tensão.");
        }
    }

    public void substituirBateria(Double voltagem, Double capacidade, String tipoDeBateria, Boolean estado, String marca) {
        this.voltagem = voltagem;
        this.capacidade = capacidade;
        this.tipoDeBateria = tipoDeBateria;
        this.estado = estado;
        this.marca = marca;
    }

    public void testarSistema(){
        if(estado==true){
            System.out.println("O sistema elétrico está funcionando.");
        }
        else{
            System.out.println("O sistema elétrico não está funcionando.");
        }
    }
}

