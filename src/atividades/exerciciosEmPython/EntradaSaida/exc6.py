#Faça um algoritmo para ler duas variáveis inteiras e trocar o seu conteúdo.

n1 = int(input("Insira um número inteiro para n1: "))
n2 = int(input("Insira um número interi para n2: "))

temp = n1
n1 = n2
n2 = temp

print("Agora n1 é ", n1, "e n2 é", n2)
