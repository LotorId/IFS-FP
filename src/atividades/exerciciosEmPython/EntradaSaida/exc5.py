#Faça um algoritmo para ler o preço de compra e o percentual de lucro desejado por um vendedor e
#calcular o preço de venda.

print("Insira os valores (compra e lucro) para cacular o valor de venda")

compra = float(input("Insira o valor do produto: "))
lucro = float(input("Insira o percentual de lucro: "))
venda = (compra * (lucro / 100)) + compra

print("O valor de venda do produto deve ser: R$", venda)
