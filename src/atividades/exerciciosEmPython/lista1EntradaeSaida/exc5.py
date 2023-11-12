# Faça um programa que calcule e mostre o valor de uma prestação em atraso,
# utilizando a fórmula: P = V + V* J/100 * T onde P é o valor da prestação, V é o
# valor da compra, J é a taxa e T é o tempo.

print("Para calcular o valor de uma prestação em atrasada, insira!")
v = float(input("O valor da compra: "))
j = float(input("O valor da taxa: "))
t = float(input("O tempo de atraso (em dias): "))

p = v + (v * (j / 100) * t)

print("O valor da prestação atrasada é de: R$", p)
