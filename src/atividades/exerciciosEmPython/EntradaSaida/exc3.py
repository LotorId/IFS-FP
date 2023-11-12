#Faça um algoritmo para ler os catetos de um triângulo retângulo e escrever a sua hipotenusa.

print("Entre com os valores dos catetos para descobrir sua hipotenusa: ")

c1 = float(input("Entre com o primeiro cateto: "))
c2 = float(input("Entre com o segundo cateto: "))
hipotenusa = pow((c1 * c1 + c2 * c2), 0.5)

print("O valor da hipotenusa é:", hipotenusa)
