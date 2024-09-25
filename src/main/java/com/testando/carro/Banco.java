package com.testando.carro;

public class Banco {
    private int quantidade;
    private String material;
    private String cor;
    private String tipo;
    private String estado;
    private double altura;

    // Construtor
    public Banco(int quantidade, String material, String cor, String tipo, String estado, double altura) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
        this.altura = altura;
    }
    public double verificarAltura(){
        return altura;
    }

    // Método para ajustar a posição do encosto do banco.
    public String ajustarEncosto(String posicao) {
        String position = posicao;
        return position;
    }

    // Método para ajustar a altura do banco com limites definidos.
    public double ajustarAltura(double novaAltura) {
        double alturaMinima = 0.5;
        double alturaMaxima = 2.0;

        // Verifica se a nova altura é menor que o limite mínimo.
        if (novaAltura < alturaMinima) {
            System.out.println("A ALTURA DO BANCO ESTÁ NO MÍNIMO! " + alturaMinima);
            System.out.println("---------------------------------------------");
            return alturaMinima;
        }
        // Verifica se a nova altura é maior que o limite máximo.
        else if (novaAltura > alturaMaxima) {
            System.out.println("A ALTURA DO BANCO ESTÁ NO MÁXIMO! " + alturaMaxima);
            System.out.println("---------------------------------------------");
            return alturaMaxima;
        }

        return novaAltura;
    }

    // Método para verificar o estado atual da inclinação do banco.
    public void setEstado(double var) {
        // Verifica a inclinação com base no valor gerado aleatoriamente.
        if (var < 2.5) {
            estado = "O banco está inclinado 90º";
        }
        if (var > 2.5 && 5 > var) {
            estado = "O banco está inclinado 75º";
        }
        if (var > 5 && 7.5 > var) {
            estado = "O banco está inclinado 50º";
        }
        if (var > 7.5 && 10 > var) {
            estado = "O banco está inclinado 35º";
        }
    }

    // Métodos getters e setters para acessar e modificar os atributos privados da classe.

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

}
