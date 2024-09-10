Faça um programa que receba três notas e seus respectivos pesos, 
calcule e mostre a média ponderada dessas notas. Para calcular a 
média ponderada, multiplique cada nota por seus respectivos pesos, 
some todos os resultados e divida pela soma dos pesos. Por exemplo, 
se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, a média final do 
estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38.
Esse valor deve ser dividido pela soma dos pesos (6), resultando em 6,3. 
 

Algoritmo "Exercício 7"
var 
    n1,n2,n3,mediaFinal :real 
    p1,p2,p3,somaPesos :inteiro
início
    leia n1,n2,n3 
    leia p1,p2,p3 
    somaPesos <- p1 + p2 + p3 
    mediaFinal <- ((n1*p1) + (n2*p2) + (n3*p3)) / somaPesos
    escreva mediaFinal
fim
