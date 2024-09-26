package com.testando.carro;

public class Carro {

    private Motor motor;
    private SistemaCombustivel sistemaCombustivel;
    private SistemaEletrico sistemaEletrico;
    private SistemaTransmissao sistemaTransmissao;
    private SistemaDirecao sistemaDirecao;
    private Painel painel;
    private Freios freios;
    private Luzes luzes;
    private Banco banco;
    private Portas portas;
    private Pneus pneus;
    private Suspensao suspensao;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private double quilometragem;

    // Construtor
    public Carro(Motor motor, SistemaCombustivel sistemaCombustivel, SistemaEletrico sistemaEletrico,
                 SistemaTransmissao sistemaTransmissao, SistemaDirecao sistemaDirecao, Painel painel,
                 Freios freios, Luzes luzes, Banco banco, Portas portas, Pneus pneus,
                 Suspensao suspensao, String modelo, int ano, String cor, String placa, double quilometragem) {
        this.motor = motor;
        this.sistemaCombustivel = sistemaCombustivel;
        this.sistemaEletrico = sistemaEletrico;
        this.sistemaTransmissao = sistemaTransmissao;
        this.sistemaDirecao = sistemaDirecao;
        this.painel = painel;
        this.freios = freios;
        this.luzes = luzes;
        this.banco = banco;
        this.portas = portas;
        this.pneus = pneus;
        this.suspensao = suspensao;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.quilometragem = quilometragem;
    }

    // Métodos para ligar e desligar o carro
    public void ligar(){
        // Liga o motor e as luzes, utilizando seus respectivos sistemas
        motor.ligarMotor(sistemaCombustivel);
        luzes.ligaLuzes(sistemaEletrico);
    }

    public void desligar(){
        // Desliga o motor e as luzes
        motor.desligarMotor();
        luzes.desligaLuzes();
    }

    // Método para atualizar a quilometragem do carro com um valor aleatório
    public void atualizarQuilometragem(){
        double km = Math.random();
        quilometragem = km;
    }

    // Métodos relacionados ao painel do carro
    public void ligarDisplay() {
        // Atualiza as informações no painel e liga o display
        painel.atualizarInformacoes(motor, sistemaCombustivel, luzes, portas, suspensao, banco, sistemaEletrico, quilometragem);
        painel.ligarDisplay();
    }

    public void desligarDisplay(){
        painel.desligarDisplay(); // Desliga o display do painel
    }

    public void atualizarInformacoes(){
        // Atualiza as informações no painel e liga o display novamente
        painel.atualizarInformacoes(motor, sistemaCombustivel, luzes, portas, suspensao, banco, sistemaEletrico, quilometragem);
        painel.ligarDisplay();
    }

    // Métodos relacionados ao sistema de freios
    public void ajustarFreios(double freioAjuste){
        // Ajusta o sistema de freio
        freios.ajustarFreio(freioAjuste);
    }

    public void substituirPastilha(){
        // Substitui as pastilhas de freio
        freios.substituirPastilhas();
    }

    public void verificarDesgaste(){
        // Verifica o desgaste das pastilhas de freio
        freios.verificarDesgaste();
    }

    // Métodos do banco
    public void ajustarAlturaBanco(double novaAltura){
        // Ajusta a altura do banco
        banco.ajustarAltura(novaAltura);
    }

    public void setEstadoBanco(double var) {
        double value = var;
        banco.setEstado(value); // Verifica o estado do banco (inclinação, etc.)
    }

    public void ajustarEncostoBanco(String posicao){
        banco.ajustarEncosto(posicao); // Ajusta o encosto do banco
    }

    // Métodos para controle das luzes do carro
    public void ligandoLuzes(boolean estado){
        luzes.onOff(estado, sistemaEletrico); // Liga ou desliga as luzes, dependendo do estado
    }

    public void ajustarIntensidade(int novaIntensidade){
        luzes.ajustarIntensidade(novaIntensidade); // Ajusta a intensidade das luzes
    }

    // Métodos do sistema de combustível
    public void abastecerCarro(double gasolina){
        sistemaCombustivel.abastecer(gasolina); // Abastece o carro com gasolina
    }

