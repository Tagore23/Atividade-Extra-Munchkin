# Atividade-Extra-Munchkin
Atividade extra
Desafio: Aplicativo de Gerenciamento de Jogadores para Munchkin
No card game Munchkin, de 3 a 6 jogadores competem para alcançar o level 10 e vencer o jogo. Os jogadores enfrentam desafios como derrotar monstros, atrapalhar outros jogadores e conquistar tesouros.

O ponto central do jogo é a luta contra monstros. Para derrotar um monstro, o jogador precisa ter um poder de ataque maior que o nível do monstro.

O poder de ataque de um jogador é calculado somando:

Seu level.
Pontos de equipamento (cartas que o jogador está utilizando).
Modificadores (podem ser positivos ou negativos).


Objetivo do Aplicativo:
Crie um aplicativo que permita registrar o progresso de até 6 jogadores. Para cada jogador, o aplicativo deve exibir e permitir ajustar os seguintes valores:

Nome do jogador: Campo de texto para editar o nome.
Level do jogador: Exibido em formato de texto, com botões "+" e "-" para aumentar ou diminuir o nível.
Poder total: Exibido como a soma do level, bônus de equipamento e modificadores.
Bônus de Equipamento: Exibido em formato de texto, com botões "+" e "-" para ajustar o valor.
Modificadores: Exibido em formato de texto, com botões "+" e "-" para ajustar o valor.


Requisitos Detalhados:
Para cada jogador, deve haver:
Um campo TextField que permita editar o nome do jogador.
Um Text que exiba o level atual do jogador, com botões "+" e "-" para ajustar o valor do level.
Um Text que exiba o poder total do jogador, calculado automaticamente com base na soma do level, bônus de equipamento e modificadores.
Um Text que exiba o valor de bônus de equipamento, com botões "+" e "-" para ajustar esse valor.
Um Text que exiba o valor dos modificadores, com botões "+" e "-" para ajustar o valor.
O poder total do jogador deve ser atualizado dinamicamente conforme o jogador altera o seu level, bônus de equipamento ou modificadores.
Limite o level para um mínimo de 1 e um máximo de 10 (limite para vitória no jogo).
