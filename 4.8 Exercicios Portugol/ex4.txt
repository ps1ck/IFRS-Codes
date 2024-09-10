Faça um programa que receba o preço de um produto, calcule e mostre 
o novo preço, sabendo-se que este sofreu um desconto de 10%. Por 
exemplo, se o produto custa R$ 100,00, o novo preço será 100 menos 
10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o 
novo preço R$ 90,00.

Algoritmo "Exercício 4"
var
vlrProduto, desconto, vlrFinal :real
início
    leia vlrProduto
    desconto <- 0.10
    vlrFinal <- vlrProduto - (vlrProduto * desconto)
    escreva vlrFinal
fim