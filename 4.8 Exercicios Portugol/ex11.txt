Faça um programa que receba o ano de nascimento de uma pessoa e o 
ano atual, calcule e mostre: 
a. a idade dessa pessoa em anos; 
b. a idade dessa pessoa em meses; 
c. a idade dessa pessoa em dias (considerando que cada ano 
possui 365 dias); 
d. a idade dessa pessoa em semanas (cada ano possui 52 
semanas). 

Algoritmo "Exercício 11"
var 
    anoNas,anoAtual,idadeAnos,idadeMeses,idadeDias,idadeSemanas :inteiro
início 
    leia anoNas, anoAtual
    
    idadeAnos <- anoAtual - anoNas 
    idadeMeses <- (anoAtual * 12) - (anoNas * 12)
    idadeDias <- (anoAtual * 365) - (anoNas * 365)
    idadeSemanas <- (anoAtual * 48) - (anoNas * 48)

    escreva idadeAnos 
    escreva idadeMeses
    escreva idadeDias
    escreva idadeSemanas
fim