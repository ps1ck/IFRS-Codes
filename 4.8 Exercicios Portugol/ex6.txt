Um funcionário recebe um salário fixo mais 4% de comissão sobre as 
vendas (4% do valor das vendas efetuadas pelo funcionário). Faça um 
programa que receba o salário fixo do funcionário e o valor de suas 
vendas, calcule e mostre a comissão e seu salário final. 

Algoritmo "Exercício 6"
var 
    salariofx, valorVendas, comissao, Sfinal :real
início
    leia salariofx, valorVendas
    comissao <- valorVendas * 0.04
    Sfinal <- salariofx + comissao 
    escreva comissao 
    escreva salariofx 
fim