    public void substituirTanque(double nivelDeCombustivel, double capacidade, String tipoDeCombustivel, String marca, boolean estado){
        sistemaCombustivel.subtistuirTanque(nivelDeCombustivel, capacidade, tipoDeCombustivel, marca, estado); // Substitui o tanque de combustível
    }

    public void verificarNivel(){
        // Verifica o nível de combustível e imprime o valor
        System.out.println("O nivel do sistema de combustivel está em " + sistemaCombustivel.verificarNivel());
    }

    // Métodos relacionados ao motor do carro
    public void verificarEstadoMotor(){
        // Verifica o estado do motor e imprime a informação
        System.out.println("O estado do motor é: " + motor.verificarEstado());
    }

    // Métodos relacionados aos pneus
    public void substituirPneu(String tamanho, String tipo, double pressao, String marca, String estado){
        pneus.substituir(tamanho, tipo, pressao, marca, estado); // Substitui os pneus do carro
    }

    public void verificarPressao(){
        // Verifica a pressão dos pneus e imprime a informação
        System.out.println("O estado da pressão dos pneus é: " + pneus.verificarPressao());
    }

    public void ajustarPressao(double pressao){
        pneus.ajustarPressao(pressao, sistemaDirecao, banco); // Ajusta a pressão dos pneus
    }

    // Métodos para as portas do carro
    public void abrirPorta(){
        portas.abrirPorta(luzes, sistemaEletrico); // Abre as portas e verifica o sistema elétrico
    }

    public void fecharPorta(){
        portas.fecharPorta(); // Fecha as portas do carro
    }

    public void verificarEstadoPorta(){
        portas.verificarEstado(); // Verifica o estado das portas
    }

    // Métodos para o sistema de direção
    public void ajustarDirecao(double angulo){
        sistemaDirecao.ajustarDirecao(angulo, banco); // Ajusta o ângulo da direção
    }

    public void verificarEstadoDirecao(){
        sistemaDirecao.verificarEstado(); // Verifica o estado do sistema de direção
    }

    public void substituirComponenteDirecao(String tipo, boolean assistido, String material, Double relacao, String marca){
        sistemaDirecao.substituirComponente(tipo, assistido, material, relacao, marca); // Substitui componentes da direção
    }

    // Métodos para o sistema elétrico
    public void verificarBateria(){
        sistemaEletrico.verificarBateria(); // Verifica o estado da bateria
    }

    public void substituirBateria(Double voltagem, Double capacidade, String tipoDeBateria, Boolean estado, String marca) {
        sistemaEletrico.substituirBateria(voltagem, capacidade, tipoDeBateria, estado, marca); // Substitui a bateria do carro
    }

    public void testarSistemaEletrico(){
        sistemaEletrico.testarSistema(); // Testa o sistema elétrico do carro
    }

    // Métodos para o sistema de transmissão
    public void verificarEstadoTransmissao(){
        sistemaTransmissao.verificarEstado(); // Verifica o estado da transmissão
    }

    public void substituirComponenteTransmissao(String tipo, int numeroMarchas, String material, String marca, Boolean estado) {
        sistemaTransmissao.substituirComponente(tipo, numeroMarchas, material, marca, estado); // Substitui componentes da transmissão
    }

    public void trocarMarcha(int marcha){
        sistemaTransmissao.trocarMarcha(marcha, motor, sistemaDirecao); // Troca a marcha do carro
    }

    // Métodos relacionados à suspensão
    public void ajustarAlturaSuspensao(double altura){
        suspensao.ajustarAltura(altura, freios); // Ajusta a altura da suspensão
    }

    public void verificarEstadoSuspensao(){
        suspensao.verificarEstado(); // Verifica o estado da suspensão
    }

    public void substituirSuspensao(String tipo, String material, double altura, int rigidez, String marca){
        suspensao.substituir(tipo, material, altura, rigidez, marca); // Substitui componentes da suspensão
    }

    // Getters e setters para quilometragem, placa, cor, ano e modelo
    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
