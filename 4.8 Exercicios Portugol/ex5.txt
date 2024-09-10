Faça um programa que receba o salário base de um funcionário, calcule 
e mostre o salário a receber, sabendo-se que o funcionário tem 
gratificação de 5% sobre o salário base (que será acrescentado ao 
salário) e paga imposto de 7% sobre este salário (o que será 
descontado do salário). 

Algoritmo "Exercício 5"
var
salarioBase, salarioAreceber :real
início
    leia salarioBase
    salarioAreceber <- (salarioBase + (salarioBase * 0.05)) - (salarioBase * 0.07)
    escreva salarioAreceber 
fim 
    