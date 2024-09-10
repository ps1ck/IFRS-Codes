Sabe-se que: 
1 pé = 12 polegadas 
1 jarda = 3 pés 
1 milha = 1.760 jardas 
Faça um programa que receba uma medida em pés , faça as 
conversões a seguir e mostre os resultados. 
a. polegadas; 
b. jardas; 
c. milhas.

Algoritmo "Exercício 10"
var 
    medidaEmPe, vlrPolegadas, vlrJardas, vlrMilhas :real 
início
    leia medidaEmPe 
    vlrPolegadas <- medidaEmPe * 12
    vlrJardas <- medidaEmPe / 3 
    vlrMilhas <- (medidaEmPe / 3) / 1760 

    escreva vlrPolegadas
    escreva vlrJardas
    escreva vlrMilhas
fim