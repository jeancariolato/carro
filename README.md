# TRABALHO ABNER - CARRO

## 1. Carro
Integrações: Motor, SistemaCombustivel, SistemaEletrico, SistemaTransmissao, SistemaDirecao, Painel, Freios, Luzes, Banco, Portas, Pneus, Suspensao.
Métodos:
- ** ligar(): Liga o carro acionando motor e luzes.
- ** desligar(): Desliga motor e luzes.
- ** atualizarQuilometragem(): Atualiza a quilometragem do carro.
- ** Métodos relacionados ao Painel: ligarDisplay(), desligarDisplay(), atualizarInformacoes().
- ** Métodos relacionados ao Freios: ajustarFreios(double), substituirPastilha(), verificarDesgaste().
- ** Métodos relacionados ao Banco: ajustarAlturaBanco(double), setEstadoBanco(double), ajustarEncostoBanco(String).
- ** Métodos relacionados às Luzes: ligandoLuzes(boolean), ajustarIntensidade(int).
- ** Métodos relacionados ao Sistema Combustível: abastecerCarro(double), substituirTanque(double, double, String, String, boolean), verificarNivel().
- ** Métodos relacionados ao Motor: verificarEstadoMotor().
- ** Métodos relacionados aos Pneus: substituirPneu(String, String, double, String, String), verificarPressao(), ajustarPressao(double).
- ** Métodos relacionados às Portas: abrirPorta(), fecharPorta(), verificarEstadoPorta().
- ** Métodos relacionados ao Sistema de Direção: ajustarDirecao(double), verificarEstadoDirecao(), substituirComponenteDirecao(String, boolean, String, Double, String).
- ** Métodos relacionados ao Sistema Elétrico: verificarBateria(), substituirBateria(double, double, String, boolean, String), testarSistemaEletrico().
- ** Métodos relacionados ao Sistema de Transmissão: verificarEstadoTransmissao(), substituirComponenteTransmissao(String, int, String, String, boolean), trocarMarcha(String).
- ** Métodos relacionados à Suspensão: ajustarAlturaSuspensao(double), verificarEstadoSuspensao(), substituirSuspensao(String, String, double, int, String).

## 2. Suspensao
Métodos:
- ** ajustarAltura(double altura, Freios freios): Ajusta a altura da suspensão e pode influenciar o desgaste dos freios.
- ** verificarEstado(): Verifica o estado da suspensão.
- ** substituir(String tipo, String material, double altura, int rigidez, String marca): Substitui componentes da suspensão.
- ** Getters e Setters para: tipo, material, altura, rigidez, marca.

## 3. Freios
Métodos:
- ** substituirPastilhas(): Substitui as pastilhas de freio quando desgastadas.
- ** ajustarFreio(double freioAjuste): Ajusta os freios do carro.
- ** verificarDesgaste(): Verifica o nível de desgaste dos freios.
- ** Getters e Setters para: tipo, material, tamanho, marca, nivelDeDesgaste.

## 4. Luzes
Métodos:
- ** onOff(boolean estado, SistemaEletrico sistemaeletrico): Liga ou desliga as luzes.
- ** ligaLuzes(SistemaEletrico sistemaeletrico): Liga as luzes se houver voltagem suficiente.
- ** desligaLuzes(): Desliga as luzes.
- ** ajustarIntensidade(int novaIntensidade): Ajusta a intensidade das luzes.
- ** Getters e Setters para: tipo, intensidade, cor, estado, modelo.

## 5. Sistema de Direção
Métodos:
- ** ajustarDirecao(double angulo): Ajusta a direção do carro.
- ** verificarEstado(): Verifica o estado da direção.
- ** substituirComponente(String tipo, boolean assistido, String material, double relacao, String marca): Substitui componentes da direção.
- ** Getters e Setters para: tipo, assistido, material, relacao, marca, estado.

## 6. Sistema de Combustível
Métodos:
- ** verificarNivel(): Verifica o nível de combustível.
- ** abastecer(double quantidade): Abastece o carro.
- ** substituirTanque(double nivelDeCombustivel, double capacidade, String tipoDeCombustivel, String marca, boolean estado): Substitui o tanque de combustível.
- ** Getters e Setters para: nivelDeCombustivel, capacidade, tipoDeCombustivel, marca, estado.

## 7. Motor
Métodos:
- ** ligarMotor(SistemaCombustivel sistemacombustivel): Liga o motor se houver combustível.
- ** desligarMotor(): Desliga o motor.
- ** Getters e Setters para: tipo, potencia, cilindrada, marca, estado.

## 8. Bancos
Métodos:
- ** verificarAltura(): Retorna a altura atual do banco.
- ** ajustarEncosto(String posicao): Ajusta a posição do encosto do banco.
- ** ajustarAltura(double novaAltura): Ajusta a altura do banco dentro de limites.
- ** setEstado(double var): Define o estado da inclinação do banco.
- ** Getters e Setters para: quantidade, material, cor, tipo, estado.

## 9. Painel
Métodos:
- ** atualizarInformacoes(Motor, SistemaCombustivel, Luzes, Portas, Suspensao, Banco, SistemaEletrico, double km): Atualiza as informações exibidas no painel.
- ** ligarDisplay(): Liga o display do painel.
- ** desligarDisplay(): Desliga o display do painel.
- ** Getters e Setters para: info, tipo, display, controle, marca, estado.

## 10. Pneus
Métodos:
- ** substituir(String tamanho, String tipo, double pressao, String marca, String estado): Substitui os pneus.
- ** verificarPressao(): Verifica a pressão dos pneus.
- ** ajustarPressao(double pressao, SistemaDirecao sistemaDirecao, Banco banco): Ajusta a pressão dos pneus com base na direção e altura do banco.
- ** Getters e Setters para: tamanho, tipo, pressao, marca, estado.

## 11. Portas
Métodos:
- ** abrirPorta(Luzes luzes, SistemaEletrico sistemaEletrico): Abre a porta e liga as luzes.
- ** fecharPorta(): Fecha a porta.
- ** verificarEstado(): Verifica se a porta está aberta ou fechada.
- ** Getters e Setters para: quantidade, material, cor, tipo, estado.

## 12. Classe SistemaEletrico
Métodos:
- ** verificarBateria(): Verifica o estado da bateria.
- ** substituirBateria(double voltagem, double capacidade, String tipoDeBateria, boolean estado, String marca): Substitui a bateria do carro.
- ** testarSistema(): Testa o sistema elétrico.
- ** Getters e Setters para: voltagem, capacidade, tipoDeBateria, estado, marca.

## 13. Classe SistemaTransmissao
Métodos:
- ** trocarMarcha(String marcha, Motor motor, SistemaDirecao sistemaDirecao): Troca a marcha do carro.
- ** verificarEstado(): Verifica o estado da transmissão.
- ** substituirComponente(String tipo, int numeroMarchas, String material, String marca, boolean estado): Substitui componentes da transmissão.
- ** Getters e Setters para: tipo, numeroMarchas, material, marca, estado, marcha.





