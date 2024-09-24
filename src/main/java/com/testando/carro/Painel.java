package com.testando.carro;

public class Painel {
    String info;
    String tipo;
    String display;
    Boolean controle;
    String marca;
    Boolean estado;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Boolean getControle() {
        return controle;
    }

    public void setControle(Boolean controle) {
        this.controle = controle;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void atualizarInformacoes(Motor motor, SistemaCombustivel sistemaCombustivel, Luzes luzes, Portas portas, Suspensao suspensao, Banco banco, SistemaEletrico sistemaeletrico, double km) {
        if (sistemaeletrico.getEstado()) {
            info = "INFORMAÇÕES DO PAINEL:" + "\nPotência do Motor: " +
                    motor.getPotencia() + "CV" + "\n" +
                    portas.verificarEstado() + "\n" +
                    suspensao.verificarEstado() + "\n" +
                    banco.getEstado() + "\n" +
                    "Nível de Combustivel: " + sistemaCombustivel.verificarNivel() + "L" + "\n" +
                    "Quilometragem: " + km + "Km";
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


    public Painel(String info, String tipo, String display, Boolean controle, String marca, Boolean estado) {
        this.info = info;
        this.tipo = tipo;
        this.display = display;
        this.controle = controle;
        this.marca = marca;
        this.estado = estado;
    }
}


