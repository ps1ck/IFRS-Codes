Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. 
Faça um programa que receba o valor do salário mínimo e a quantidade 
de quilowatts consumida por uma residência, calcule e mostre: 
a. o valor de cada quilowatt; 
b. o valor a ser pago por essa residência; 
c. o valor a ser pago com desconto de 15%. 

Algoritmo "Exercício 14"
var 
    salarioMin, consumo, vlrQW, vlrRes, vlrFinal :real
início 
    leia salarioMin, consumo
    vlrQW <- salarioMin / 5
    vlrRes <- consumo * vlrQW 
    vlrFinal <- vlrRes * 0.15

    escreva vlrQW
    escreva vlrRes
    escreva vlrFinal
fim