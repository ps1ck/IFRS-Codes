O custo ao consumidor de um carro novo é a soma do preço de fábrica 
com o percentual de lucro do distribuidor e dos impostos aplicados ao 
preço de fábrica. Faça um programa que receba o preço de fábrica de 
um veículo, o percentual de lucro do distribuidor e o percentual de 
impostos, calcule e mostre: 
a. o valor correspondente ao lucro do distribuidor; 
b. o valor correspondente aos impostos; 
c. o preço final do produto. 

Algoritmo "Exercício 12"
var 
    pLucroDist, pImpostos :inteiro
    pFabrica, vlrLucroDist, vlrImpostos, vlrFinal :real 
início 
    leia pFabrica, pLucroDist, pImpostos
    vlrLucroDist <- pFabrica * (pLucroDist /100) 
    vlrImpostos <- pFabrica * (pImpostos /100)
    vlrFinal <- pFabrica + vlrLucroDist + vlrImpostos

    escreva vlrLucroDist
    escreva vlrImpostos
    escreva vlrFinal
fim