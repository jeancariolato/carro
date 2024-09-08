package com.testando.carro;

public class SistemaDirecao {
    private String tipo;

    private boolean assistido;

    private String material;

    private Double relacao;

    private String marca;

    public SistemaDirecao(String tipo, boolean assistido, String material, Double relacao, String marca) {
        this.tipo = tipo;
        this.assistido = assistido;
        this.material = material;
        this.relacao = relacao;
        this.marca = marca;
    }

    public Double ajustarDirecao(Double angulo){
        Double ang = angulo;
        System.out.println("O ANGULO DA DIREÇÃO:" + ang);
        return ang;
    }

    public void verificarEstado(){
        System.out.println("");
    }

    public void substituirComponente(String componente){
        //IF E ELSE "MARCA"
        System.out.println("Componente foi substituido!");
    }
}
