#Faça um algoritmo para ler o valor do saque realizado pelo cliente de um banco e escrever
#quantas notas de cada valor serão necessárias para atender ao saque com a menor quantidade de
#notas possível. Serão utilizadas notas de 100, 50, 20, 5 e 1 reais.

saque = float(input("Insira o valor do saque: "))

n100 = saque // 100
resto = saque % 100
n50 = resto // 50
resto = saque % 50
n20 = resto // 20
resto = saque % 20
n10 = resto // 10
resto = saque % 10
n5 = resto // 5
resto = saque % 5
n1 = resto // 1

print("")
print("A melhor opção de saque é: ")
print("Notas de 100: ", n100)
print("Notas de 50: ", n50)
print("Notas de 20: ", n20)
print("Notas de 10: ", n10)
print("Notas de 5: ", n5)
print("Notas de 1: ", n1)
