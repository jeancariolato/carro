package com.testando.carro;

public class Portas {
    private int quantidade;
    private String material;
    private String cor;
    private String tipo;
    private boolean estado;

    public Portas(int quantidade, String material, String cor, String tipo, boolean estado) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
    }

    public void abrirPorta(Luzes luzes, SistemaEletrico sistemaEletrico){
        estado = true;
        luzes.ligaLuzes(sistemaEletrico);
    }
    public void fecharPorta(){
        estado = false;
    }
    public String verificarEstado(){
        if(estado==true) {
            String estadoString = "A porta está aberta!";
            return estadoString;
        }
        else {
            String estadoString = "A porta está fechada!";
            return estadoString;

        }
    }

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

    public boolean isEstado() {
        return estado;
    }


}
