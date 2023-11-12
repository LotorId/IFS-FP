#Faça um algoritmo para ler um número inteiro e informar se o número é par ou ímpar.

n = int(input("Entre com um número inteiro para saber se ele é par ou impar: "))

if (n % 2) == 0:
    print("O número é par!")
else:
    print("O número é impar!")