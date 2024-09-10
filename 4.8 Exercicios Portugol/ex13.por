Faça um programa que receba o número de horas trabalhadas e o valor 
do salário mínimo, calcule e mostre o salário a receber seguindo estas 
regras: 
a. a hora trabalhada vale um décimo do salário mínimo; 
b. o salário bruto equivale ao número de horas trabalhadas 
multiplicado pelo valor da hora trabalhada; 
c. o imposto equivale a 3% do salário bruto; 
d. o salário a receber equivale ao salário bruto menos o imposto. 

Algoritmo "Exercício 13"
var
    nmrHorasT,salarioMin,salarioFinal,vlrHora,salarioBruto,imposto :real
início
    leia nmrHorasT,salarioMin
    vlrHora <- nmrHorasT * (salarioMin / 10)
    salarioBruto <- nmrHorasT * vlrHora
    imposto <- salarioBruto * 0.03
    salarioFinal <- salarioBruto - imposto 
    escreva salarioFinal
fim
