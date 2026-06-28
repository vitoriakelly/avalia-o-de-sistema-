````markdown
# Avaliação de Sistemas - Modelo M/G/1

Este projeto contém um programa em Java desenvolvido para a disciplina de Avaliação de Sistemas.

O objetivo do programa é calcular métricas de desempenho de um sistema de filas utilizando o modelo M/G/1, considerando uma fila com chegadas aleatórias, tempo de serviço geral e apenas um servidor.

## Dados utilizados

- Taxa de chegada: 20 clientes por hora
- Tempo médio de serviço: 2,4 minutos
- Variância do tempo de serviço: 2,0 min²

## Métricas calculadas

O programa calcula:

- Taxa de serviço (μ)
- Fator de utilização (ρ)
- Tempo médio de serviço em horas
- Variância em horas²
- Segundo momento do tempo de serviço E[S²]
- Tempo médio de espera na fila (Wq)
- Número médio de clientes na fila (Lq)
- Tempo médio total no sistema (W)
- Número médio de clientes no sistema (L)

## Verificação de estabilidade

O programa verifica automaticamente se o sistema é estável.

O sistema é considerado estável quando:

```text
ρ < 1
````

Caso o valor de ρ seja maior ou igual a 1, o programa informa que o sistema é instável e encerra a execução.

## Como executar

Compile o arquivo Java:

```bash
javac MG1FilaServidorQuestao15.java
```

Execute o programa:

```bash
java MG1FilaServidorQuestao15
```

## Arquivo principal

```text
MG1FilaServidorQuestao15.java
```

## Autor

Atividade acadêmica desenvolvida para a disciplina de Avaliação de Sistemas.

```
```
