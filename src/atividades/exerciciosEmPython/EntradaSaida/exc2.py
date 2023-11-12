#Faça um algoritmo para ler os coeficiente de uma equação do segundo grau e escrever o valor do seu Delta.

print("Entre com três coeficientes da equação de segundo grau (ax²+bx+c): ")

a = float(input("Entre com o primeiro coeficiente (ax²): "))
b = float(input("Entre com o segundo coeficiente (bx): "))
c = float(input("Entre com o primeiro coeficiente (c): "))
delta = (b * b - 4 * a * c)

print("O delta da equação é :", delta)
